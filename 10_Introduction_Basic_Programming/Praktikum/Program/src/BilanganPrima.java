import java.util.Scanner;

public class BilanganPrima {

    public static void main (String [] args) {
        int bilangan;
        int i;
        int periksabilangan = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan bilangan anda :");

        bilangan = scanner.nextInt();

        for(i=2;i<=bilangan;i++){

            if (bilangan%i == 0){
                periksabilangan++;
            }
        }

        if (periksabilangan==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
}

}
