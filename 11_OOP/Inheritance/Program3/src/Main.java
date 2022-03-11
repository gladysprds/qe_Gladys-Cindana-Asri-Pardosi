public class Main {

    public static void main(String [] args){

        Animal animal = new Animal();
        animal.nama_binatang= " Binatang";

        Herbivor herbivor = new Herbivor();
        //extends Herbivor

        herbivor.nama_binatang = " Kambing ";
        herbivor.jenis_makanan = " Rumput ";
        herbivor.gigi_binatang = " Tumpul ";
        herbivor.identity_myself();

        //extends Omnivor

        Omnivor omnivor = new Omnivor();
        omnivor.nama_binatang = " Ayam ";
        omnivor.jenis_makanan = " semua  ";
        omnivor.gigi_binatang = " Tajam dan Tumpul ";
        omnivor.identity_myself();


        //extends Carnivor

        Carnivor carnivor = new Carnivor();
        carnivor.nama_binatang = " Singa ";
        carnivor.jenis_makanan = " Daging ";
        carnivor.gigi_binatang = " Tajam  ";
        carnivor.identity_myself();



    }



}
