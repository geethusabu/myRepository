package oops;

class Parent{
	
	int a=20,b=10;
	int c = a+b;
	public void add() {
		System.out.println("c = "+c);
	}
}
class Child extends Parent {
	int d=a-b;
	public void sub() {
		
		System.out.println("diff = "+d);
	}
 }
public class Singleinheritance {

	public static void main(String[] args) {
		Child ch = new Child();
		ch.add();
		ch.sub();
		
	}

}
