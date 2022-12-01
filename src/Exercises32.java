import java.util.Scanner;

public class Exercises32 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Integer firstNumber = scan.nextInt();
        System.out.println("Enter second number: ");
        Integer secondNumber = scan.nextInt();

        if (firstNumber == secondNumber) {
            System.out.println(firstNumber + " == " + secondNumber);
        }
        if (firstNumber != secondNumber) {
            System.out.println(firstNumber + " != " + secondNumber);
        }
        if (firstNumber < secondNumber) {
            System.out.println(firstNumber + " < " + secondNumber);
        }
        if (firstNumber <= secondNumber) {
            System.out.println(firstNumber + " <= " + secondNumber);
        }
        if (firstNumber > secondNumber) {
            System.out.println(firstNumber + " > " + secondNumber);
        }
        if (firstNumber >= secondNumber) {
            System.out.println(firstNumber + " >= " + secondNumber);
        }
    }
}
