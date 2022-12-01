import java.util.Scanner;

public class Exercises35 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the number of sides on the polygon: ");
        Double ns = scan.nextDouble();
        System.out.println("Input the length of one of the sides: ");
        Double side = scan.nextDouble();
        Double polygonArea = (ns * (side * side)) / (4.0 * Math.tan((Math.PI / ns)));
        System.out.println("The area of the hexagon is: " + polygonArea);
    }
}
