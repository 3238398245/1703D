/**
 * 
 */
package com.bwie.service;

import java.util.List;

import com.bwie.bean.Shop;
import com.bwie.bean.UserExt;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
public interface ListService {

	/**
	 * @param hname 
	 * @return
	 */
	public List<UserExt> listAll(String hname);

	/**
	 * @return
	 */
	public List<Shop> listShop();
	
	
}
