package oops;

class Parentdetails {
	public void occupation() {
		System.out.println("Carpenter");
	}
	
}
 class Childdetails extends Parentdetails{

	@Override
	public void occupation() {
		System.out.println("Tester");
		// TODO Auto-generated method stub
		super.occupation();
	}
	public void education() {
		System.out.println("MCA");
	}
	 
 }
public class Methodoverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Childdetails c = new Childdetails();
		c.occupation();
		c.education();

	}

}
