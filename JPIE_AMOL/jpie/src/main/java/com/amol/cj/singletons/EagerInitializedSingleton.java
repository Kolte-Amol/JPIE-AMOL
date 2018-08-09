/**
 * 
 */
package com.amol.cj.singletons;

/**
 * @author ARATI-AMOL
 *
 */
public class EagerInitializedSingleton {
	
private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();
    
    //private constructor to avoid client applications to use constructor
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
