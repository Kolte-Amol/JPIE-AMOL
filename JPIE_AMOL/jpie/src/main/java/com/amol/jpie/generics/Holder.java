/**
 * 
 */
package com.amol.jpie.generics;

/**
 * @author ARATI-AMOL
 *
 */
public class Holder <T>{

	/**
	 * @param argss
	 */
	private T a;
	private T b;
	private T c;
	
	public Holder(T a,T b,T c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public T geta(){
		return a;
	}
	
	public T getb(){
		return b;
	}
	public T getc(){
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Holder <Automobile> holder = new Holder(new Automobile(),new Automobile(),new Automobile());
		
		System.out.println(holder.geta().toString()+" "+holder.getb().toString()+" "+holder.getc().toString());
	}

}
