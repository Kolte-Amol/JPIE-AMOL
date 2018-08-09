/**
 * 
 */
package com.amol.cj.arrayListOps;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ARATI-AMOL
 *
 */
public class AddElementInArrayList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
List<String> list = new ArrayList<String>();
		
		list.add("Red");
		list.add("Green");
		list.add("Orange");
		list.add("White");
		list.add("Black");
		
		System.out.println(list);
		list.forEach(value -> System.out.println(value));
		
		list.forEach(System.out::print);
		System.out.println();
		list.add(0, "Pink");
		System.out.println("list.add(0, Pink);");
		System.out.println(list);
		list.add(5, "Yellow");
		System.out.println("list.add(5, Yellow);");
		
		System.out.println(list);
		list.forEach(value -> System.out.println(value));
		
		list.forEach(System.out::print);

	}

}
