/**
 * 
 */
package com.amol.cj.ioe;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.amol.cj.domain.MyExcelBean;

/**
 * @author ARATI-AMOL
 *
 */
public class ReadLocalExcel {

	private static final String FILE_NAME = "B:\\Test Data.xlsx";
	
	public List<MyExcelBean> getExcelDataAsArrayList(){
		
		List<MyExcelBean> myExcelBeanList = new ArrayList<MyExcelBean>();
		try{
			FileInputStream fs = new FileInputStream(FILE_NAME);
	        Workbook workbook =  new XSSFWorkbook(fs);
	        Sheet sheet = workbook.getSheetAt(0);

	        int totalNoOfRows = 44;
	        int totalNoOfCols = 8;
	        for (int r = 0; r < totalNoOfRows; r++) {
	        	if(r!=0){
	        		Row row=sheet.getRow(r);
	        		MyExcelBean myExcelBean= new MyExcelBean();
	        		for (int col = 0; col < totalNoOfCols; col++) {
	        			Cell cell=row.getCell(col);
	        			
	        			if(col==0){
	        				if(cell!=null){
	                        	DataFormatter formatter = new DataFormatter();
	                            String srno = formatter.formatCellValue(cell);
	                            myExcelBean.setSrno(Integer.valueOf(srno));
	        				}
	                           
	                    }else if(col==1){
	                    	if(cell!=null){
	                    		DataFormatter formatter = new DataFormatter();
	                            String orderDate = formatter.formatCellValue(cell);
	                            myExcelBean.setOrderDate(orderDate);
	                    	}
	                    }else if(col==2){
	                        	myExcelBean.setRegion(cell.getStringCellValue());
	                    }else if(col==3){  
	                        	myExcelBean.setName(cell.getStringCellValue());
	                    }else if(col==4){
	                        	myExcelBean.setItem(cell.getStringCellValue());
	                    }else if(col==5){
	                    	if(cell!=null){
	                        	DataFormatter formatter = new DataFormatter();
	                            String unit = formatter.formatCellValue(cell);
	                            myExcelBean.setUnit(Integer.valueOf(unit));
	        				}	
	                    }else if(col==6){
	                    	DataFormatter formatter = new DataFormatter();
                            String unitCost = formatter.formatCellValue(cell);
                            myExcelBean.setUnitCost(Double.valueOf(unitCost));
	                    }else if(col==7){
	                    	if(cell!=null){
	                        	DataFormatter formatter = new DataFormatter();
	                            String totalCost = formatter.formatCellValue(cell);
	                            myExcelBean.setTotalCost(Double.valueOf(totalCost));
	        				}	
	                    }
	        		}
	        		
	        		myExcelBeanList.add(myExcelBean);
	        	}   
	        }
                
	        
		}catch (IOException e){
            e.printStackTrace();
        }
		
		return myExcelBeanList;
	}
	
	public Map<Integer, MyExcelBean> getExcelDataAsHashMap(){
		List<MyExcelBean> myExcelBeanList= getExcelDataAsArrayList();
		Map<Integer, MyExcelBean> mapFromLocalExcel = new HashMap<Integer, MyExcelBean>();
		if(!(myExcelBeanList.isEmpty()) && (myExcelBeanList != null)){
			for(MyExcelBean bean : myExcelBeanList){
				mapFromLocalExcel.put(bean.getSrno(), bean);
			}
		}
		
		return mapFromLocalExcel;		
	}
	
	public Set<MyExcelBean> getExcelDataAsHashSet(){
		
		List<MyExcelBean> myExcelBeanList= getExcelDataAsArrayList();
		Set<MyExcelBean> set = new HashSet<MyExcelBean>(myExcelBeanList);
		
		return set;
	}
	
	public Set<MyExcelBean> getExcelDataAsTreeSet(){
		
		List<MyExcelBean> myExcelBeanList= getExcelDataAsArrayList();
		Set<MyExcelBean> set = new TreeSet<MyExcelBean>(myExcelBeanList);
		
		return set;
	}
	
	public List<MyExcelBean> getExcelDataAsLinkedList(){
		
		List<MyExcelBean> myExcelBeanList= getExcelDataAsArrayList();
		List<MyExcelBean> list = new LinkedList<MyExcelBean>(myExcelBeanList);
		
		return list;
	}
	
	public Map<Integer, MyExcelBean> getExcelDataAsTreeMap(){
		
		Map<Integer, MyExcelBean> mapFromLocalExcel = getExcelDataAsHashMap();
		Map<Integer, MyExcelBean> treeMap = new TreeMap<Integer, MyExcelBean>(mapFromLocalExcel);
		return treeMap;		
	}
}
