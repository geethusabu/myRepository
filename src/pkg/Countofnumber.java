package pkg;
import java.util.*;
public class Countofnumber {
	public static void main(String [] args) {
		int n,i=0,r;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		n=sc.nextInt();
		while(n>0) {
			n=n/10;
			i++;
		}
		System.out.println("Count of the number is = " +i);
		
	}
}
