/**
 * 
 */
package com.bwie.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bwie.bean.Shop;
import com.bwie.bean.UserExt;
import com.bwie.service.ListService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
@Controller
public class ListController {
	
	@Autowired
	private ListService service;
	
	@RequestMapping("list.do")
	public String listAll(HttpServletRequest req,@RequestParam(defaultValue="1")int pageNum,
			 			  @RequestParam(defaultValue="")String hname){
		int pageSize = 2;
		PageHelper.startPage(pageNum, pageSize);
		List<UserExt> list = service.listAll(hname);
		PageInfo<UserExt> pf = new PageInfo<>(list);
		req.setAttribute("hname", hname);
		req.setAttribute("list", list);
		req.setAttribute("pf", pf);
		return "list";
	}
	
	@RequestMapping("listShop.do")
	@ResponseBody
	public List<Shop> listShop(){
		List<Shop> list = service.listShop();
		return list;
	}
	
	
}
