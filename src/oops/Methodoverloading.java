package oops;

public class Methodoverloading {

	public static void main(String[] args) {
		
		Methodoverloading m = new Methodoverloading();
		m.mul();
		m.mul(20, 30);
		m.mul(20, 2.2);
		m.mul(3.3, 30);
	}
	public void mul() {
		int a =10 ,b = 20,c;
		c=a*b;
		System.out.println(c);
	}
	public void mul(int a,int b) {
		int c;
		c = a*b;
		System.out.println(c);
	}
	public void mul(int a,double b) {
		System.out.println(a*b);
	}
	public void mul(double a,int b) {
		System.out.println(a*b);
	}

}
