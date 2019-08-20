/**
 * 
 */
package com.tanwei.simplefactory.pizzaproduct;

import com.tanwei.simplefactory.INoodles;

/**
 * @author pc
 * 具体的产品cheesePizza
 */
public class LzNoodles  extends INoodles {

	@Override
	public void desc() {
		System.out.println("兰州拉面，上海的好贵，家里才五六块钱一碗");
	}

	
}
