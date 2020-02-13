package calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
//        if(parser.isNotEmptyOrNull(input)){
//            System.out.println(calculate.calculate(input));
//        }
    }
}
