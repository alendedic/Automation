package exercises;

import java.util.Scanner;

public class BiggerSmaller {
    public static void main(String[] args) {
        System.out.println("Insert two number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Bigger number is " + Math.max(number1,number2));
        System.out.println("Smaller number is " + Math.min(number1, number2));
    }
}
