package basic;

import java.util.Scanner;

public class Ifs {
    /*
    if (condition) {
      }
      Scanner
     */
    public static void main(String[] args) {
       /* System.out.println("Insert number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        scanner.close();
        System.out.println("Your number is " + number);

        if (number % 2 == 0) {

            System.out.println("Paran broj");
        }*/

    /*
    2.Zadatak
    Osnovica zarade je 1000. Ukoliko je zaposleni odstvario kvotu od minimum 10 prodaja, plata mu se uvecava 250e
    Istampati platu zaposlenog.
     */

        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How is it");
        Scanner scanner1 = new Scanner(System.in);
        int actualSales = scanner1.nextInt();
        scanner1.close();
        if (actualSales >= quota) {
            salary=salary+bonus;
        }
        System.out.println("Your salary is " + salary);
    }

    }

