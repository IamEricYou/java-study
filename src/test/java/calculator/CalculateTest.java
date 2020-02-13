package calculator;


import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    private Calculate calculate;
    private Parser parser;
    private List<String> equation;
    private List<Integer> numList;
    private List<String> operatorList;

    @Before
    public void setUp(){
        calculate = new Calculate();
        parser = new Parser();
        //Diamond operator
        equation = new ArrayList<>();
        numList = new ArrayList<>();
        operatorList = new ArrayList<>();
    }

    @Test
    public void addtionTest() {
        equation = parser.splitByBlank("4 + 7 + 9 + 10");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
        assertThat(result).isEqualTo(30);
    }

    @Test
    public void subtractionTest() {
        equation = parser.splitByBlank("10 - 3");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void addtionTestHasMoreNumber() {
        equation = parser.splitByBlank("4 + 7 + 10");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void multiplyTest() {
        equation = parser.splitByBlank("4 * 7");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
        assertThat(result).isEqualTo(28);
    }

    @Test
    public void divideTest() {
        equation = parser.splitByBlank("35 / 7");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
        assertThat(result).isEqualTo(5);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        equation = parser.splitByBlank("4 / 0");
        numList = parser.convertStringListToIntList(parser.getNumbersFromEquation(equation));
        operatorList = parser.getOperatorsFromEquation(equation);
        int result = calculate.calculate(numList, operatorList);
    }

}