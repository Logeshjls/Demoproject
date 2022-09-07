package org.string;

public class StringReverse {

	public static void main(String[] args) {
		
		String s="Logesh";
		
		String rev= "";
		
		for (int i=s.length()-1; i>=0; i--) {
			
			char ch = s.charAt(i);
			
			rev=rev+ch;
			
		}

		System.out.println("Reversed String is: "+rev);
	}

}
