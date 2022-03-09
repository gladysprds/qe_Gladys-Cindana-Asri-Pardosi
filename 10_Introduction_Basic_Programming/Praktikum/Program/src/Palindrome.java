import javax.swing.*;

public class Palindrome {

    public static void main(String [] args){

        String inputan = JOptionPane.showInputDialog("Kalimat/kata : ");
        char[] kata1 = inputan.toCharArray();
        char[] kata2 = inputan.toCharArray();
        boolean value = false;
        for (int a = inputan.length() - 1; a >= 0; a--) {
            for (int b = 0; b < inputan.length(); b++) {
                if (kata1[a] == kata2[b]) {
                    value = true;
                } else{
                    value= false;
                }
            }
        }
        if (value == true) {
            System.out.println("True !");
        } else {
            System.out.println("Not a Palindrome !");
        }
    }
}
