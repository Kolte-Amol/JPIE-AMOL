/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class ComputeQuotientAndReminder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter Divident");
		
		int divident = reader.nextInt();
		
		System.out.println("Enter divider");
		
		int divider = reader.nextInt();
		
		System.out.println(divident/divider);
		System.out.println(divident%divider);

	}

}
