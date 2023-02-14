package pkg;
import java.util.*;
public class Matrix {
	 public static void main(String [] args) {
		 Scanner sc = new Scanner(System.in);
		 int a[][] =  new int[3][2];
		 System.out.println("Enter the elements of the  array");
		 for(int i=0;i<3;i++) {
			 for(int j=0;j<2;j++) {
				 a[i][j]=sc.nextInt();
			 }
		 }
		 System.out.println("elements of the  array : ");
		 for(int i=0;i<3;i++) {
			 System.out.println();
			 for(int j=0;j<2;j++) {
				 System.out.print(" "+a[i][j]);
			 }
		 }
	 }
}
