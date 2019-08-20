/**
 * 特点
 * 1 它是一个具体的类 ，非接口抽象类，有一个重要的create()方法，利用if 
 *   或者switch创建产品并返回具体的产品类
 * 2 create（）方法通常是静态的，所以也称为静态工厂
 * 
 * 缺点
 * 1 扩展性差(我想增加一种面条，除了新增一个面条产品类，还需要修改工厂类方法)
 * 2 不同的产品需要不同的额外参数的时候不支持。
 */
package com.tanwei.simplefactory;

import com.tanwei.simplefactory.pizzaproduct.GanBanNoodles;
import com.tanwei.simplefactory.pizzaproduct.LzNoodles;
import com.tanwei.simplefactory.pizzaproduct.PaoNoodles;

/**
 * @author pc
 * 面条工厂
 */
public class SimpleNoodlesFactory {
	public static final int TYPE_LZ=1;//兰州拉面
	public static final int TYPE_PM=2;//泡面
   /**
    * 用此工厂来实例化新对象(可以理解为菜单)。
    * @param type
    * @return
    */
	public static  INoodles createNoodles(int type){
		switch(type){
		case TYPE_LZ:
			return new LzNoodles();
		case TYPE_PM:
			return new PaoNoodles();
		default:
			return new GanBanNoodles();
		}
		
	}
}
