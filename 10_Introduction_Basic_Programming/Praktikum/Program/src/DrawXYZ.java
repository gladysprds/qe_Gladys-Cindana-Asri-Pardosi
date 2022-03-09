
    public class DrawXYZ{
        private static void DrawXYZ(int n) {
            int counter = 1;
            char s[] = { 'Y', 'Z', 'X' };

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < 3; j++) {
                    if (counter % 3 == 0) {
                        System.out.print(s[2]);
                    } else if (counter % 2 == 0) {
                        System.out.print(s[1]);
                    } else if (counter % 2 != 0) {
                        System.out.print(s[0]);
                    }

                    System.out.print(" ");
                    counter++;
                }
                System.out.println(" ");
            }
        }

        public static void main(String[] args) {
            DrawXYZ(3);

        }
    }




