import java.util.Scanner;

public class Exercises53 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input first number: ");
        Integer firstNumber = scan.nextInt();
        System.out.println("Input second number: ");
        Integer secondNumber = scan.nextInt();
        System.out.println("Input third number: ");
        Integer thirdNumber = scan.nextInt();
        if(firstNumber < secondNumber && secondNumber < thirdNumber || thirdNumber > secondNumber){
            System.out.println("The result is: true");
        }
        else {
            System.out.println("False");
        }

    }
}
