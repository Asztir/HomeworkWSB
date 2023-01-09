import java.util.Scanner;

public class Exercises52 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        Integer firstNumber = scan.nextInt();
        System.out.println("Input second number: ");
        Integer secondNumber = scan.nextInt();
        System.out.println("Input third number: ");
        Integer thirdNumber = scan.nextInt();
        if(firstNumber + secondNumber == thirdNumber){
            System.out.println("The result is: true");
        }
        else System.out.println("First number added to a second number gives a different number then third");
    }
}
