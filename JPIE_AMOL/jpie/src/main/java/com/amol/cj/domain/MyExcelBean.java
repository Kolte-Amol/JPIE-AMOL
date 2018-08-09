/**
 * 
 */
package com.amol.cj.domain;

import java.util.Comparator;

/**
 * @author ARATI-AMOL
 *
 */
public class MyExcelBean implements Comparable<MyExcelBean>{

	private Integer srno;
	private String orderDate;
	private String region;
	private String name;
	private String item;
	private Integer unit;
	private Double unitCost;
	private Double totalCost;
	/**
	 * @return the srno
	 */
	public Integer getSrno() {
		return srno;
	}
	/**
	 * @param srno the srno to set
	 */
	public void setSrno(Integer srno) {
		this.srno = srno;
	}
	/**
	 * @return the orderDate
	 */
	public String getOrderDate() {
		return orderDate;
	}
	/**
	 * @param orderDate the orderDate to set
	 */
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	/**
	 * @return the region
	 */
	public String getRegion() {
		return region;
	}
	/**
	 * @param region the region to set
	 */
	public void setRegion(String region) {
		this.region = region;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the item
	 */
	public String getItem() {
		return item;
	}
	/**
	 * @param item the item to set
	 */
	public void setItem(String item) {
		this.item = item;
	}
	/**
	 * @return the unit
	 */
	public Integer getUnit() {
		return unit;
	}
	/**
	 * @param unit the unit to set
	 */
	public void setUnit(Integer unit) {
		this.unit = unit;
	}
	/**
	 * @return the unitCost
	 */
	public Double getUnitCost() {
		return unitCost;
	}
	/**
	 * @param unitCost the unitCost to set
	 */
	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}
	/**
	 * @return the totalCost
	 */
	public Double getTotalCost() {
		return totalCost;
	}
	/**
	 * @param totalCost the totalCost to set
	 */
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((orderDate == null) ? 0 : orderDate.hashCode());
		result = prime * result + ((region == null) ? 0 : region.hashCode());
		result = prime * result + ((srno == null) ? 0 : srno.hashCode());
		result = prime * result + ((totalCost == null) ? 0 : totalCost.hashCode());
		result = prime * result + ((unit == null) ? 0 : unit.hashCode());
		result = prime * result + ((unitCost == null) ? 0 : unitCost.hashCode());
		return result;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyExcelBean other = (MyExcelBean) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (orderDate == null) {
			if (other.orderDate != null)
				return false;
		} else if (!orderDate.equals(other.orderDate))
			return false;
		if (region == null) {
			if (other.region != null)
				return false;
		} else if (!region.equals(other.region))
			return false;
		if (srno == null) {
			if (other.srno != null)
				return false;
		} else if (!srno.equals(other.srno))
			return false;
		if (totalCost == null) {
			if (other.totalCost != null)
				return false;
		} else if (!totalCost.equals(other.totalCost))
			return false;
		if (unit == null) {
			if (other.unit != null)
				return false;
		} else if (!unit.equals(other.unit))
			return false;
		if (unitCost == null) {
			if (other.unitCost != null)
				return false;
		} else if (!unitCost.equals(other.unitCost))
			return false;
		return true;
	}
	
	
	
	public static final Comparator<MyExcelBean> OrderDateComparator = new Comparator<MyExcelBean>(){

        @Override
        public int compare(MyExcelBean o1, MyExcelBean o2) {
        	 return o1.orderDate.compareTo(o2.orderDate);            
        }
      
    };
    
    
    public static final Comparator<MyExcelBean> NameComparator = new Comparator<MyExcelBean>(){

        @Override
        public int compare(MyExcelBean o1, MyExcelBean o2) {
        	 return o1.name.compareTo(o2.name);            
        }
      
    };
    
    public static final Comparator<MyExcelBean> ItemComparator = new Comparator<MyExcelBean>(){

        @Override
        public int compare(MyExcelBean o1, MyExcelBean o2) {
        	 return o1.item.compareTo(o2.item);            
        }
      
    };
    
    public static final Comparator<MyExcelBean> UnitCostComparator = new Comparator<MyExcelBean>(){

        @Override
        public int compare(MyExcelBean o1, MyExcelBean o2) {
        	 return o1.unitCost.compareTo(o2.unitCost);            
        }
      
    };
    
    public static final Comparator<MyExcelBean> TotalCostComparator = new Comparator<MyExcelBean>(){

        @Override
        public int compare(MyExcelBean o1, MyExcelBean o2) {
        	 return o1.totalCost.compareTo(o2.totalCost);            
        }
      
    };
    
	@Override
	public int compareTo(MyExcelBean o) {
		// TODO Auto-generated method stub
		return this.srno - o.srno;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "MyExcelBean [srno=" + srno + ", orderDate=" + orderDate + ", region=" + region + ", name=" + name
				+ ", item=" + item + ", unit=" + unit + ", unitCost=" + unitCost + ", totalCost=" + totalCost + "]";
	}
	
	
}
