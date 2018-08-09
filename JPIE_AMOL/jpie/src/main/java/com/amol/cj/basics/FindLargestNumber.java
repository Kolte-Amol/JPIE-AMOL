/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class FindLargestNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a number");		
		int inputNum1 = reader.nextInt();
		
		System.out.println("Enter a number");		
		int inputNum2 = reader.nextInt();
		
		System.out.println("Enter a number");		
		int inputNum3 = reader.nextInt();
		
		if((inputNum1 > inputNum2) && (inputNum1 > inputNum3)){
			System.out.println("Largest Number is ="+inputNum1);
		}else if((inputNum2 > inputNum1) && (inputNum2 > inputNum3)){
			System.out.println("Largest Number is ="+inputNum2);
		}else if((inputNum3 > inputNum1) && (inputNum3 > inputNum2)){
			System.out.println("Largest Number is ="+inputNum3);
		}else{
			System.out.println("All Numbers are Same");
		}
	}

}
