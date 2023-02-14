package pkg;
import java.util.*;
public class Stringarray {
	 public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of the  array");
		  int n = sc.nextInt();
		 String names[] = new String[n];
		 System.out.println("Enter the names");
		 sc.nextLine();
		 for(int i =0 ;i<n;i++) {
			 names[i] = sc.nextLine();
		 }
		 System.out.println("Names are : ");
		 for(int i =0 ;i<n;i++) {
			 System.out.println(names[i]);
		 }
	 }

}
