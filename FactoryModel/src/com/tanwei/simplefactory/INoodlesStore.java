/**
 * 
 */
package com.tanwei.simplefactory;

/**
 * @author pc
 *������
 */
public class INoodlesStore {

/**
 * ���˽��н������̼ҵ㵥
 * @param type
 * @return
 */
public INoodles orderPizza(int type){
	INoodles noodles;
	noodles=SimpleNoodlesFactory.createNoodles(type);
	noodles.desc();;
	return noodles;
}
}
