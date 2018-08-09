/**
 * 
 */
package com.amol.cj.arrayListOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;

import com.amol.cj.domain.MyExcelBean;
import com.amol.cj.ioe.ReadLocalExcel;

/**
 * @author ARATI-AMOL
 *
 */
public class SearchElementInArrayList {

	/**
	 * @param args
	 */
	
	public void getRegionData(List<MyExcelBean> readLocalExcelList){
		List<MyExcelBean> westRegionList = new ArrayList<MyExcelBean>();
		List<MyExcelBean> eastRegionList = new ArrayList<MyExcelBean>();
		List<MyExcelBean> centralRegionList = new ArrayList<MyExcelBean>();
		
		for(MyExcelBean bean : readLocalExcelList){
			if(bean.getRegion().equalsIgnoreCase("East")){
				eastRegionList.add(bean);				
			}else if(bean.getRegion().equalsIgnoreCase("West")){
				westRegionList.add(bean);				
			}else if(bean.getRegion().equalsIgnoreCase("Central")){
				centralRegionList.add(bean);				
			}
		}
		System.out.println(westRegionList.size());
		System.out.println(eastRegionList.size());
		System.out.println(centralRegionList.size());
	}
	
	public List<MyExcelBean> searchRegion(List<MyExcelBean> readLocalExcelList, String inputString){
		List<MyExcelBean> searchedList = new ArrayList<MyExcelBean>();
		
		for(MyExcelBean bean : readLocalExcelList){
			if(bean.getRegion().equalsIgnoreCase(inputString.toString().trim())){
				searchedList.add(bean);				
			}
		}
		return searchedList;
		
	}
	
	public void printList(List<MyExcelBean> inputList){
		
		inputList.forEach(action -> System.out.println(action.toString()));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadLocalExcel readLocalExcel = new ReadLocalExcel();		
		List<MyExcelBean> readLocalExcelList = readLocalExcel.getExcelDataAsArrayList();
		Collections.sort(readLocalExcelList, new MyExcelBean().NameComparator);
		
		SearchElementInArrayList searchElementInArrayList = new SearchElementInArrayList();
		searchElementInArrayList.printList(readLocalExcelList);
		searchElementInArrayList.getRegionData(readLocalExcelList);
		
		List<MyExcelBean> list = searchElementInArrayList.searchRegion(readLocalExcelList, args[0].toString().trim());
		searchElementInArrayList.printList(list);
		
		
	}

}
