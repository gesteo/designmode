/**
 * 
 */
package com.tanwei.simplefactory;

import com.tanwei.simplefactory.pizzaproduct.CheesePizza;
import com.tanwei.simplefactory.pizzaproduct.VegglePizza;

/**
 * @author pc
 * ��������
 */
public class SimplePizzaFactory {
   /**
    * ���ԵĿͻ��ô˹�����ʵ�����¶���
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
