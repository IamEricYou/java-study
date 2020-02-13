package calculator;

import java.util.Arrays;
import java.util.List;

public class Parser {

    public boolean isNotEmptyOrNull(String s) {
        //try to invoke it on a null reference, I'll get a NullPointerException.
        if(s == null || s.equals(" ")){
            return false;
        }
        return true;
    }

    public List<String> splitByBlank(String text) {

        return Arrays.asList(text.split("\\s* \\s*"));
    }
}
