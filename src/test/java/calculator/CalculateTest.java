package calculator;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

public class CalculateTest {

    @Before
    public void create(){
        Calculate calculate2 = new Calculate();
    }

    @Test
    public void addtionTest() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("2 + 3");
        assertThat(result).isEqualTo(5);
    }

    @Test
    public void subtractionTest() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("10 - 4");
        assertThat(result).isEqualTo(6);
    }

    @Test
    public void addtionTestHasMoreNumber() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("3 + 3 + 5 - 7");
        assertThat(result).isEqualTo(4);
    }

    @Test
    public void multiplyTest() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("3 * 5");
        assertThat(result).isEqualTo(15);
    }

    @Test
    public void divideTest() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("15 / 3");
        assertThat(result).isEqualTo(5);
    }

    @Test(expected = ArithmeticException.class)
    public void divideByZeroTest() {
        Calculate calculate = new Calculate();
        int result = calculate.calculate("15 / 0");
    }
}