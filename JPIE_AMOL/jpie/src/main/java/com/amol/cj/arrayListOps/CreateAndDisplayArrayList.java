/**
 * 
 */
package com.amol.cj.arrayListOps;

import java.util.ArrayList;
import java.util.List;

import com.amol.cj.domain.MyExcelBean;
import com.amol.cj.ioe.ReadLocalExcel;

/**
 * @author ARATI-AMOL
 *
 */
public class CreateAndDisplayArrayList {

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
		
		list.forEach(System.out::println);
		
		ReadLocalExcel readLocalExcel = new ReadLocalExcel();
		
		List<MyExcelBean> readLocalExcelList = readLocalExcel.getExcelDataAsArrayList();

	}

}
