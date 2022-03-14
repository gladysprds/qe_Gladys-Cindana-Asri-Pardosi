import java.util.ArrayList;
import java.util.List;

class Hewan{

    List<Integer > berat_hewan = new ArrayList<>();
}

class Mobil {
    List<Integer> muatan_mbl = new ArrayList<>();
    int total_muatan=0;
    int sisa;

    public void tambah_muatan(){
        int kapasitas_mbl = 2000;

        for( int jumlah : muatan_mbl){
            total_muatan = total_muatan + jumlah;
            sisa =  kapasitas_mbl-total_muatan;
        }
        if(total_muatan<=kapasitas_mbl){
            System.out.println("Jumlah Dari Semua Muatan Hewan Adalah: "+ total_muatan + " Masih ada sisa " + sisa);
        }else {
            System.out.println("Mohon maaf sis,muatannya sudah melebihi kapasitas,total muatan kamu : " +total_muatan+" padahal Kapasitas 4000");
        }
    }
}
public class Main {

    public static void main(String[] args) {
        Hewan hewan = new Hewan();
        System.out.println("Daftar Berat Hewan: ");

        hewan.berat_hewan.add(100);
        hewan.berat_hewan.add(500);
        hewan.berat_hewan.add(400);
        hewan.berat_hewan.add(4000);
        System.out.println(hewan.berat_hewan);
        Mobil mobil = new Mobil();

        mobil.muatan_mbl.add(100);
        mobil.muatan_mbl.add(500);
        mobil.muatan_mbl.add(400);
        mobil.muatan_mbl.add(4000);
        mobil.tambah_muatan();
    }

}
