package oops;

abstract class calc{
	abstract public void add();
	abstract public void sub();
	abstract public void div();
	public void mul() {
		System.out.println("Multipication");
	}

}
class Calcoperation extends calc{

	@Override
	public void add() {
		System.out.println("addition");
		
	}

	@Override
	public void sub() {
		System.out.println("substraction");
		
	}

	@Override
	public void div() {
		System.out.println("division");
		
	}
	
}
public class Abstraction {

	public static void main(String[] args) {

		Calcoperation c = new Calcoperation();
		c.add();
		c.div();
		c.sub();
		c.mul();
	}

}
