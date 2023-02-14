package oops;
import java.util.*;
interface resumedetails{
	void personal(String name,String address,String email,long phone,String designation);
	void languages();
	void education();
	void experiences();
	void skills();
}
class Myresume implements resumedetails{
	 int n,year,start,end;
	 String ch,degree;
	 String institute,company,desg;
	 String language[] = new String[3];
	 String skills[] = new String[5];
     Scanner sc = new Scanner(System.in);

@Override
public void personal(String name, String address, String email, long phone, String designation) {
	System.out.println("*--------------------"+"PERSONAL DETAILS"+"-------------------*");
	System.out.println("                    "+name.toUpperCase()+"                 ");
	System.out.println("                    "+address+"                ");
	System.out.println("                    "+email+"                   ");
	System.out.println("                    "+phone+"                   ");
	System.out.println("                    "+designation.toUpperCase()+"                   ");
	
	
}

@Override
public void languages() {
	
	 
	
	 System.out.println("Enter  three languages you know : ");
     for(int i=0;i<3;i++)
     {
    	 language[i]= sc.next();	
    	 
     }
     
}

@Override
public void education() {
	 System.out.println("Enter the highest graduation : ");
	 degree = sc.next();
	 System.out.println("Enter the pass out year : ");
	 year = sc.nextInt();
	 System.out.println("Enter the Institute : ");
	 sc.next();
	 institute = sc.nextLine();
	
}

@Override
public void experiences() {
 
	    System.out.println("Enter the previous company name : ");
		company = sc.nextLine();
		System.out.println("Enter the designation");
		desg = sc.nextLine();
		System.out.println("Enter the start and end year");
		start = sc.nextInt();
		end = sc.nextInt();
		
		
	
}

@Override
public void skills() {
	
	 
	 System.out.println("Enter  Skills  : ");
	 for(int i=0;i<5;i++) {
		 skills[i] = sc.next();
	 }

	
}


	public void display() {
		System.out.println("*-------------------"+"LANGUAGES"+"------------------------------*");
		for(int i=0;i<3;i++)
	     {
	    		 System.out.println("       > "+language[i]+"                ");  
	    		 
	     }
		System.out.println();
		System.out.println("*-------------------"+"EDUCATION"+"------------------------------*");
		 System.out.println("       > "+degree+"  "+year+"  "+institute);  
		 System.out.println();
		 
		 System.out.println("*-------------------"+"EXPERIENCE"+"-----------------------------*");
		 System.out.println("       > "+company+"  "+desg+"  "+start+"-"+end);
		 System.out.println();
		 System.out.println("*-------------------"+"SKILLS"+"---------------------------------*");
		 for(int i=0;i<5;i++)
	     {
	    		 System.out.println("       > "+skills[i]+"                ");   	
	     }
	}
	
	
}
public class Resumepgm {

	public static void main(String[] args) {
		
		Myresume my = new Myresume();
		
		my.languages();
		my.education();
		my.experiences();
		my.skills();
		my.personal("GEETHU", "Chirakkathara", "geethu@gmail.com", 9633175284l, "TESTER");
		my.display();

	}

}
