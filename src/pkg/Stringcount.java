package pkg;
import java.util.*;
public class Stringcount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int c= 0;
		String s;
		System.out.println("Enter the string");
		s =  sc.nextLine();
		//System.out.println(s);
		System.out.println("Count of the string : ");
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				c++;
			}
			
		}
		System.out.println(c);
		
		
	}

}
