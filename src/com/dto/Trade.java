package com.dto;

public class Trade 
{
	private int regId;
	private int companyId;
	private float amount;
	
	public Trade()
	{
		super();
	}

	public Trade(int regId, int companyId,float amount)
	{
		super();
		this.regId = regId;
		this.companyId = companyId;
		this.amount = amount;
	}

	public int getRegId()
	{
		return regId;
	}

	public void setRegId(int regId)
	{
		this.regId = regId;
	}

	public int getCompanyId()
	{
		return companyId;
	}

	public void setCompanyId(int companyId) 
	{
		this.companyId = companyId;
	}

	public float getAmount() 
	{
		return amount;
	}

	public void setAccount(float amount) 
	{
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Trade [regId=" + regId + ", companyId=" + companyId
				+ ", amount=" + amount + "]";
	}


	
}