import java.util.Scanner;

public class Eksponensial {

public static void main (String [] args) {
   int bilangan_1;
   int bilangan_2;
    Scanner input = new Scanner(System.in);


    System.out.println("Masukkan Nilai" );

    bilangan_1 = input.nextInt();
    bilangan_2 = input.nextInt();
    System.out.println("A= " + bilangan_1 );
    System.out.println("B= " + bilangan_2 );

    int Hasil = (int) Math.pow(bilangan_1,bilangan_2);

    System.out.println("Hasil Pangkatnya (" + bilangan_1 +"," + bilangan_2 + ")" + " = "+ Hasil);
}

}
