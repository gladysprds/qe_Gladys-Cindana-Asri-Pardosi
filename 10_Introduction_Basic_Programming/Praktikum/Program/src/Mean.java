import java.util.Scanner;
public class Mean {

    public static void main(String[] args){
        int array[];
        int i;
        int n;


        array = new int[100];
        float mean;
        float jumlah=0;
        Scanner scan = new Scanner(System.in);
        System.out.print("Masukkan banyaknya elemen array: ");
        n = scan.nextInt();
        for(i = 1; i <= n; i++){
            System.out.print("Nilai Ke-"+ i +" : ");
            array[i] = scan.nextInt();
            jumlah = jumlah + array[i];
        }
        mean = jumlah/n;
        System.out.println("Hasil rata-rata adalah : " + mean);
    }


}
