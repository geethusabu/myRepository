package pkg;

import java.util.Scanner;

public class Scannerpgm {
	
	public static void main(String[] args)
	{
		System.out.println("Enter An inyteger number");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Integer number is = "+n);
		
		System.out.println("Enter An Double number");
		double d = sc.nextDouble();
		System.out.println("Double number is = "+d);
		
		System.out.println("Enter String");
		String s = sc.next();
		System.out.println("String is = "+s);
		
		System.out.println("Enter  string line");
	    
        sc.nextLine();
        String s1 = sc.nextLine();   
		System.out.println("String is = "+s1);
	}
	

}
