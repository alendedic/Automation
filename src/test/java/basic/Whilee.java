package basic;

import java.util.Scanner;

public class Whilee {
    /*

    System.out.println("How many sales did you have");
        Scanner scanner = new Scanner (System.in);
        int actualSales = scanner.nextInt();
        int expectedSales = 10;
        scanner.close();
        if ( actualSales >= expectedSales ) {
            System.out.println("Bravo");
    public static void main(String[] args) {
        int number = 3;
        while (number <= 10) {
            System.out.println(number + " is smaller or equal to 10");
            number++;
        }
    } actualHours > naxHours
    //Invalid number. Insert number
    between 1 and 40
    // How many hours did you work last week?
    // int maxHour = 40;
    // int hourRate = 45;
    // int gross=?
    */

    public static void main(String[] args) {
        System.out.println("How many hours did you work last week");
        Scanner scanner = new Scanner (System.in);
        int maxHours=40;
        int hourRate=45;
        int actualHours = scanner.nextInt();
        while (actualHours > maxHours) {
            System.out.println("Invalid number. Insert number between 1 and 40");
            actualHours = scanner.nextInt();
        }
        int gross = actualHours * hourRate;
        System.out.println("Your gross is " + gross);
    }
}
