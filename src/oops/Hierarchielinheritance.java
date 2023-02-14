package oops;

class A{
	public void Afinction() {
		System.out.println("A is the parent class");
	}
}
class B extends A{
	public void Bfunction() {
		System.out.println("B is the Child of class A");
	}
}
class C extends A{
	public void Cfunction() {
		System.out.println("C is the Child of class A");
	}
}
public class Hierarchielinheritance {

	public static void main(String[] args) {
        B b= new B();
        b.Afinction();
        b.Bfunction();
        C c = new C();
        c.Afinction();
        c.Cfunction();
        
	}

}
