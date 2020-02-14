package prac;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PracticeTest {

    private Practice practice;

    //the first test runs before any other classes start
    @Before
    public void create(){
        practice = new Practice();
        System.out.println("Before");
    }

    @Test
    public void addThreeNumbersTest() {
        System.out.println("Addtion Test");
        assertThat(practice.addThreeNumbers(1,2,3)).isEqualTo(6);
    }

    //This annotation forces not to run the particular method.
    @Ignore
    @Test
    public void subtractThreeNumbersTest() {
        System.out.println("Subtraction Test");
        assertThat(practice.subtractThreeNumbers(10,5,3)).isEqualTo(2);
    }

    @After
    public void close(){
        System.out.println("close");
    }
}