package basic;

import java.util.Scanner;

public class IfElse {

    /*
    if(condition) {
    //add or even
    // skener
    //store in number var
    //close scaner
    // print "Even number" if number is even
    // print "Odd number" if number is odd
    // n % 2 == 0
     */
    /*
    public static void main(String[] args) {
        int n;
        System.out.println("Insert number");
        Scanner scanner = new Scanner(System.in);
        int number=scanner.nextInt();
        scanner.close();
        if (number % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
        }
*/
    public static void main(String[] args) {
        /*
        // promt user("How many sales did you have")
        // scanner
        // store variable actualSales
        // expected sales = 10
        // > expected sales => Bravo
        // < "You can be better"
        // Koliko jos treba da doda da bi dostigao target!! DOMAĆI!
         */
        System.out.println("How many sales did you have");
        Scanner scanner = new Scanner (System.in);
        int actualSales = scanner.nextInt();
        int expectedSales = 10;
        scanner.close();
        if ( actualSales >= expectedSales ) {
            System.out.println("Bravo");
        } else {
            System.out.println("You can be batter");
    }
    }
}



