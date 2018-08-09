/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class SumOfTwoNumberEnteredByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		int number1= reader.nextInt();
		
		System.out.println("Enter Second number");
		int number2 = reader.nextInt();
		
		System.out.println("Sum ="+(number1+number2));

	}

}
