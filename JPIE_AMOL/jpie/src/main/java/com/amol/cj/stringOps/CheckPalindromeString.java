/**
 * 
 */
package com.amol.cj.stringOps;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class CheckPalindromeString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();
		
		StringBuilder sb = new StringBuilder(str).reverse();
		
		if(str.equals(sb.toString())){
			System.out.println("PalindromeString");
		}else{
			System.out.println("No PalindromeString");
		}
		

	}

}
