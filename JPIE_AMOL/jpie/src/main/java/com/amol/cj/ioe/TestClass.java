/**
 * 
 */
package com.amol.cj.ioe;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.amol.cj.domain.MyExcelBean;
import com.amol.cj.domain.StudentDomain;
import com.amol.cj.singletons.EagerInitializedSingleton;
import com.amol.cj.singletons.LazyInitializedSingleton;

/**
 * @author ARATI-AMOL
 *
 */
public class TestClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	ReadLocalExcel readLocalExcel = new ReadLocalExcel();
		
		Map<Integer, MyExcelBean> mapFromLocalExcel = readLocalExcel.getExcelDataAsHashMap();
		Map<Integer, MyExcelBean> mapFromLocalExcel1 = readLocalExcel.getExcelDataAsTreeMap();
		
		Set<MyExcelBean> set1 = readLocalExcel.getExcelDataAsHashSet();
		Set<MyExcelBean> set2 = readLocalExcel.getExcelDataAsTreeSet();
		
		List<MyExcelBean> readLocalExcelList = readLocalExcel.getExcelDataAsArrayList();
		List<MyExcelBean> readLocalExcelList1 = readLocalExcel.getExcelDataAsLinkedList();
		
		
		System.out.println(mapFromLocalExcel.size());
		System.out.println(mapFromLocalExcel1.size());
		
		System.out.println(set1.size());
		System.out.println(set2.size());
		
		System.out.println(readLocalExcelList.size());
		System.out.println(readLocalExcelList1.size());*/
		
		StudentDomain studentDomain = new StudentDomain(101, "Amol Kolte");
		
		StudentDomain studentDomain1 = new StudentDomain(102, "Arati Kolte");
		
		System.out.println(studentDomain.toString());
		System.out.println(studentDomain1.toString());
		
		EagerInitializedSingleton instanceOne = EagerInitializedSingleton.getInstance();
		
		LazyInitializedSingleton instanceTwo = LazyInitializedSingleton.getInstance();
		

	}

}
