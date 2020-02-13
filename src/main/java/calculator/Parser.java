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
        //List.of() needs 1.9+
        //Arrays.asList returns a mutable list while the list returned by List.of is immutable
        return Arrays.asList(text.split("\\s* \\s*"));
    }
}
