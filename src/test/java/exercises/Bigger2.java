package exercises;

import java.util.Scanner;

public class Bigger2 {
    public static void main(String[] args) {
        System.out.println("Insert two number");
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        boolean number3 = number1 > number2;
        boolean number4 = number1 < number2;
        if (number1 > number2){
            System.out.println("The first number is greater than the second number. " + number3);
        } else if (number1 < number2) {
            System.out.println("Incorrect number. Try again.");
        } else {
            System.out.println("Numbers are equal.");
        }
    }
}
