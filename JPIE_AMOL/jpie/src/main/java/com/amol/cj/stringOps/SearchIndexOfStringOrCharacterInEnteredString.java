/**
 * 
 */
package com.amol.cj.stringOps;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class SearchIndexOfStringOrCharacterInEnteredString {

	/**
	 * @param args
	 */
	
	public void searchStringIndexFromString(String str){
		
		 int lastIndex = str.lastIndexOf("hello");
	      
	      if(lastIndex == - 1){
	         System.out.println("Hello not found");
	      } else {
	         System.out.println("Last occurrence of Hello is at index "+ lastIndex);
	      }
		
	}
	
	
	public void searchCharacterIndexFromString(String str, char ch){
		int index = str.lastIndexOf(ch);
		  if(index == - 1){
		         System.out.println("Hello not found");
		  } else {
		         System.out.println("Last occurrence of "+ch+" is at index "+ index);
		  }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();
		
		SearchIndexOfStringOrCharacterInEnteredString obj = new SearchIndexOfStringOrCharacterInEnteredString();
		
		obj.searchStringIndexFromString(str);
		
		System.out.println("Enter a Character");		
		char ch = reader.nextLine().toString().charAt(0);
		
		obj.searchCharacterIndexFromString(str, ch);

	}

}
