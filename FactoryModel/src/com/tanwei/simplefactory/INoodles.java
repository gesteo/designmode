/**
 * 
 */
package com.tanwei.simplefactory;

/**
 * @author pc
 *抽象的工厂产品"披萨"
 *安装流程制作披萨
 */
public abstract class Pizza {
public abstract void prepare();
public abstract void bake();
public abstract void cut();
public abstract void box();
}
