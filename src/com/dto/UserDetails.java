package com.dto;

public class UserDetails 
{
	private int regId;
	private String name;
	private long mobileNo;
	private String emailId;
	private String password;
	
	public UserDetails()
	{
		super();
	}
	
	public UserDetails(int regId, String name, long mobileNo, String emailId,
			String password) 
	{
		super();
		this.regId = regId;
		this.name = name;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.password = password;
	}

	public int getRegId() 
	{
		return regId;
	}

	public String getName()
	{
		return name;
	}

	public long getMobileNo() 
	{
		return mobileNo;
	}

	public String getEmailId() 
	{
		return emailId;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setRegId(int regId) 
	{
		this.regId = regId;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setMobileNo(long mobileNo) 
	{
		this.mobileNo = mobileNo;
	}

	public void setEmailId(String emailId) 
	{
		this.emailId = emailId;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}

	public String toString() 
	{
		return "UserDetails [regId=" + regId + ", name=" + name + ", mobileNo="
				+ mobileNo + ", emailId=" + emailId + ", password=" + password
				+ "]";
	}
}


