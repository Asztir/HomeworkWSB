import java.util.Scanner;

public class Exercises2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer aNumber = scan.nextInt();
        System.out.println("Enter b number: ");
        Integer bNumber = scan.nextInt();

        System.out.println("Sum number is " + (aNumber + bNumber));

    }
}
