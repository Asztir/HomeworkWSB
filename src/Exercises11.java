import java.util.Scanner;

public class Exercises11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Give the Radius of circle:");
        Double radius = scan.nextDouble();
        System.out.println("Perimeter is : " + (2 * Math.PI * radius));
        System.out.println("Area is :" + (Math.PI * (radius * radius)));


    }
}
