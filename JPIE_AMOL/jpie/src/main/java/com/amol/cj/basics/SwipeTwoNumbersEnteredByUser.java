/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class SwipeTwoNumbersEnteredByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		System.out.println("Enter a number");
		
		int inputOne = reader.nextInt();
		
		System.out.println("Enter a number");
		
		int inputTwo = reader.nextInt();
		
		inputOne = inputOne + inputTwo;
		
		inputTwo = inputOne - inputTwo;
		
		inputOne = inputOne - inputTwo;
		
		System.out.println("Input one="+inputOne);
		System.out.println("Input one="+inputTwo);
		
	}

}
