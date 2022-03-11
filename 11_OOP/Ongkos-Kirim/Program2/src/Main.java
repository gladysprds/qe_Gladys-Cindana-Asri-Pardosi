// jika dimensi barang 50cm3 dan beratnya 1kg er== RP5000
//// jika dimensi barang >50cm3 dan beratnya >1kg ==
/// untuk mnghitungnya 5000 X berat dan dimensi barang


import java.util.Scanner;

public class Main {


    public static void main (String [] args){

        Barang barang = new Barang();
        Scanner scanner = new Scanner(System.in);

        barang.nama_barang = "tas laptop";
        System.out.println("--------SELAMAT DATANG DI LAYANAN ONGKIR---------");
        System.out.println("Masukkan nama barang :");
        barang.nama_barang = scanner.next();

        //Masukkan tinggi
        System.out.println("Masukkan tinggi :");
        barang.tinggi_barang = scanner.nextInt();

        //Masukkan lebar
        System.out.println("Masukkan lebar :");
        barang.lebar_barang = scanner.nextInt();

        //Masukkan Panjang
        System.out.println("Masukkan panjang :");
        barang.panjang_barang = scanner.nextInt();


        //Masukkan Panjang
        System.out.println("Masukkan berat :");
        barang.berat_barang = scanner.nextInt();

        barang.dimensi_barang= barang.panjang_barang * barang.lebar_barang * barang.tinggi_barang;
        barang.bayar();



    }




}
