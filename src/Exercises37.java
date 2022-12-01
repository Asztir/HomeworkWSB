import java.util.Scanner;

public class Exercises37 {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input a string: ");
        char[] letters = scan.nextLine().toCharArray();
        System.out.print("Reverse string: ");
        for (int i = letters.length - 1; i >= 0; i--) {
            System.out.print(letters[i]);
        }
    }
}
