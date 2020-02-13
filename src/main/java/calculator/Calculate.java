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
        try{
            return a / b;
        }catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
        }
        return 0;
    }

    public int calculate(List<String> equation) {
        int result = Integer.parseInt(equation.get(0));
        for (int i = 1; i <= (equation.size())/2; i++) {
            switch (equation.get(2*i - 1)) {
                case "+":
                    result = result + Integer.parseInt(equation.get(i*2));
                    break;
                case "-":
                    result = result - Integer.parseInt(equation.get(i*2));
                    break;
                case "*":
                    result = result * Integer.parseInt(equation.get(i*2));
                    break;
                case "/":
                    result = result / Integer.parseInt(equation.get(i*2));
                    break;
            }
        }
        return result;
    }
}
