import java.util.Scanner;



public abstract class Exercises61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringBuilder word = new StringBuilder();

        System.out.print("Input a word: ");
        word.append(in.nextLine());

        System.out.println(word.reverse());

    }

}
