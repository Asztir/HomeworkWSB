import java.util.Scanner;

public class Exercises63 {
    /*public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        int x = in.nextInt();
        System.out.print("Input second number: ");
        int y = in.nextInt();
       /* if (x>y){
            System.out.println(x);
        } else if (x == y){
            System.out.println("0");
        } else if (y>x){
            System.out.println(y);
        } else if (x%6 == y%6 && x<y) {
            System.out.println(x);
        } else if (x%6 == y%6 && y<x) {
            System.out.println(y);
        }
    }*/
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first number : ");
        int a = in.nextInt();
        System.out.print("Input the second number: ");
        int b = in.nextInt();
        System.out.println("Result: "+result(a, b));
    }
    public static int result(int x, int y)
    {
        if(x == y)
            return 0;
        if(x % 6 == y % 6)
            return (x < y) ? x : y;
        return (x > y) ? x : y;
    }
}
