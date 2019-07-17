/**
 * 
 */
package com.bwie.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.bwie.bean.Shop;
import com.bwie.bean.UserExt;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
public interface UserMapper {

	/**
	 * @param hname 
	 * @return
	 */
	public List<UserExt> seleAll(@Param("hname")String hname);

	/**
	 * @return
	 */
	public List<Shop> seleShop();

}
