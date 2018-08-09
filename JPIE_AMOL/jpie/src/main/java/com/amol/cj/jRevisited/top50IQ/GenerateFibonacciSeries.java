/**
 * 
 */
package com.amol.cj.jRevisited.top50IQ;

import java.util.Scanner;

/**
 * @author ARATI-AMOL
 *
 */
public class GenerateFibonacciSeries {

	/**
	 * @param args
	 */
	
	public static int fibonacciUsingLoop(int num){
		
		if(num == 1 || num == 2){
			return 1;
		}
		
		int num1 = 1;
		int num2 = 1;
		int num3 = 1;
		
		for(int i=3; i <= num; i++){
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;
		}
		
		return num3;		
	}
	
	public static int fibonacci(int number){		
		
		if(number == 1 || number == 2){ 
			return 1; 
		} 
		return fibonacci(number-1) + fibonacci(number -2); 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		
		for(int i=1; i<=num; i++){ 
			System.out.print(fibonacciUsingLoop(i) +" "); 
		}
		
		System.out.println();
		
		for(int j=1; j<=num; j++){ 
			System.out.print(fibonacci(j) +" "); 
		}
	}

}
