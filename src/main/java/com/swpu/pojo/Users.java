package com.swpu.pojo;


/**
 * @author huang
 */
public class Users {
	/**
	 * 
	 */
	private Integer userId;
	private String username;
	private String password;
	private Integer localAuth;
	private String identity;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
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

	public Integer getLocalAuth() {
		return localAuth;
	}

	public void setLocalAuth(Integer localAuth) {
		this.localAuth = localAuth;
	}

	public String getIdentity() {
		return identity;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	@Override
	public String toString() {
		return "Users{" +
				"userId=" + userId +
				", username='" + username + '\'' +
				", password='" + password + '\'' +
				", localAuth=" + localAuth +
				", identity='" + identity + '\'' +
				'}';
	}
}
