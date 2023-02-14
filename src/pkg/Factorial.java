package pkg;
import java.util.*;
public class Factorial {
  public static void main(String [] args) {
	  Scanner sc= new Scanner(System.in);
	  int f=1,n;
	  System.out.println("enter a number : ");
	  n = sc.nextInt();
	  for(int i = n ; i >= 1 ; i--) {
		  f = f*i;
	  }
	  System.out.println("Factorial = " + f);
	  
  }
}
