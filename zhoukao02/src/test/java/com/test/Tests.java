/**
 * 
 */
package com.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;

import com.utils.Utilss;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月15日
 */
public class Tests {
	
	@Test
	public void isTrue(){
		//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
		try {
			Utilss.isTrue(true, "为真");
			//Utilss.isFalse(false, "为假");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void isFalse(){
		//方法1：断言为真，如果为假，则抛出自定义异常，异常消息为第2个参数默认消息。 (5分)
		try {
			//Utilss.isTrue(true, "为真");
			Utilss.isFalse(false, "如果为假，则抛出自定义异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void notNull(){
//		测试AssertUtil.notNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）
		try {
			Utilss.notNull("不为空", "不为空");
			//Utilss.notNull("", "为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void isNull(){
//		测试AssertUtil.isNull()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
		try {
			Utilss.isNull("为空", "为空");
			//Utilss.isNull("不为空", "不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	@Test
	public void notEmpty(){
//		用List对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
		try {
			List<Integer> coll = new ArrayList<Integer>();
			Utilss.notEmpty(coll, "为空");
			//coll.add(1);
			//Utilss.notEmpty(coll, "不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void isEmpty(){
//		用Map对象测试AssertUtil.notEmpty()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
		try {
			Map<Integer,String> coll = new HashMap<>();
			Utilss.isEmpty(coll, "为空");
			//coll.put(1, "1");
			//Utilss.isEmpty(coll, "不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@Test
	public void hasText(){
//		用String对象测试AssertUtil.hasText()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
		try {
			Utilss.hasText("", "为空且没有值");
			//Utilss.hasText("qweeqr", "有值不为空");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Test
	public void greaterThanZero(){
//		测试AssertUtil. greaterThanZero()方法，通过断言测一次（2分），不能通过断言测一次（2分）。
		try {
			Utilss.greaterThanZero(1, "大于0");
			//Utilss.greaterThanZero(0, "小于0或等于0，会抛异常");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
