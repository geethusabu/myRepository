package oops;

class Add{
	int a=50,b=2;
	public void add() {
		System.out.println("Sum = "+(a+b));
	}
}
class sub extends Add{
	public void sub() {
		System.out.println("diff = "+(a-b));
	}
}
class Div extends sub{
	public void div() {
		System.out.println("div = "+(a/b));
	}
}
class mul extends Div{
	public void Mul() {
		System.out.println("Mul = "+(a*b));
	}
}
public class Multilevelinheritance {

	public static void main(String[] args) {
	
		mul d = new mul();
		d.add();
		d.sub();
		d.div();
		d.Mul();

	}

}
