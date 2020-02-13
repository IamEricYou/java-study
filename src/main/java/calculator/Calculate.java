package calculator;

import java.util.ArrayList;
import java.util.List;

public class Calculate {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException e) {
            System.out.println("Do not divide by zero");
        }
        return 0;
    }

    public int calculate(List<Integer> numList, List<String> operatorList) {
        int result = numList.get(0);
        for (int i = 0; i < operatorList.size(); i++) {
            switch (operatorList.get(i)) {
                case "+":
                    result = add(result, numList.get(i+1));
                    break;
                case "-":
                    result = subtract(result, numList.get(i+1));
                    break;
                case "*":
                    result = multiply(result, numList.get(i+1));
                    break;
                case "/":
                    result = divide(result, numList.get(i+1));
                    break;
                default:
                    System.out.println("Error");
            }
        }
        return result;
    }
}
