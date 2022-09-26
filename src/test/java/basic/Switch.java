package basic;

import java.util.Scanner;

public class Switch {
    /*
    switch(expression) {
    case val 1 :
             statement;
             break;
    case val 2:
    statement2;
    break;
    dafault:
    statement default
    ......................

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
            Zadatak..
            // promt user "Enter your grade"
            // A -> "Bravo"
            // b --> "Not bad"
            // C --> "Not greate not terible"
            // D --> "You can do better"
            // F --> "Fail"
            // default --> "Invalid grade"
     */
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        String message = switch (grade) {
            case "A" -> "Bravo";
            case "B" -> "Not bad";
            case "C" -> "Not great not terrible";
            case "D" -> "You can do better";
            case "F" -> "Fail";
            default -> "invalid grade";
        };
        System.out.println(" Your message is " + message);
    }
    }