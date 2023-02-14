package pkg;
import java.util.*;
public class Prime {

	public static void main(String[] args) {
		
		Prime p = new Prime();
		p.primeOrNot();
		
	}
        
	    public void primeOrNot() {
	    	int f = 0;
	    	Scanner sc = new Scanner(System.in);
	    	System.out.println("Enter the number : ");
	    	int a = sc.nextInt();
	    	for(int i=2 ; i<=a/2 ; i++) {
	    		if(a!=i) {
	    			if(a%i == 0) {
	    				f=1;
	    				break;
	    				
	    			}
	    		}
	    		
	    	}
	    	if(f==1) {
	    		System.out.println("Not a Prime");
	    	}
	    	else {
	    		System.out.println("prime");
	    	}
	    	
	    }
}
