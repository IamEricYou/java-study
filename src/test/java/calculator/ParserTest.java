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
    public void checkIfStringListIsEmptyOrNull(){
        equation.add("");
        equation.add(null);
        assertThat(parser.isNotEmpty(equation)).isEqualTo(false);
        assertThat(parser.isNotEmpty(equation)).isEqualTo(false);
    }

    @Test
    public void splitCommaTest(){
        List<String> testPhrase = parser.splitByBlank("Hello World");
        assertThat(testPhrase.get(0)).isEqualTo("Hello");
        assertThat(testPhrase.get(1)).isEqualTo("World");
    }

    @Test
    public void extractNumFromStringEquationTest(){
        equation = parser.splitByBlank("4 + 8 + 7");
        List<String> stringNum = parser.getNumbersFromEquation(equation);
        assertThat(stringNum.get(0)).isEqualTo("4");
        assertThat(stringNum.get(1)).isEqualTo("8");
        assertThat(stringNum.get(2)).isEqualTo("7");
    }

    @Test
    public void extractOperatorFromStringEquationTest(){
        equation = parser.splitByBlank("4 + 8 * 7");
        List<String> stringNum = parser.getOperatorsFromEquation(equation);
        assertThat(stringNum.get(0)).isEqualTo("+");
        assertThat(stringNum.get(1)).isEqualTo("*");
    }

    @Test
    public void convertStringListToIntListTest(){
        equation = parser.splitByBlank("4 5 9 0 1");
        List<Integer> number = parser.convertStringListToIntList(equation);
        assertThat(number.get(0)).isEqualTo(4);
        assertThat(number.get(2)).isEqualTo(9);
        assertThat(number.get(4)).isEqualTo(1);
    }
}