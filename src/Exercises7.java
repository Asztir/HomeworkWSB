import java.util.Scanner;

public class Exercises7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        Integer aNumber = scan.nextInt();

        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(aNumber + " x " + i + " = " + (aNumber * i));
        }
    }
}