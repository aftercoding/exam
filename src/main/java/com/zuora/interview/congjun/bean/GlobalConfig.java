package com.zuora.interview.congjun.bean;
/**
 *  Global configuration bean
 * 
 * 
 * @author Congjun
 * */
public class GlobalConfig {
	private String userName = "";
	private String password = "";
	private String URLPrefix = "";
	private String DB_URL = "";
	private String DB_User = "";
	private String DB_Password = "";
	
	private GlobalConfig() {
		
	}
	
	private static GlobalConfig instance = new GlobalConfig();
	
	public  static GlobalConfig getInstance() {
		return instance;
	} 

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getURLPrefix() {
		return URLPrefix;
	}

	public void setURLPrefix(String uRLPrefix) {
		URLPrefix = uRLPrefix;
	}

	public String getDB_URL() {
		return DB_URL;
	}

	public void setDB_URL(String dB_URL) {
		DB_URL = dB_URL;
	}

	public String getDB_User() {
		return DB_User;
	}

	public void setDB_User(String dB_User) {
		DB_User = dB_User;
	}

	public String getDB_Password() {
		return DB_Password;
	}

	public void setDB_Password(String dB_Password) {
		DB_Password = dB_Password;
	}

	@Override
	public String toString() {
		return "GlobalConfig [userName=" + userName + ", password=" + password + ", URLPrefix=" + URLPrefix
				+ ", DB_URL=" + DB_URL + ", DB_User=" + DB_User + ", DB_Password=" + DB_Password + "]";
	}

}
