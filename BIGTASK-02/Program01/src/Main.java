import java.util.Scanner;

public class Main {

        public static void main (String args[])
        {
            Scanner input = new Scanner(System.in);
            int jumlah_baris;
            int jumlah_kolom;
            int jumlah_bintang;

            System.out.println("Silahkan Masukkan angka yang anda inginkan: ");
            int number = input.nextInt();

            for(jumlah_baris = 1;jumlah_baris <= number;jumlah_baris ++)
            {
                for(jumlah_kolom = 1;jumlah_kolom <= jumlah_baris;jumlah_kolom ++)
                {
                    System.out.print(" ");
                }
                for(jumlah_bintang = number;jumlah_bintang >= jumlah_baris;jumlah_bintang --)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }

            for(jumlah_baris = 1;jumlah_baris <= number;jumlah_baris ++)
            {
                for(jumlah_kolom = number;jumlah_kolom >= jumlah_baris;jumlah_kolom --)
                {
                    System.out.print(" ");
                }
                for(jumlah_bintang = 1;jumlah_bintang <= jumlah_baris;jumlah_bintang ++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
}
