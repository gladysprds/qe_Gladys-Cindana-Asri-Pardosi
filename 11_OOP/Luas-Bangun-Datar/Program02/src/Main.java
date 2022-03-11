import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        VolumBangunDatar volumBangunDatar = new VolumBangunDatar();

        volumBangunDatar.hitungVolume();

        //Kubus
        Kubus kubus = new Kubus();
        System.out.println("Masukkan sisi kubus anda :");
        kubus.sisi = scanner.nextInt();
        kubus.hitungVolume();


        //balok
        Balok balok = new Balok();
        System.out.println("Masukkan panjang balok anda :");
        balok.panjang = scanner.nextInt();
        System.out.println("Masukkan lebar balok anda :");
        balok.lebar = scanner.nextInt();
        System.out.println("Masukkan tinggi balok anda :");
        balok.tinggi = scanner.nextInt();
        balok.hitungVolume();

        //tabung
        Tabung tabung = new Tabung();
        System.out.println("Masukkan JARI-JARI TABUNG anda :");
        tabung.jarijari = scanner.nextInt();
        System.out.println("Masukkan Tinggi TABUNG anda :");
        tabung.tinggi = scanner.nextInt();
        tabung.hitungVolume();

    }



}
