package oops;

interface flowers{
	void audor();
	void color();
}
interface price{
	void pricedetails();
}
class rose implements flowers,price{

	@Override
	public void audor() {
		// TODO Auto-generated method stub
		System.out.println("Mild audor");
	}

	@Override
	public void color() {
		System.out.println("red colour");
		
	}

	@Override
	public void pricedetails() {
		System.out.println("Low price");
		
	}
	
}
class jasmine implements flowers,price{

	@Override
	public void pricedetails() {
		System.out.println("high price");
		
	}

	@Override
	public void audor() {
		System.out.println("deep");
		
	}

	@Override
	public void color() {
		System.out.println("White");
		
	}
	
}
public class Interfacepgm {

	public static void main(String[] args) {
		flowers r = new rose();
		r.audor();
		r.color();
		//r.pricedetails();
		r= new jasmine();
		r.audor();
		r.color();

	}

}
