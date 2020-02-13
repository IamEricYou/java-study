package calculator;

public class Parser {

    public boolean isNotEmptyOrNull(String s) {
        if(s == null || s == " "){
            return false;
        }
        return true;
    }

    public String[] splitByBlank(String text) {
        return text.split(" ");
    }
}
