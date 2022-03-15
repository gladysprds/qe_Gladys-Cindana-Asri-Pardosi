
public class Main {
    public static void main(String[] args) {
        int[] angka = { 1, 2, 3, 4, 6 };
        int target = 6;

        cariangka(angka, target);
    }

    private static void cariangka(int angka[], int target) {
        int indeks = -1;
        int indeks01 = -1;
        for (int x = 0; x < angka.length; x++) {
            for (int y = x + 1; y < angka.length; y++) {
                if ((angka[x] + angka[y]) == target) {
                    indeks = x;
                    indeks01 =y ;
                }
            }
        }
        System.out.println("Berikut adalah indeksnya [" + indeks + " , " + indeks01 + "]");
    }
}
