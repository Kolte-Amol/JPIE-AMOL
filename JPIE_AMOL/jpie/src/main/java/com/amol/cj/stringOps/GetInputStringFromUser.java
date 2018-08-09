/**
 * 
 */
package com.amol.cj.stringOps;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class GetInputStringFromUser {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();
		System.out.println(str);

	}

}
