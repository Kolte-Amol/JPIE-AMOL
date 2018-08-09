/**
 * 
 */
package com.amol.cj.mapOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.amol.cj.domain.MyExcelBean;
import com.amol.cj.ioe.ReadLocalExcel;

/**
 * @author ARATI-AMOL
 *
 */
public class DisplayMapData {

	/**
	 * @param args
	 */
	public void sortHashMapOnKey(Map<Integer, MyExcelBean> beanMap){
		Set<Entry<Integer, MyExcelBean>> set = beanMap.entrySet();
		List<Entry<Integer, MyExcelBean>> list = new ArrayList<Entry<Integer, MyExcelBean>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, MyExcelBean>>(){

			@Override
			public int compare(Entry<Integer, MyExcelBean> o1, Entry<Integer, MyExcelBean> o2) {
				//	return (o2.getKey()).compareTo( o1.getKey());
					return (o1.getKey()).compareTo( o2.getKey());
			}
			
		});
		
		 System.out.println("---------------Sorted Keys of Map---------------------");
		for(Map.Entry<Integer, MyExcelBean> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
        }
		System.out.println("---------------Higest Key ---------------------");
		
		int i=1;
		for(Map.Entry<Integer, MyExcelBean> entry:list){
			if(i==beanMap.size()){
				 System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
			}
           i++;
        }
		
		
	}
	
	public void sortHashMap(Map<Integer, MyExcelBean> beanMap){
		Set<Entry<Integer, MyExcelBean>> set = beanMap.entrySet();
		List<Entry<Integer, MyExcelBean>> list = new ArrayList<Entry<Integer, MyExcelBean>>(set);
		Collections.sort(list, new Comparator<Map.Entry<Integer, MyExcelBean>>(){

			@Override
			public int compare(Entry<Integer, MyExcelBean> o1, Entry<Integer, MyExcelBean> o2) {
			//	return (o2.getValue().getUnitCost()).compareTo( o1.getValue().getUnitCost());
				
				return (o1.getValue().getUnitCost()).compareTo( o2.getValue().getUnitCost());
			}
			
		});
		
		 System.out.println("---------------Sorted Map---------------------");
		for(Map.Entry<Integer, MyExcelBean> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
        }
		System.out.println("---------------Higest Cost---------------------");
		
		int i=1;
		for(Map.Entry<Integer, MyExcelBean> entry:list){
			if(i==beanMap.size()){
				 System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
			}
           i++;
        }
		
		Map <Integer, MyExcelBean> tempMap = new HashMap<Integer, MyExcelBean>();
		for(Map.Entry<Integer, MyExcelBean> entry:list){			
				 tempMap.put(entry.getKey(), entry.getValue());	
        }
		sortHashMapOnKey(tempMap);
		
	}
	public void searchForKeyInMap(Map<Integer, MyExcelBean> beanMap){
		
		if(beanMap.containsKey(28)){
			for(Map.Entry<Integer, MyExcelBean> entry : beanMap.entrySet()){			
					if(entry.getKey().equals(28)){
						System.out.println(entry.getKey());
						System.out.println(entry.getValue().toString());
					}
			}
			
		}
	}
	
	public void displayAllMapValues(Map<Integer, MyExcelBean> beanMap){
		
		for(MyExcelBean entry : beanMap.values()){			
			System.out.println(entry.toString());			
		}
	}
	
	public void displayAllMapKeys(Map<Integer, MyExcelBean> beanMap){
		
		for(Integer entry : beanMap.keySet()){			
			System.out.println(entry);			
		}
	}
	
	public void displayAllMapData(Map<Integer, MyExcelBean> beanMap){
		
		for(Map.Entry<Integer, MyExcelBean> entry : beanMap.entrySet()){
			
			System.out.println(entry.getKey());
			System.out.println(entry.getValue().toString());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ReadLocalExcel readLocalExcel = new ReadLocalExcel();
		DisplayMapData displayMapData = new DisplayMapData();
		
		Map<Integer, MyExcelBean> beanMap = readLocalExcel.getExcelDataAsHashMap();
		
		displayMapData.displayAllMapData(beanMap);		
		displayMapData.displayAllMapKeys(beanMap);
		displayMapData.displayAllMapValues(beanMap);
		displayMapData.searchForKeyInMap(beanMap);
		displayMapData.sortHashMap(beanMap);

	}

}
