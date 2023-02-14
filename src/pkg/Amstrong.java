package pkg;
import java.util.*;
public class Amstrong {
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n,r,sum=0,temp;
		System.out.println("Enter a number :");
		n=sc.nextInt();
		temp=n;
		while(n>0) {
			
			r = n%10;
			sum = sum + (r*r*r);
			n = n/10;
		}
		if(temp==sum) {
			System.out.println("Amstrong number");
		}
		else {
			System.out.println("Not an amstrong number");
		}
		
	}

}
