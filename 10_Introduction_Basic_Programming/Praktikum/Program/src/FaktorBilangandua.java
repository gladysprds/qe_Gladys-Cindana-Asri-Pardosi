import java.util.Scanner;

public class FaktorBilangandua {

    public static void main (String [] args){

        int bilangan;
        int i;
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan Bilangan yang anda inginkan : ");
        bilangan = input.nextInt();
        System.out.println("Faktor dari " + bilangan + " adalah");


        for (i=bilangan;i>=1;i--){

            if(bilangan%i ==0){
                System.out.println(i);
            }
        }

    }
}
