package basic;

import java.util.Scanner;

public class practise {
    /*
     public static void main(String[] args) {
        System.out.println("Number of items");
        Scanner scanner = new Scanner (System.in);
        int quality = scanner.nextInt();
        int total = 0;
        for ( int i = 0; i < quality ; i++) {
            System.out.println("Price of item " + (i+1));
            int price = scanner.nextInt();
            total += price;
        }

        System.out.println("Total is " + total);
   1. // User enter age
   Check if user is adult +18
    is adult
    is minor
   2. User enters year
   Check is leap year
   // T -< is leap
   // F --> is regular
   uslov - godina djeljiva sa 4
           nije djeljiva sa 100
       ili djeljiva sa 400

      !!!! Domaćiii !!!!
       // Promt koliko ima korisnika
       // Koliko imaju bodova
       // ako je imao >10 bravo, ako nije uci jos
     */

    public static void main(String[] args) {
        System.out.println("User enter age");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num >= 18) {
            System.out.println("User is adult");
        } else {
            System.out.println("User is minor");
        }
        System.out.println("User enter year");

        int year = scanner.nextInt();
        if ( year % 4 == 0 && year % 100 != 0 || year % 400 ==0) {
            System.out.println("Year is leap");
        } else {
            System.out.println("Year is regular");
        }
    }

    }

