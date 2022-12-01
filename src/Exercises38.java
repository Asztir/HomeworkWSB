import java.util.Scanner;

public class Exercises38 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = scan.nextLine().toCharArray();
        int letter = 0;
        int space = 0;
        int number = 0;
        int other = 0;
        for (int i = 0; i < letters.length; i++) {
            if (Character.isLetter(letters[i])) {
                letter++;
            } else if (Character.isSpaceChar(letters[i])) {
                space++;
            } else if (Character.isDigit(letters[i])) {
                number++;
            } else {
                other++;
            }
        }
        System.out.println("letter: " + letter);
        System.out.println("space: " + space);
        System.out.println("number: " + number);
        System.out.println("other: " + other);
    }
}
