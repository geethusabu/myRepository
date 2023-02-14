package oops;

class Member{
	String ename,eaddress;
	int age;
	long salary,phone;
	
	public void printDetails() {
		System.out.println("Name = "+ename);
		System.out.println("Address = "+eaddress);
		System.out.println("Salary = "+salary);
		System.out.println("Phone = "+phone);
	}
}
class Empl extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}


public class InheritanceEg {
	
	public static void main(String[] args) {
	
		Empl e = new Empl();
		e.ename="Geethu";
		e.eaddress="chirakkathara";
		e.age = 29;
		e.salary=20000;
		e.phone=9633175284l;
		e.printDetails();
		e.specialization="Tester";
		Manager m= new Manager();
		m.ename="Abhilash";
		m.eaddress="Koottumannil";
		m.age = 29;
		m.salary=100000;
		m.phone=9526679927l;
		m.printDetails();
		m.department="Testing";
		
	}
		
	}


