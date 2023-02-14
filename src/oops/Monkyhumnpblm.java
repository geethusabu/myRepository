package oops;

interface basicanimal{
	void eat();
	void sleep();
}
class Monkey{
	public void bite() {
		System.out.println("Monkey Bite");
	}
	public void jump() {
		System.out.println("Monkey Jump");
	}
}
class Human extends Monkey implements basicanimal{
	public void bite() {
		System.out.println("Human doest Bite");
		super.bite();
	}
	public void jump() {
		System.out.println("Human doesnot jump like monkeys");
		super.jump();
	}
	public void speak() {
		System.out.println("human speaks");
	}
	@Override
	public void eat() {
		System.out.println("human eats");
		
	}
	@Override
	public void sleep() {
		System.out.println("human sleep");
		
	}
	
}
public class Monkyhumnpblm {

	public static void main(String[] args) {
	Human h = new Human();
	h.bite();
	h.jump();
	h.speak();
	h.sleep();
	h.eat();

	}

}
