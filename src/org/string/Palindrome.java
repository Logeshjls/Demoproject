package org.string;

public class Palindrome {

	public static void main(String[] args) {

		
		String s="jaj";
		String rev="";
		
		for (int i =s.length()-1; i>=0; i--) {
			
			char ch = s.charAt(i);
			rev=rev+ch;
		}
			if(s.equals(rev)) {
				
				System.out.println("is a palindrome");
			}
			else {
				System.out.println("not a palindrome");
			}
				
		}
		
		
				

	}


