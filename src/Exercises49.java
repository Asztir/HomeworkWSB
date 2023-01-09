import java.util.Scanner;

public class Exercises49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Input number: ");
        Integer number = scan.nextInt();
        if(number % 2 == 0){
            System.out.println("1");
        }
        else System.out.println("0");
    }
}
