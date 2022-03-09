

import java.util.Scanner;

public class Luas_Segitiga {
//Tipe 1== value setiap variable langsung diassign di program
   // public static void main(String[] args){
   // double luas; // merupakan tipe datayang digunakan untuk menyimpan angka yang desimal dalam ukuran kecil
    //float alas= 20; // tipe data float merupakan tipe data yang digunakan untuk menyimpan angka desimal ukuran besar
        //sehingga ketika variable luas diassign dengan variable double,akan terjadi error
   // float tinggi= 15;


        //luas = 0.5 * alas * tinggi;

       // System.out.println("Luas segitiga adalah " +luas);
    //}


//Tipe 2==menggunakan inputan dengan Scanner,sehingga seperti yang dilihat di paling atas terdapat pengimportan library untuk scanner
    public static void main (String [] args){

    Scanner input = new Scanner(System.in);

    int alas,tinggi;
    double  luas;


    System.out.println("Silahkan masukkan alas");

    alas= input.nextInt();

    System.out.println("Silahkan masukkan tinggi");

    tinggi= input.nextInt();

    luas= 0.5*alas*tinggi;
        System.out.println("Luas Segitiga anda adalah : " + luas);
    }
}
