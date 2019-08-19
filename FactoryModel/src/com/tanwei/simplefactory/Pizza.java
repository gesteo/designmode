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
 abstract void prepare();
 abstract void bake();
 abstract void cut();
 abstract void box();
}
