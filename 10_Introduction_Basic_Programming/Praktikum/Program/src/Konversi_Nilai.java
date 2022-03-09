import java.util.Scanner;

public class Konversi_Nilai {

    public static void main (String [] args){

    int nilai;

        Scanner scanner = new Scanner(System.in);

        System.out.println("NIlAI KAMU MATA KULIAH INI ADALAH :");

        nilai = scanner.nextInt();


        if( nilai >= 80 && nilai <= 100){
            System.out.println("Maka Grade A");
        }else if ( nilai >=65 && nilai <=79){
                System.out.println("Maka Grade B+");
        }else if ( nilai >=50 && nilai <=64) {
                 System.out.println("Maka Grade B");
        }else if ( nilai >=35 && nilai <=49){
                System.out.println("Maka Grade C");
        }else if ( nilai >=65 && nilai <=79) {
            System.out.println("Maka Grade D");
        }else if (nilai <0){
            System.out.println(" Nilai yang kamu masukkan Invalid!");
        }else{
            System.out.println("Grade E");
        }

    }
}
