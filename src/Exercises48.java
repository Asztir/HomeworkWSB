public class Exercises48 {
    public static void main(String[] args) {

        int[] tablica = new int[100];

        for (int i = 1; i <= 99; i++)
            tablica[i] = i;
        for (int i = 1; i <= 99; i++) {
            if (tablica[i] % 2 != 0) {
                System.out.println("Tablica: " + tablica[i]);
            }
        }
    }
}
