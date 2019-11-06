package com.bw.entity;

public class User {
	private Integer uid;
	private String username;
	private String password;
	private Integer rolecode;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getRolecode() {
		return rolecode;
	}
	public void setRolecode(Integer rolecode) {
		this.rolecode = rolecode;
	}
	public User(Integer uid, String username, String password, Integer rolecode) {
		super();
		this.uid = uid;
		this.username = username;
		this.password = password;
		this.rolecode = rolecode;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", username=" + username + ", password=" + password + ", rolecode=" + rolecode
				+ "]";
	}
	
}
