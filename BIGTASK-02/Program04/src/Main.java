import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String[][] myChar = {
                    {"A","B","C","D","E"}, {"F","G","H","I","J"},
                    {"L","M","N","O","P"}, {"Q","R","S","T","U"},
                              {"V","W","X","Y","Z"}
            };
            Scanner input = new Scanner(System.in);
            String str;
            System.out.print("Input     : ");

                 str=input.nextLine();

            int x,w,y,z;
            for (x=0;x<5;x++){
                for (w=0;w<5;w++){
                    if(str.equals(myChar[x][w])){
                        w +=1;
                        x +=1;
                        System.out.print("Output    : "+w+" "+x);
                    }else if(str.equals("K")){
                        str = "C";
                        for (y=0;y<5;y++){
                            for (z=0;z<5;z++){
                                if(str.equals(myChar[y][z])){
                                    y +=1;
                                    z +=1;
                                }
                            }
                        }
                    }

                }
                System.out.println("\n");
            }



        }
    }



