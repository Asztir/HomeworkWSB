import java.util.Scanner;

public class Exercises3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Double aNumber = scan.nextDouble();
        System.out.println("Enter b number: ");
        Double bNumber = scan.nextDouble();

        System.out.println("The result of the division is " + (aNumber / bNumber));
    }

}
