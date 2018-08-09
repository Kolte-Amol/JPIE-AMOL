/**
 * 
 */
package com.amol.cj.stringOps;


import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class RemoveCharacterFromString {

	/**
	 * @param args
	 */
	 public static void removeCharAt(String s, int pos) {
	//      return s.substring(0, pos) + s.substring(pos + 1);
	      System.out.println("Origional String ="+ s);
	      
	      System.out.println("String After removing character="+ s.substring(0, pos) + s.substring(pos + 1));
	 }
	
	 public static void removeCharacter(String str, char ch) {
		 System.out.println("Origional String ="+ str);
		 
		 String [] str1= str.split(""+ch);
		 
		 StringBuilder sb = new StringBuilder();
		 for(String st: str1){
			sb.append(st);
		 }
		 
		 System.out.println(sb.toString());
	 }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();
		
		System.out.println("Enter Position");		
		int pos = reader.nextInt();
		
		String str1 = str;
		
		System.out.println("Enter Character");		
		char ch = 'a';
		
		removeCharAt(str, pos);		
		
		removeCharacter(str1, ch);
		
	}

}
