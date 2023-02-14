package oops;
import java.util.*;

interface Bank{
	void personal();
	public void withdrawal();
	public void deposit();
	public void balance();
	
}
class icic implements Bank{
	static String bankname = "ICIC";
	int acbalance = 200000,ac,choice;
	String  s,IFSC,ch;
	
	Scanner sc = new Scanner(System.in);
	@Override
	public void personal() {
		System.out.println("...PERSONAL DETAILS...");
		System.out.println("Enter the full name :");
		s = sc.nextLine();
		System.out.println("Enter the Account number :");
		ac = sc.nextInt();
		System.out.println("Enter IFSC code :");
		IFSC = sc.next();
	}
	

	@Override
	public void withdrawal() {
		System.out.println("...WITHDRAWL...");
		System.out.println("Enter the amount to be withdraw");
		int amount = sc.nextInt();
		acbalance = acbalance - amount;
		System.out.println("Balance amount : " + acbalance);
		
	}

	@Override
	public void deposit() {
		System.out.println("...DEPOSIT...");
		System.out.println("Enter the amount to be Depostited");
		int Depo = sc.nextInt();
		acbalance = acbalance + Depo;
		System.out.println("Balance amount : " + acbalance);
		
	}

	@Override
	public void balance() {
		System.out.println("...BALANCE EBQUIRY...");
		System.out.println("Balance amount : " + acbalance);
	}
	public void display() {
		System.out.println(bankname);
		System.out.println("Name : " + s);
		System.out.println("Account number : " + ac);
		System.out.println("IFSC code :" + IFSC);
		System.out.println("Balance amount : " + acbalance);
		
	}
	
}
class Details extends icic{
	public void detail() {
	  do {
		 System.out.println("......MENU......");
		System.out.println("1.Personal Details");
		System.out.println("2.Withdrawal");
		System.out.println("3.Deposit");
		System.out.println("4..Balance Enquiry");
		System.out.println("Enter your choice : ");
		choice = sc.nextInt();
		switch(choice) {
		case 1: 
			super.display();
		    break;
		case 2:
			super.withdrawal();
			break;
		case 3:
			super.deposit();
			break;
		case 4:
			super.balance();
			break;
		default :
			System.out.println("Invalid option ! please try again");
		}
		System.out.println("Do you want to continue ??Press y/n");
		ch = sc.next();
		
	}
		while(ch=="y");
	}
}

public class Bankapplication {

	public static void main(String[] args) {
		
		Details d = new Details();
		d.personal();
		d.detail();
				

	}

}
