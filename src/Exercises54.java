import java.util.Scanner;

public class Exercises54 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        Integer firstNumber = scan.nextInt();
        Integer first = firstNumber%10;
        System.out.println("Input second number: ");
        Integer secondNumber = scan.nextInt();
        Integer second = secondNumber%10;
        System.out.println("Input third number: ");
        Integer thirdNumber = scan.nextInt();
        Integer third = thirdNumber%10;
        boolean test = (first==second)|| (second==third) || (first==third);
        System.out.println("The last digit of at least two numbers are the same: " + test);
    }
}
