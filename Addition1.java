import java.util.Scanner;
   public class Addition1 {

public static void main(String[] args) {

    Scanner input = new Scanner (System.in);
    int number1;
 System.out.print("Enter the first number....");
 
 number1 = input.nextInt();
 int number2;
 	System.out.print ("Enter the second number....");
 	number2 = input.nextInt();
 	
 	 int number3;
      System.out.print("Enter the third number...");
      number3 = input.nextInt();
      
 	int sum = number1 + number2 + number3;
 	
 	System.out.printf("Sum is %d%n", sum);
 	}
 	
 	



}

