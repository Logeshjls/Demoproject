package org.string;

public class NumberPalindrome {

	public static void main(String[] args) {
		
		int num=151;
		int rev=0;
		
		while (num>0) {
			
			int rem=num%10;
			
			rev= (rev*10)+rem;
			
			num=num/10;
		}

		if (rev==num) {
			
			System.out.println("Given number is a Palindrome");
		}
		
		else {
			System.out.println("Given number is not a Palindrome");
		}
	}

}
