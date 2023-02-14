package pkg;
import java.util.*;
public class Pattern3 {

	public static void main(String [] args) {
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the limit");
		int l = sc.nextInt();
		for(int i=1;i<=l;i++) {
			for(int j=1 ; j<=i;j++) {
				System.out.print(k+ " ");
				k=k+1;
			}
			System.out.println();
		}
	}
}
