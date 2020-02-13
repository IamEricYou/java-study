package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;
    private List<String> equation;

    @Before
    public void setUp() throws Exception {
        parser = new Parser();
        equation = new ArrayList<>();
    }

    @Test
    public void getFalseIfInputIsNullOrEmptyTest(){
        assertThat(parser.isNotEmpty(" ")).isEqualTo(false);
        assertThat(parser.isNotEmpty(null)).isEqualTo(false);
        assertThat(parser.isNotEmpty("Hi Hello")).isEqualTo(true);
    }

    @Test
    public void splitCommaTest(){
        assertThat(parser.splitByBlank("Hello World").get(0)).isEqualTo("Hello");
        assertThat(parser.splitByBlank("Hello World").get(1)).isEqualTo("World");
    }

    @Test
    public void extractNumFromStringEquationTest(){
        equation = parser.splitByBlank("4 + 8 + 7");
        assertThat(parser.getNumbersFromEquation(equation).get(0)).isEqualTo("4");
        assertThat(parser.getNumbersFromEquation(equation).get(1)).isEqualTo("8");
        assertThat(parser.getNumbersFromEquation(equation).get(2)).isEqualTo("7");
    }

    @Test
    public void extractOperatorFromStringEquationTest(){
        equation = parser.splitByBlank("4 + 8 * 7");
        assertThat(parser.getOperatorsFromEquation(equation).get(0)).isEqualTo("+");
        assertThat(parser.getOperatorsFromEquation(equation).get(1)).isEqualTo("*");
    }

    @Test
    public void convertStringListToIntListTest(){
        equation = parser.splitByBlank("4 5 9 0 1");
        assertThat(parser.convertStringListToIntList(equation).get(0)).isEqualTo(4);
        assertThat(parser.convertStringListToIntList(equation).get(2)).isEqualTo(9);
        assertThat(parser.convertStringListToIntList(equation).get(4)).isEqualTo(1);
    }
}