import java.util.Scanner;

public class Prob2 {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    System.out.println("enter two numbers ");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
  if ((num1 + num2 )% 2 == 0)
    System.out.println("both are posivtive or 0");
  else 
    System.out.println("one or both are odd");
    
   }
  }