/**
 * 
 */
package com.tanwei.simplefactory;

/**
 * @author pc
 *面条店
 */
public class INoodlesStore {

/**
 * 客人进行进来找商家点单
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
