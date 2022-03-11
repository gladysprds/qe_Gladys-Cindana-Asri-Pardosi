public class Tabung extends  VolumBangunDatar {


    float jarijari;
    float tinggi;
    double volume;

    @Override
    double hitungVolume(){
        double volume = (3.14 * jarijari * jarijari * tinggi);
        System.out.println("Volume Tabung adalah: " + volume);
        return 0;
    }
}
