package ryu.test.io;

import java.util.Scanner;

public class ConsoleInput implements Input {

    private final Scanner scanner;

    public ConsoleInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public int getInt() {
        return scanner.nextInt();
    }
}
