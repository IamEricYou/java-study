package prac;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class PracticeTest {

    private Practice practice;

    //the first test runs before any other classes start
    @Before
    public void create(){
        practice = new Practice();
    }

    @Test
    public void addThreeNumbers() {
        assertThat(practice.addThreeNumbers(1,2,3)).isEqualTo(6);
    }
}