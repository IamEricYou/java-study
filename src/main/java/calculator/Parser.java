package calculator;

import java.util.Arrays;
import java.util.List;

public class Parser {

    private final String BLANK_PATTERN = "\\s* \\s*";
    private final String BLANK = " ";
    public boolean isNotEmpty(String s) {
        //try to invoke it on a null reference, I'll get a NullPointerException.
        if(s == null || s.equals(BLANK)){
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
