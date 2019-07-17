/**
 * 
 */
package com.bwie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bwie.bean.Shop;
import com.bwie.bean.UserExt;
import com.bwie.mapper.UserMapper;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
@Service
@Transactional
public class ListServiceImpl implements ListService{
	
	@Autowired
	private UserMapper map;

	/* (non-Javadoc)
	 * @see com.bwie.service.ListService#listAll()
	 */
	@Override
	public List<UserExt> listAll(String hname) {
		// TODO Auto-generated method stub
		return map.seleAll(hname);
	}

	/* (non-Javadoc)
	 * @see com.bwie.service.ListService#listShop()
	 */
	@Override
	public List<Shop> listShop() {
		// TODO Auto-generated method stub
		return map.seleShop();
	}
	
}
