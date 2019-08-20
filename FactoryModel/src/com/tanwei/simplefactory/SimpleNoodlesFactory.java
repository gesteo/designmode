/**
 * �ص�
 * 1 ����һ��������� ���ǽӿڳ����࣬��һ����Ҫ��create()����������if 
 *   ����switch������Ʒ�����ؾ���Ĳ�Ʒ��
 * 2 create��������ͨ���Ǿ�̬�ģ�����Ҳ��Ϊ��̬����
 * 
 * ȱ��
 * 1 ��չ�Բ�(��������һ����������������һ��������Ʒ�࣬����Ҫ�޸Ĺ����෽��)
 * 2 ��ͬ�Ĳ�Ʒ��Ҫ��ͬ�Ķ��������ʱ��֧�֡�
 */
package com.tanwei.simplefactory;

import com.tanwei.simplefactory.pizzaproduct.GanBanNoodles;
import com.tanwei.simplefactory.pizzaproduct.LzNoodles;
import com.tanwei.simplefactory.pizzaproduct.PaoNoodles;

/**
 * @author pc
 * ��������
 */
public class SimpleNoodlesFactory {
	public static final int TYPE_LZ=1;//��������
	public static final int TYPE_PM=2;//����
   /**
    * �ô˹�����ʵ�����¶���(�������Ϊ�˵�)��
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
