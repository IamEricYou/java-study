package calculator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Scanner scanner = new Scanner(System.in);
        Parser parser = new Parser();

        List<String> value = parser.splitByBlank(scanner.nextLine());
        List<Integer> numbers = new ArrayList<>();
        List<String> operators = new ArrayList<>();
        int result = 0;

        if(parser.isNotEmpty(value)){
            numbers = parser.convertStringListToIntList(parser.getNumbersFromEquation(value));
            operators = parser.getOperatorsFromEquation(value);
            result = calculate.calculate(numbers,operators);
        }
        System.out.println(result);
    }
}
