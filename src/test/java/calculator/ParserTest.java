package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ParserTest {

    Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser();
    }

    @Test
    public void getFalseIfInputIsNullOrEmptyTest(){
        assertThat(parser.isEmptyOrNull(" ")).isEqualTo(false);
        assertThat(parser.isEmptyOrNull(null)).isEqualTo(false);
        assertThat(parser.isEmptyOrNull("Hi Hello")).isEqualTo(true);
    }

    @Test
    public void splitCommaTest(){
        assertThat(parser.splitByBlank("Hello World")[0]).isEqualTo("Hello");
        assertThat(parser.splitByBlank("Hello World")[1]).isEqualTo("World");
    }
}