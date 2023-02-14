package pkg;
import java.util.*;
public class Array1 {
  public static void main(String [] args) {
	  int a[] = new int[4];
	  Scanner sc= new Scanner(System.in);
	  System.out.println("Enter the elements of the array");
	  for(int i=0;i<4;i++) {
		  a[i] = sc.nextInt();
		 
	  }
	  for(int i=0;i<4;i++) {
		  System.out.println(a[i]);
		 
	  }
	  System.out.println("Enter the size of the second array");
	  int n = sc.nextInt();
	  int arr[] = new int[n];
	  System.out.println("Enter the elements of the second array");
	  for(int i=0;i<n;i++) {
		  arr[i] = sc.nextInt();
		 
	  }
	//  for(int i=0;i<n;i++) {
		//  System.out.println(arr[i]);
		 
	//  }
	  for(int v:arr) {
		  System.out.println(v);
	  }
  }
}
