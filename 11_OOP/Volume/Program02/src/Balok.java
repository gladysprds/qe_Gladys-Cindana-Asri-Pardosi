public class Balok extends VolumBangunDatar {

float panjang;
float lebar;
float tinggi;
double volume;

    @Override
    double hitungVolume(){
        double volume = panjang*lebar*tinggi;
        System.out.println("Volume Balok adalah: " + volume);
        return 0;
    }


}
