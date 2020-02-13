package calculator;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private static final String BLANK_PATTERN = "\\s* \\s*";
    private static final String BLANK = " ";
    public boolean isNotEmpty(String s) {
        //try to invoke it on a null reference, I'll get a NullPointerException.
        //Equals - compares two strings null-safe
        if(s == null || BLANK.equals(s)){
            return false;
        }
        return true;
    }

    public List<String> splitByBlank(String text) {
        //List.of() needs 1.9+
        //Arrays.asList returns a mutable list while the list returned by List.of is immutable

        return Arrays.asList(text.split(BLANK_PATTERN));
    }
}
