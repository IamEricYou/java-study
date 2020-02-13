package calculator;

import com.sun.tools.javac.util.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {

    private static final String BLANK_PATTERN = "\\s* \\s*";
    private static final String BLANK = " ";
    public boolean isNotEmpty(List<String> text) {
        if(text.contains(null) || text.contains("")){
            return false;
        }
        return true;
    }

    public List<String> splitByBlank(String text) {
        //List.of() needs 1.9+
        //Arrays.asList returns a mutable list while the list returned by List.of is immutable

        return Arrays.asList(text.split(BLANK_PATTERN));
    }

    public List<String> getNumbersFromEquation(List<String> equation) {
        List<String> numList = new ArrayList<>();
        //Numbers are placed on only even index.
        for(int i = 0; i < equation.size(); i = i+2){
            numList.add(equation.get(i));
        }
        return numList;
    }

    public List<String> getOperatorsFromEquation(List<String> equation) {
        List<String> operatorList = new ArrayList<>();
        //Numbers are placed on only odd index.
        for(int i = 1; i < equation.size(); i = i+2){
            operatorList.add(equation.get(i));
        }
        return operatorList;
    }

    public List<Integer> convertStringListToIntList(List<String> stringNumList) {
        List<Integer> numList = new ArrayList<>();
        for(String numString : stringNumList){
            numList.add(Integer.parseInt(numString));
        }
        return numList;
    }
}
