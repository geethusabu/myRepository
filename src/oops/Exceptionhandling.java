package oops;

public class Exceptionhandling {

	public static void main(String[] args) {
		
		int a=4,c=0;
		try {
			double b=a/c;
			System.out.println(b);
		}
		catch(ArithmeticException e){
			System.out.println(e.getMessage());
		}
		System.out.println("helo");
		try {
			String s = null;
			int l = s.length();
		}
		catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	

}
