package pkg;
import java.util.*;
public class Palindrome {
	public static void main(String [] args) {
	  int n,s=0,r,temp;
	  Scanner sc = new Scanner(System.in);
	  System.out.println("Enter a number : ");
	  n = sc.nextInt();
	  temp=n;
	  while(n>0) {
		  r = n % 10;
		  s = (s*10)+r;
		  n = n / 10;
	  }
	   if(temp==s) {
		 System.out.println("Palindrome");
	    }
	   else {
		   System.out.println("Not a Palindrome");
	   }
	}

}
