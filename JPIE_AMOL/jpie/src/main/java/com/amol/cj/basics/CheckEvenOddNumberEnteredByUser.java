/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class CheckEvenOddNumberEnteredByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");
		
		int inputNum = reader.nextInt();
				
		if((inputNum % 2) == 0){
			System.out.println("Number Entered By User = "+inputNum+" is a EVEN Number");
		}else{
			System.out.println("Number Entered By User = "+inputNum+" is a ODD Number");
		}

	}

}
