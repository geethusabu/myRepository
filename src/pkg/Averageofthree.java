package pkg;
import java.util.*;
public class Averageofthree {
  
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Averageofthree av = new Averageofthree();
		System.out.println("Enter three no : ");
		int a=sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		double avg = av.averageofthree(a, b, c);
		System.out.println("Average of three no is : " + avg);
		
	}
	 public double averageofthree(int a,int b,int c) {
		 double average = (a+b+c)/3;
		 return average;
	 }	
}
