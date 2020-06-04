package main.java.com.simpledb.app;

import java.util.Scanner;

public class App {
    private static final String PROMPT_STRING = "db > ";
    private static final String DOT = ".exit";
    private static final int EXIT_SUCCESS = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String inputCommand = readInput(scanner);
            if(inputCommand.startsWith(DOT)) {
                System.exit(EXIT_SUCCESS);;
            } else {
                System.out.printf("Unrecognized command: '%s'\n", inputCommand);
            }
        }
    }

    private static String readInput(Scanner scanner) {
        print_prompt();
        return scanner.nextLine();
    }

    private static void print_prompt() {
        System.out.printf(PROMPT_STRING);
    }
}