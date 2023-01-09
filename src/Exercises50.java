public class Exercises50 {
    public static void main(String[] args) {

        int[] tablica = new int[100];

        for (int i = 1; i <= 99; i++)
            tablica[i] = i;
        for (int i = 1; i <= 99; i++) {
            if (tablica[i] % 3 == 0) {
                System.out.println("Divided by 3: " + tablica[i]);
            }
        }
        for (int i = 1; i <= 99; i++) {
            if (tablica[i] % 5 == 0) {
                System.out.println("Divided by 5: " + tablica[i]);
            }
        }
        for (int i = 1; i <= 99; i++) {
            if (tablica[i] % 3 == 0 && tablica[i] % 5 == 0) {
                System.out.println("Divided by 3 and 5 : " + tablica[i]);
            }
        }
    }
}