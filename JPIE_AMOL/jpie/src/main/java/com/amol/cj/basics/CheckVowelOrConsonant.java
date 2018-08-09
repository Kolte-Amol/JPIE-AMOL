/**
 * 
 */
package com.amol.cj.basics;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class CheckVowelOrConsonant {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner reader = new Scanner(System.in);
		
		System.out.println("Enter a character");
		
		char ch = reader.nextLine().toString().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
			System.out.println("Character Entered By User = "+ ch+" is a vowel");
		}else if(ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U'){
			System.out.println("Character Entered By User = "+ ch+" is a vowel");
		}else{
			System.out.println("Character Entered By User = "+ ch+" is a consonant");
		}

	}

}
