package pkg;
import java.util.*;
public class Stringpalindrome {

	public static void main(String[] args) {
	    Scanner sc =  new Scanner(System.in);
		String s,temp="";
	
		System.out.println("Enter the string : ");
		s=sc.next();
		for(int i=s.length()-1;i>=0;i--) {
			temp = temp+s.charAt(i);
		}
		
		if(s.equals(temp)) {
			System.out.println(temp);
			System.out.println("palindrome ");
		}
		else {
			System.out.println("Not a palindrome");
		}

	}

}
