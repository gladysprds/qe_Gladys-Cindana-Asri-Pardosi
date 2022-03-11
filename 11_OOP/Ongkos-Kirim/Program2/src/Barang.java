public class Barang {

    String nama_barang, kode_barang;
    int dimensi_barang,total_harga,berat_barang;
    int tinggi_barang,panjang_barang,lebar_barang;


    void bayar(){

        if (dimensi_barang<=50 && berat_barang<=1){

            total_harga = 5000;

        }else if (dimensi_barang>=50 && berat_barang>=1){
            total_harga = 5000* dimensi_barang/50 * berat_barang ;

        }else {
            total_harga=5000;
        }
        System.out.println(" Total Harga Barang " + nama_barang + " " +total_harga);
    }




}
