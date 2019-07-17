/**
 * 
 */
package com.bwie.bean;

import java.util.List;

/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
public class Shop {
	private String sid;
	private String sname;
	private String sprice;
	private List<User> slist;
	/**
	 * @return the sid
	 */
	public String getSid() {
		return sid;
	}
	/**
	 * @param sid the sid to set
	 */
	public void setSid(String sid) {
		this.sid = sid;
	}
	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}
	/**
	 * @param sname the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
	}
	/**
	 * @return the sprice
	 */
	public String getSprice() {
		return sprice;
	}
	/**
	 * @param sprice the sprice to set
	 */
	public void setSprice(String sprice) {
		this.sprice = sprice;
	}
	/**
	 * @return the slist
	 */
	public List<User> getSlist() {
		return slist;
	}
	/**
	 * @param slist the slist to set
	 */
	public void setSlist(List<User> slist) {
		this.slist = slist;
	}
	/**
	 * @param sid
	 * @param sname
	 * @param sprice
	 * @param slist
	 */
	public Shop(String sid, String sname, String sprice, List<User> slist) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sprice = sprice;
		this.slist = slist;
	}
	/**
	 * 
	 */
	public Shop() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Shop [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice + "]";
	}
	
}
