/* JFM1T4_Assignment5:
   Write a program to print the following pattern:
       a
     a b a
   a b c b a
     a b a
       a
*/

   public class DiamondPattern {
    public static void main(String[] args) {
      
        int n = 3;

        for (int i = 0; i < n; i++) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('a' + j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('a' + j) + " ");
            }

            System.out.println();
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j = n - i; j > 1; j--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {
                System.out.print((char) ('a' + j) + " ");
            }

            for (int j = i - 1; j >= 0; j--) {
                System.out.print((char) ('a' + j) + " ");
            }

            System.out.println();
 }
    }
      }

       