import java.util.Scanner;

public class Practise {

   public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
       absoluteValue();
       bigger();
       bigger2();
       biggerSmaller();
       escaping();
       functionSolver();
       mathCalculations();
       messageCharacters();
       printCalculation();
       printStars();
       scanner.close();
    }
    public static void absoluteValue() {
        System.out.println("Insert number");
        int number = scanner.nextInt();
        System.out.println(Math.abs(number));
    }

    public static void bigger() {
        System.out.println("Insert two numbers");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Bigger number is " + Math.max(number1,number2));
    }

    public static void bigger2() {
        System.out.println("Insert two numbers");
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

    public static void biggerSmaller() {
        System.out.println("Insert two number");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        System.out.println("Bigger number is " + Math.max(number1,number2));
        System.out.println("Smaller number is " + Math.min(number1, number2));
    }

    public static void escaping() {
        System.out.println(" Name" + "   Height" +"   Gender");
        System.out.println("----------------------");
        System.out.println("Anna" + "   5\'4\"" + "     F");
        System.out.println("Test" + "   6\'2\"" + "     M");
        System.out.println("Ben" + "    5\'7\"" + "     M");
    }

    public static void functionSolver() {
        System.out.println("Insert the number:");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        if (0 <= x && x <= 100) {
            System.out.println("f(x)= " + (2 * x));
            System.out.println("g(x)= " + Math.pow(x,2));
        } else {
            System.out.println("f(x)=  " + 0);
            System.out.println("g(x)=  " + 0);
        }
    }

    public static void mathCalculations() {
        double a = 2.8;
        double b = 3.1;
        double c = 6.0;
        int x=2;
        System.out.println(a+b);
        System.out.println(Math.abs(a));
        System.out.println(Math.round(a));
        System.out.println(Math.ceil(a));
        System.out.println(Math.floor(a));
        System.out.println(Math.exp(a));
        System.out.println(Math.max(a,b));
        System.out.println(Math.min(a,b));
        System.out.println(Math.pow(x,c));
    }

    public static void messageCharacters() {
        System.out.println("Insert sentence");
        Scanner scanner = new Scanner(System.in);
        String sentence = scanner.nextLine();
        int lengthOfSentece = sentence.length();
        if (lengthOfSentece >= 6 && lengthOfSentece <= 10){
            System.out.println(sentence);
        } else {
            System.out.println("Incorrect sentence");
        }
    }

    public static void printCalculation() {
        System.out.println("     299");
        System.out.println("+    800");
        System.out.println("--------");
        System.out.println("    1099");
    }

    public static void printStars() {
        System.out.println("Insert a number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        String message = switch (number) {
            case 1 -> "*";
            case 2 -> "**";
            case 3 -> "***";
            case 4 -> "****";
            case 5 -> "*****";
            case 6 -> "*******";
            default -> "invalid number ";
        };
        System.out.println("The number stars is " + message);
    }
}
