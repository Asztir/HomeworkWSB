import java.util.Scanner;

public class Exercises13 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give width of rectangle: ");
        Double width = scan.nextDouble();

        System.out.println("Give height of rectangle: ");
        Double height = scan.nextDouble();

        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ")" + " = " + 2 * (width + height));
    }
}