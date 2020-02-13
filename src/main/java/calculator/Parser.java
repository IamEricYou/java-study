package calculator;

public class Parser {

    public boolean isNotEmptyOrNull(String s) {
        //try to invoke it on a null reference, I'll get a NullPointerException.
        if(s == null || s.equals(" ")){
            return false;
        }
        return true;
    }

    public String[] splitByBlank(String text) {
        return text.split(" ");
    }
}
