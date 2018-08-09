/**
 * 
 */
package com.amol.cj.exptnHndOps;

/**
 * @author ARATI-AMOL
 *
 */
public class JavaException {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int d = 0;
		 int n = 20;
		try {
			   int fraction = n / d;
			   System.out.println("This line will not be Executed");
			  } catch (ArithmeticException e) {
			   System.out.println("In the catch Block due to Exception = " + e);
			  }
			  System.out.println("End Of Main");
	}

}
