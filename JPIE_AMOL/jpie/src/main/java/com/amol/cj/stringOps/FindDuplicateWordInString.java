/**
 * 
 */
package com.amol.cj.stringOps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.Map.Entry;

import com.amol.cj.domain.MyExcelBean;

/**
 * @author ARATI-AMOL
 *
 */
public class FindDuplicateWordInString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner(System.in);		
		System.out.println("Enter a String");		
		String str = reader.nextLine().toString();
		System.out.println(str);
		
		String [] strr = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		
		for(int i = 0; i < (strr.length);i++){
			
			if(!map.containsKey(strr[i])){
				int count =1;
				for(int j = i+1; j != strr.length; j++){
					if(strr[i].equals(strr[j])){
						count++;
					}
				}
				map.put(strr[i], count);
			}
		}
		
		for(Map.Entry<String, Integer> ent: map.entrySet()){
			
			System.out.println("Key= "+ ent.getKey() +" Value= "+ent.getValue());
		}
		
		Set<Entry<String, Integer>> set = map.entrySet();
		List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
		Collections.sort(list, new Comparator<Map.Entry<String, Integer>>(){

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				//	return (o2.getKey()).compareTo( o1.getKey());
					return (o1.getValue()).compareTo( o2.getValue());
			}
			
		});
		
		for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
        }
		
		int i=1;
		for(Map.Entry<String, Integer> entry:list){
			if(i==list.size()){
				 System.out.println(entry.getKey()+" ==== "+entry.getValue().toString());
			}
           i++;
        }
	}

}
