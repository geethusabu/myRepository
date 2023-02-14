package oops;

public class MethodPass {
	 int eid;
	 String name;
	 String desg;

	public static void main(String[] args) {
	
		MethodPass m = new MethodPass();
		m.SetVAlues(100, "Geethu", "tester");
		m.display();
	}
	public void SetVAlues(int empid,String ename,String desgn) {
		this.eid=empid;
		this.name=ename;
		this.desg=desgn;
		
	}
	public void display() {
		System.out.println(eid);
		System.out.println(name);
		System.out.println(desg);
	}
}
