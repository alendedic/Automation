package basic;

import java.util.Scanner;

public class NestedIfs {
    /*

        //Da bi se kvalifikovao za pozajmicu, osoba mora zaradjivati minimum 30 000 dolara i raditi u firmi minimum 2g.

     */
    public static void main(String[] args) {
        int minYears = 2 ;
        int minSalary = 30000;
        System.out.println("How much is your sallary?");
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many years you work here?");
        int currentSalary = scanner.nextInt();
        int currentYears = scanner.nextInt();
        scanner.close();
        if (minSalary <= currentSalary) {
            if (currentYears >= minYears){
                System.out.println("You are  qualified");
            } else {
                System.out.println("You are not qualified, you need " + minYears);
            }
        } else {
            System.out.println("You are not qualified,you need " + minSalary) ;
        }
    }
}
