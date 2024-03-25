package calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reads a line of text from the user.
        String line = scanner.nextLine();

        // Splits the line into an array of string numbers.
        String[] numbers = line.split(" ");

        // Parses the string numbers into integers.
        int num1 = Integer.parseInt(numbers[0]);
        int num2 = Integer.parseInt(numbers[1]);

        // Calculates the sum of the two numbers.
        int sum = num1 + num2;

        // Prints the sum to the standard output.
        System.out.println(sum);

        // Close the scanner to prevent resource leaks.
        scanner.close();
    }
}
