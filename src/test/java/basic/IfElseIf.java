package basic;

import java.util.Scanner;

public class IfElseIf {
    /*
    System.out.println("How many sales did you have");
        Scanner scanner = new Scanner (System.in);
        int actualSales = scanner.nextInt();
        int expectedSales = 10;
        scanner.close();
        if ( actualSales >= expectedSales ) {
            System.out.println("Bravo");
        } else {
            System.out.println("You can be batter");
            //promt "What was your test score"
            // store in score
            // <60 f
            // <70 D
            // <80 C
            // <90 B
            else A
     */
    public static void main(String[] args) {
/*
DOMAĆI - Napraviti suport da prima decimalne brojeve.
 */
        System.out.println("What was your test score");
        Scanner scaner = new Scanner(System.in);
        int score = scaner.nextInt();
        char grade;
        scaner.close();
        if (score < 60) {
            grade='F';
        } else if (score < 70) {
            grade='D';
        } else if (score < 80) {
            grade='C';
        } else if (score < 90) {
            grade='B';
        } else {
            grade='A';
        }
        System.out.println("Your grade is " + grade);
    }
}
