/* JFM1T4_Assignment1:
   Write a program to find the highest among the given 3 numbers.
   Prompt the user for the 3 numbers to be input from the terminal.

   SampleInput: 
   Enter the first number: 11
   Enter the second number: 22
   Enter the third number: 1

   Expected Output:
   22 is highest number
 	
*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class HighestNumber {
     
//Add main method
public static void main(String[]args){
//Declare the three variables
int num1,num2,num3;
//Use the scanner class to provide input at execution time
/* 
 Scanner s= new Scanner(System.in);
 System.out.println("Enter the first number");
 number1=s.nextInt();

*/
Scanner sc = new Scanner(System.in);
  System.out.println("Enter the first number");
  int a = sc.nextInt();
  int b = sc.nextInt();
  int c = sc.nextInt();
//check which number is highest using if else condition
if(a>b && a>c )
  System.out.println("first number is highest");
  else if(b>c && b>a)
    System.out.println("second number is highest");
  else 
    System.out.println("third number is highest");
  

    
}

 
}