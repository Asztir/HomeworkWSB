import java.util.Scanner;

public class Exercises33 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer number = scan.nextInt();

        System.out.println("The sum of the digits is: " + sumDigits(number));

    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
}

