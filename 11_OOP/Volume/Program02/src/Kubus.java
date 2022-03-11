public class Kubus extends VolumBangunDatar{
    double volume;
    float sisi;

    @Override
    double hitungVolume(){
        double volume = sisi*sisi*sisi;
        System.out.println("Volume Kubus adalah: " + volume);
        return 0;
    }


}
