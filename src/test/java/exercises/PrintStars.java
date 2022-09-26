package exercises;

import java.util.Scanner;

public class PrintStars {
    public static void main(String[] args) {
        System.out.println("Insert number:");
        Scanner scanner = new Scanner(System.in);
        String number = scanner.next();
        String message;
        int number = scanner.nextInt();
        if (number == 1){
            System.out.println("*");
        } else if (number == 2) {
            System.out.println("**");
        } else if (number == 3) {
            System.out.println("***");
        } else if (number == 4) {
            System.out.println("****");
        } else if (number == 5) {
            System.out.println("*****");
        } else if (number == 6) {
            System.out.println("******");
        } else {
            System.out.println("Incorrect insert");
        }
    }
}
