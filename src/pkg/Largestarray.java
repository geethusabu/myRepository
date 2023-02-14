package pkg;
import java.util.*;
public class Largestarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Largestarray l = new Largestarray();
		l.largest();
	}
	public void largest() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		int arr [] = new int[n];
		int large = arr[0];
		System.out.println("Enter the elements of the array : ");
		 for(int i=0;i<n;i++) {
			  arr[i] = sc.nextInt();		 
		  }
		 for(int i=0;i<n;i++) { 
			
			 if(large<arr[i]) {
				 large = arr[i];
			 }
			  
		  }
		 System.out.println("Largest element of the array : " + large);
		 
	}

}
