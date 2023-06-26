/* JFM1T4_Assignment4:
   Write a program to print the following pattern:
     1 
     01 
     101 
     0101 
     10101 
*/
import java.util.Scanner;
public class Pattern {
  public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = scanner.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=i;j++){
        if((i+j)%2==0){
          System.out.print("1");
        }
        else{
          System.out.print("0");
        }}
      System.out.println();
      }
  }


}