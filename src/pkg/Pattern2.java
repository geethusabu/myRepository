package pkg;
import java.util.*;
public class Pattern2 {
  public static void main(String [] args) {
	  int l;
	  System.out.println("Enter the limit : ");
	  Scanner ssc = new Scanner(System.in);
	  l = ssc.nextInt();
	  for(int i = 1 ; i<=l ; i++) {
		  for(int j = 1 ; j<=i ; j++) {
			  System.out.print("* ");
		  }
		  System.out.println();
	  }
  }
}
