package pkg;
import java.util.*;
public class Calculator {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int a , b , c;
		System.out.println("Enter two numbers");
		a= sc.nextInt();
		b= sc.nextInt();
		System.out.println("......Calculator.....\n");
		System.out.println(" 1.Add \n 2. Substraction \n 3. Multiplication \n 4.Division");
		System.out.println("Enter your choice");
		c= sc.nextInt();
		double result = 0;
		switch(c) {
		case 1:
			result = a+b ;			
			break;
		case 2:
			result = a-b ;		
			break;
		case 3:
			result = a*b ;		
			break;
		case 4:
			result = a/b ;		
			break;
		default:
			System.out.println("Invalid option , Please enter a valid option");
			
		}
		System.out.println("Result = " + result);
	}

}
