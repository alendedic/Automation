package exercises;

import java.util.Scanner;

public class MessageCharacters {
    public static void main(String[] args) {
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
}
