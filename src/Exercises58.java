import java.util.Scanner;

public class Exercises58 {
    // zamiana jednego słowa
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String sentence = in.nextLine();
        String newS = sentence.substring(0, 1).toUpperCase();
        String nameCapitalized = newS + sentence.substring(1);
        System.out.println(nameCapitalized);
    }*/

    // każdy wyraz z dużej litery
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input word: ");
        String sentence = in.nextLine();
        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            words[i] = firstLetter.toUpperCase() + restOfWord;
        }

        String result = String.join(" ", words);
        System.out.println(result);
    }
}
