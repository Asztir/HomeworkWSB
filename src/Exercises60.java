import java.util.Scanner;

public class Exercises60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a String: ");
        String line = in.nextLine();
        String lineSplit [] = line.split(" ");
        System.out.println(lineSplit[lineSplit.length - 2]);

    }
}
