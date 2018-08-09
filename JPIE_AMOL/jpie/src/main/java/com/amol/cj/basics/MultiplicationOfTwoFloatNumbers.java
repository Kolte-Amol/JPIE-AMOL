/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class MultiplicationOfTwoFloatNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter first number");
		
		float number1 = reader.nextFloat();
		
		System.out.println("Enter second number");
		
		float number2 = reader.nextFloat();
		
		System.out.println("Multiplication = "+(number1*number2));

	}

}
