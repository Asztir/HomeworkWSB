import java.util.Scanner;

public class Exercises12 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give first number: ");
        Double firstNumber = scan.nextDouble();

        System.out.println("Give second number: ");
        Double secondNumber = scan.nextDouble();

        System.out.println("Give third number: ");
        Double thirdNumber = scan.nextDouble();

        System.out.println("Average of three numbers: " + ((firstNumber + secondNumber + thirdNumber) / 3));

    }
}
