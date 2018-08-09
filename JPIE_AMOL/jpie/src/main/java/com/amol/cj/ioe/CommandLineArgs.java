/**
 * 
 */
package com.amol.cj.ioe;

/**
 * @author ARATI-AMOL
 *
 */
public class CommandLineArgs {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		if(args.length>0){
			for(int i=0; i<args.length;i++){
				System.out.println(args[i].toString().trim());
			}
		}else{
			System.out.println("No command line arguments are provided");
		}
	}

}
