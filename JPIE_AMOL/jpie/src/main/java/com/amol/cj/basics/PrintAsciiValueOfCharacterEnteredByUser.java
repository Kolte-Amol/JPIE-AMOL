/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class PrintAsciiValueOfCharacterEnteredByUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		int i=0;
		while(i<=10){
			
			System.out.println("Enter a Character");
			
			char number1 = reader.nextLine().toString().charAt(0);
			
			System.out.println((int)number1);
			
			i++;
		}
		
		

	}

}
