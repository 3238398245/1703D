/**
 * 
 */
package com.bwie.bean;


/**
 * @姓名：董天宇
 *
 * @时间：2019年7月10日
 */
public class UserExt extends User{
	private String sid;
	private String sname;
	private String sprice;
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
	
	public UserExt() {
		
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "UserExt [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice + "]";
	}
	
	
}
