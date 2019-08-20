/**
 * 
 */
package com.tanwei.simplefactory;

import com.tanwei.simplefactory.pizzaproduct.CheesePizza;
import com.tanwei.simplefactory.pizzaproduct.VegglePizza;

/**
 * @author pc
 * 披萨工厂
 */
public class SimplePizzaFactory {
   /**
    * 所以的客户用此工厂来实例化新对象。
    * @param type
    * @return
    */
	public Pizza createPizza(String type){
		Pizza pizza=null;
		if(type.equals("cheese")){
		pizza=new CheesePizza();	
		}else if(type.equals("veggle")){
		pizza=new VegglePizza();	
		}
		return pizza;
		
	}
}
