package calculator;


import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTest {

    Calculate calculate;

    @Before
    public void setUp(){
        calculate = new Calculate();
    }

    @Test
    public void addtionTest() {
        int result = calculate.calculate("2 + 3");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void subtractionTest() {
        int result = calculate.calculate("10 - 4");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void addtionTestHasMoreNumber() {
        int result = calculate.calculate("3 + 3 + 5 - 7");
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void multiplyTest() {
        int result = calculate.calculate("3 * 5");
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void divideTest() {
        int result = calculate.calculate("15 / 3");
        assertThat(result).isEqualTo(5);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        int result = calculate.calculate("15 / 0");
    }

}