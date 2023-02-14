package pkg;
import java.util.*;
public class Multiplicationtable {
	public static void main(String [] args) {
		  int n,l,p;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter a number : ");
		  n = sc.nextInt();
		  System.out.println("Enter a Limit : ");
		  l = sc.nextInt();
		 for(int i=1 ; i<=l;i++) {
			 p = i * n;
			 System.out.println(i+ " * " + n + " = " + p);
		 }
	}
}
