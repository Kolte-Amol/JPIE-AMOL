/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class DisplayIntegerEnteredByUser {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int number = reader.nextInt();
		
		System.out.println("Number is entered");
		
		System.out.println(number);

	}

}
