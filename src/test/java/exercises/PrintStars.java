package exercises;
import java.util.Scanner;
public class PrintStars {
    public static void main(String[] args) {
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