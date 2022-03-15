public class Main {
    private static int hapusDuplikat(int[] angka) {
        int count = 0;
        for (int i = 0; i < angka.length; i++) {

            if (i < angka.length - 1 && angka[i] == angka[i + 1]) {
                continue;
            }

            angka[count] = angka[i];
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(hapusDuplikat(new int[]{2,3,3,3,6,9,9}));
        System.out.println(hapusDuplikat(new int[]{2, 2, 2, 11}));
    }
}
