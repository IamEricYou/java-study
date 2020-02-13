package calculator;

import org.junit.Before;
import org.junit.Test;

import java.util.Scanner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

public class ParserTest {

    private Parser parser;

    @Before
    public void setUp() throws Exception {
        parser = new Parser();
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
}