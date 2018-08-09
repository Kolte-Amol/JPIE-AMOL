/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class DisplayIntValueOfStringEnteredByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter A String");
		
		String number1 = reader.nextLine().toString().trim();
		
		char[] charArray = number1.toCharArray();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < charArray.length; i++){
			sb.append((int)charArray[i]);
		}
		
		System.out.println(sb.toString());
		
	}

}
