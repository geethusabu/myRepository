/**
 * 
 */
package pkg;


public class StringFunction {
	
	public static void main(String[] args) {
		String s1 = "Hello", s2= "welcome",s3="Hai  welcome",s4="     Tetsing",s="hello",p="ABHI";
		 //1.Concat
		System.out.println(s1.concat(s2));
		System.out.println(1+2+s1+3+5);
		
		//equals
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s));
		System.out.println(s1.equalsIgnoreCase(s));
		
		//contains
		System.out.println(s3.contains(s2));
		System.out.println(s3.contains("wel"));
		
		//charAt
		System.out.println(s1.charAt(2));
		
		//toLowerCase
		System.out.println(p.toLowerCase());
		
		//toUpperCase
		System.out.println(s2.toUpperCase());
		
		//trim
		System.out.println(s4.trim());
		
		//startsWith
		System.out.println(s3.startsWith("Hai"));
		
		//endsWith
		System.out.println(s3.endsWith("welcome"));
		
		//length
		System.out.println(s3.length());
		
		//substring
		System.out.println(s1.substring(1,5));
		
		//split
		String a[]=s3.split(" ");
		for(String v:a) {
			System.out.println(v);
		}
		//toCharArray
		char c[] = s1.toCharArray();
		for(char v:c) {
			System.out.println(v);
		}
		
	}

}
