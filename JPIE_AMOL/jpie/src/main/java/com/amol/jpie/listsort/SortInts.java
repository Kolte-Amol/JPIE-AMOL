/**
 * 
 */
package com.amol.jpie.listsort;

import java.util.Arrays;

/**
 * @author ARATI-AMOL
 *
 */
public class SortInts {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final int[] numbers = {-3, -5, 1, 7, 4, -2};
	        final int[] expected = {-5, -3, -2, 1, 4, 7};

	        Arrays.sort(numbers);
	        System.out.println(Arrays.toString(expected)+"\n"+Arrays.toString(numbers));

	}

}
