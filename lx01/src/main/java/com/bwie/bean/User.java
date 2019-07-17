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
public class User {
	private Integer uid;
	private String uname;
	private String datea;
	private List<Shop> ulist;
	/**
	 * @return the uid
	 */
	public Integer getUid() {
		return uid;
	}
	/**
	 * @param uid the uid to set
	 */
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	/**
	 * @return the uname
	 */
	public String getUname() {
		return uname;
	}
	/**
	 * @param uname the uname to set
	 */
	public void setUname(String uname) {
		this.uname = uname;
	}
	/**
	 * @return the datea
	 */
	public String getDatea() {
		return datea;
	}
	/**
	 * @param datea the datea to set
	 */
	public void setDatea(String datea) {
		this.datea = datea;
	}
	/**
	 * @return the ulist
	 */
	public List<Shop> getUlist() {
		return ulist;
	}
	/**
	 * @param ulist the ulist to set
	 */
	public void setUlist(List<Shop> ulist) {
		this.ulist = ulist;
	}
	/**
	 * @param uid
	 * @param uname
	 * @param datea
	 * @param ulist
	 */
	public User(Integer uid, String uname, String datea, List<Shop> ulist) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.datea = datea;
		this.ulist = ulist;
	}
	/**
	 * 
	 */
	public User() {
		super();
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", datea=" + datea + ", ulist=" + ulist + "]";
	}
	
}
