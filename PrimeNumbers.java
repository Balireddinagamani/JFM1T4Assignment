/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {
  public static void main(String[]args){
    int i,count;
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the two numbers:");
    int n=sc.nextInt();
    System.out.println("prime number");
    for(int j=2;j<=n;j++)
      {
        count=0;
        for(i=1;i<=j;i++)
          {
            if(j%i==0)
            {
              count++;
            }
            }
        if(count==2)
          System.out.println(j+" ");
            
   
   

              
    }
              
        
  }
}
