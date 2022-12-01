public class Exercises15 {
    public static void main(String[] args) {
        Integer aVariable = 10;
        Integer bVariable = 20;

        System.out.println("Before swapping: a = " + aVariable + ", b = " + bVariable);

        Integer swap = aVariable;
        aVariable = bVariable;
        bVariable = swap;

        System.out.println("After swapping: a = " + aVariable + ", b = " + bVariable);

    }

}


