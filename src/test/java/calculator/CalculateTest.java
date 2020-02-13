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

    @Before
    public void setUp(){
        calculate = new Calculate();
        parser = new Parser();
        equation = new ArrayList<String>();
    }

    @Test
    public void addtionTest() {
        equation = parser.splitByBlank("4 + 7");
        int result = calculate.calculate(equation);
        assertThat(result).isEqualTo(11);
    }

    @Test
    public void subtractionTest() {
        equation = parser.splitByBlank("10 - 3");
        int result = calculate.calculate(equation);
        assertThat(result).isEqualTo(7);
    }

    @Test
    public void addtionTestHasMoreNumber() {
        equation = parser.splitByBlank("4 + 7 + 10");
        int result = calculate.calculate(equation);
        assertThat(result).isEqualTo(21);
    }

    @Test
    public void multiplyTest() {
        equation = parser.splitByBlank("4 * 7");
        int result = calculate.calculate(equation);
        assertThat(result).isEqualTo(28);
    }

    @Test
    public void divideTest() {
        equation = parser.splitByBlank("35 / 7");
        int result = calculate.calculate(equation);
        assertThat(result).isEqualTo(5);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        equation = parser.splitByBlank("4 / 0");
        int result = calculate.calculate(equation);
    }

}