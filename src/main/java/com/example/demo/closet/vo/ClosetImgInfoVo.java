package com.example.demo.closet.vo;

public class ClosetImgInfoVo {
	private String clothImgName; // primary key
	private String clothImgRealName;
	private String clothImgFileSize;
	private String clothImgExtension;
	private String clothImgFolder;
	private String clothImgTime;
	
	// foreign key
	private String username;
	private String userNickname;
	private int userId;
	
	// getter and setter
	public String getClothImgName() {
		return clothImgName;
	}
	public void setClothImgName(String clothImgName) {
		this.clothImgName = clothImgName;
	}
	public String getClothImgRealName() {
		return clothImgRealName;
	}
	public void setClothImgRealName(String clothImgRealName) {
		this.clothImgRealName = clothImgRealName;
	}
	public String getClothImgFileSize() {
		return clothImgFileSize;
	}
	public void setClothImgFileSize(String clothImgFileSize) {
		this.clothImgFileSize = clothImgFileSize;
	}
	public String getClothImgExtension() {
		return clothImgExtension;
	}
	public void setClothImgExtension(String clothImgExtension) {
		this.clothImgExtension = clothImgExtension;
	}
	public String getClothImgFolder() {
		return clothImgFolder;
	}
	public void setClothImgFolder(String clothImgFolder) {
		this.clothImgFolder = clothImgFolder;
	}
	public String getClothImgTime() {
		return clothImgTime;
	}
	public void setClothImgTime(String clothImgTime) {
		this.clothImgTime = clothImgTime;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUserNickname() {
		return userNickname;
	}
	public void setUserNickname(String userNickname) {
		this.userNickname = userNickname;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}