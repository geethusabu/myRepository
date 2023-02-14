package pkg;

public class Methodpgm {

	public static void main(String[] args) {
		
		Methodpgm m = new Methodpgm();
		m.add();
		m.sub(30, 10);
		double d= m.div();
		System.out.println(d);
		int mu = m.mul(100, 200);
		System.out.println(mu);
   
	}
	//1.without parameter and without return type
	 public void add() {
		 int a=10,b=10,c;
		 c = a+b;
		 System.out.println("Sum = " +c);
	 }
   //2.with parameter and without returntype
	 public void sub(int a,int b) {
		 int c ;
		 c=a-b;
		 System.out.println("Difference = "+c);
	 }
	//without parammeter and with return type
	 public double div() {
		 //System.out.println("hai");
		 
		 int  a=30,b=10;
		 double c;
		 c=a/b;
		 return c;
	 }
	//method with parameter and wth return type
	 public int mul(int a,int b) {
		 int c = a*b;
		 return c;
	 }
	 
	 
}
