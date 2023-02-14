package oops;

public class Employee {
	
	int eid;
	String ename;
	String designation;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.eid = 100;
		e.ename = "Geethu";
		e.designation="Tester";
		e.display();

	}
	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(designation);
	}

}
