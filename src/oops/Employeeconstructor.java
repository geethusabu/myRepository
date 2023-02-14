package oops;

public class Employeeconstructor {
	int eid;
	String ename;
	String designation;
	
	public Employeeconstructor(int eid,String name,String desg) {
		 this.eid = eid;
		 this.ename = name;
		 this.designation = desg;
	}

	public static void main(String[] args) {
		Employeeconstructor e = new Employeeconstructor(100,"Abhilash","Admin");
		e.display();
		Employeeconstructor e1 = new Employeeconstructor(101,"Rishiv","Deveoper");
		e1.display();

	}
	public void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(designation);
	}
}
