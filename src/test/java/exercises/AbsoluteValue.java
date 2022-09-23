package exercises;

import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        System.out.println("Insert number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println(Math.abs(number));
    }
}
