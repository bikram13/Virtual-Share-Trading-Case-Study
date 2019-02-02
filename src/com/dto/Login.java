package com.dto;

public class Login 
{
	private int regId;
	private String password;
	
	public Login()
	{
		super();
	}
	
	public Login(int regId, String password) 
	{
		super();
		this.regId = regId;
		this.password = password;
	}

	public int getregId() 
	{
		return regId;
	}

	public void setregId(int regId)
	{
		this.regId = regId;
	}

	public String getPassword() 
	{
		return password;
	}

	public void setPassword(String password)
	{
		this.password = password;
	}
}
	