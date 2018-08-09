/**
 * 
 */
package com.amol.cj.stringOps;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class StringCompareEnteredByUser {

	/**
	 * @param args
	 */
	public void checkStringsUsingcompareTo(String str, String str1, Object objStr){	
		  System.out.println("In public void checkStringsUsingcompareTo(String str, String str1, Object objStr)");
		  
		  System.out.println( str.compareTo(str1) );
	      System.out.println( str.compareToIgnoreCase(str1) );
	      System.out.println( str.compareTo(objStr.toString()));
		
	}
	
	public void checkStringsUsingEqual(String str, String str1, Object objStr){	
		
		  System.out.println("In public void checkStringsUsingEqual(String str, String str1, Object objStr)");
		
		  System.out.println( str.equals(str1) );
	      System.out.println( str.equalsIgnoreCase(str1) );
	      System.out.println( str.equals(objStr.toString()));
		
	}
	
	public void checkStringsUsingEqualOperator(String str, String str1, Object objStr){		
		
		  System.out.println("In public void checkStringsUsingEqualOperator(String str, String str1, Object objStr)");
		
		  System.out.println( str == str1 );
	      System.out.println( str1 == objStr.toString() );
	      System.out.println( str == objStr.toString());
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();	
		System.out.println("Enter a String");
		String str1 = reader.nextLine().toString();
		
	    Object objStr = str;
		
//		String str = "Hello Amol";	
//		
//		String str1 = "Hello Amol";
//		
//	    Object objStr = str;
//	    
	    StringCompareEnteredByUser stringCompareEnteredByUser = new StringCompareEnteredByUser();
	    
	    stringCompareEnteredByUser.checkStringsUsingcompareTo(str, str1, objStr);
	    stringCompareEnteredByUser.checkStringsUsingEqual(str, str1, objStr);
	    stringCompareEnteredByUser.checkStringsUsingEqualOperator(str, str1, objStr);	
	    
	    System.out.println("In public static void main(String[] args)");
	    
	    System.out.println( str.compareTo(str1) );
	    System.out.println( str.compareToIgnoreCase(str1) );
	    System.out.println( str.compareTo(objStr.toString()));
	    
	    System.out.println("--------------------------------------------------");
	    
	    System.out.println( str.equals(str1) );
	    System.out.println( str.equalsIgnoreCase(str1) );
	    System.out.println( str.equals(objStr.toString()));
	    
	    System.out.println("--------------------------------------------------");
	    
	    System.out.println( str == str1 );
	    System.out.println( str1 == objStr.toString() );
	    System.out.println( str == objStr.toString());
		
	}

}
