

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Masukkan kata : ");
            String inputanString = input.next();
            String hasilString = gantikarakter(inputanString);
            System.out.println("Hasil : " + hasilString);
        }

        private static String gantikarakter(String inputanString) {
            String str1=inputanString.toLowerCase();
            char[] kar = str1.toCharArray();

            for (int i = 0; i < kar.length; i++) {
                switch (kar[i]) {
                    case 'a':
                        kar[i] = '.';
                        break;
                    case 'i':
                        kar[i] = '.';
                        break;
                    case 'o':
                        kar[i] = '-';
                        break;
                    case 'u':
                        kar[i] = '.';
                        break;
                    default:
                        kar[i] = ' ';
                        break;
                }
            }
            return String.valueOf(kar);
        }
    }

