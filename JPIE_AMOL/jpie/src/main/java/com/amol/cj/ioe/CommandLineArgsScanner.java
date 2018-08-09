/**
 * 
 */
package com.amol.cj.ioe;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class CommandLineArgsScanner {

	/**
	 * @param args
	 */
	
	public void scanAndCheckTypeOfArgs(Scanner scanner){
		StringBuilder name = new StringBuilder();
		StringBuilder gender = new StringBuilder();
		
		
		 Integer age = new Integer(0);	     
	     Double cgpa = new Double(0.0);
		int i=0;
		while(scanner.hasNextLine() && i<4){
			i++;
			if(scanner.hasNextInt()){
				age = scanner.nextInt();
			}else if(scanner.hasNextDouble()){
				cgpa = scanner.nextDouble();
			}else{
				if(scanner.nextLine().toString().length()==1){
					gender.append(scanner.nextLine().toString());
				}else{
					name.append(scanner.nextLine().toString());
				}
			}
			
		}
		
		char[] ch = gender.toString().toCharArray();
		
		 printData(name.toString(), ch[0], age, 0, cgpa);
	}
	
	
	public void scanArgs(Scanner scanner){
		String name = scanner.nextLine().toString();
		char gender = scanner.next().charAt(0);
		
		 int age = scanner.nextInt();
	     long mobileNo = scanner.nextLong();
	     double cgpa = scanner.nextDouble();
	     
	     printData(name, gender, age, mobileNo, cgpa);
	}
	
	public void printData(String name, char gender, int age, long mobileNo, double cgpa){
		// Print the values to check if input was correctly obtained.
        System.out.println("Name: "+name);
        System.out.println("Gender: "+gender);
        System.out.println("Age: "+age);
        System.out.println("Mobile Number: "+mobileNo);
        System.out.println("CGPA: "+cgpa);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);	
		
		CommandLineArgsScanner commandLineArgsScanner = new CommandLineArgsScanner();
	//	commandLineArgsScanner.scanAndCheckTypeOfArgs(scanner);
		commandLineArgsScanner.scanArgs(scanner);
	}

}
