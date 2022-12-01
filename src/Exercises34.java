import java.util.Scanner;

public class Exercises34 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Input the length of a side of the hexagon: ");
        Double s = scan.nextDouble();
        Double areaHexagon = (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
        System.out.println("The area of the hexagon is: " + areaHexagon);

    }
}
