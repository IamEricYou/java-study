package calculator;

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

    public int calculate(String s) {
        String[] string = s.split(" ");
        int result = Integer.parseInt(string[0]);
        for (int i = 1; i <= (string.length)/2; i++) {
            switch (string[2*i - 1]) {
                case "+":
                    result = result + Integer.parseInt(string[i*2]);
                    break;
                case "-":
                    result = result - Integer.parseInt(string[i*2]);
                    break;
                case "*":
                    result = result * Integer.parseInt(string[i*2]);
                    break;
                case "/":
                    result = result / Integer.parseInt(string[i*2]);
                    break;
            }
        }
        return result;
    }
}
