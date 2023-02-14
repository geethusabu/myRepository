package pkg;
import java.util.*;
public class Arraysum {

	 public static void main(String [] args) {
		 int sum= 0,avg=1;
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter the size of the  array");
		  int n = sc.nextInt();
		  int arr[] = new int[n];
		  System.out.println("Enter the elements of the  array");
		  for(int i=0;i<n;i++) {
			  arr[i] = sc.nextInt();		 
		  }
		  for(int i=0;i<n;i++) {
			  sum = sum +  arr[i] ;
			  
		  }
		  avg = sum/n;
		  System.out.println("sum of the array : " + sum);
		  System.out.println("Average of the array : " + avg);
		  
	 }
}
