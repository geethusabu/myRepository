package oops;


class Emp{
	private int empid;
	private String empname;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	
}
public class Encapsulation {

	public static void main(String[] args) {
		 Emp e = new Emp();
		 e.setEmpid(200);
		 e.setEmpname("Geethu");
		 System.out.println(e.getEmpid());
		 System.out.println(e.getEmpname());

	}

}
