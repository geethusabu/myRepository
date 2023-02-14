package pkg;
import java.util.*;
public class Vowelsinastring {

	public static void main(String[] args) {
		Vowelsinastring vw = new Vowelsinastring();
		vw.vowelsInString();
				
	}
	public void vowelsInString() {
		Scanner sc = new Scanner(System.in);
		String s;
		System.out.println("Enter a string : ");
		s = sc.nextLine();
		for(int i =0;i<s.length();i++) {
		 if(s.charAt(i) != ' ') {
			 if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u')
						|| (s.charAt(i)=='A') || (s.charAt(i)=='E') || (s.charAt(i)=='I') || (s.charAt(i)=='O') || (s.charAt(i)=='U')) {
					System.out.println(s.charAt(i));
				}
		 }
			
		}
		
		
	}
}
