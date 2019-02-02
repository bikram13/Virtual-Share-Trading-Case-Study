package com.dto;

public class Company
{
	private int companyId;
	private String companyName;
	private int numberOfShares;
	private float priceOfShare;
	
	public Company() 
	{
		super();
	}
	
	public Company(int companyId, int numberOfShares, float priceOfShare)
	{
		super();
		this.companyId = companyId;
		this.numberOfShares = numberOfShares;
		this.priceOfShare = priceOfShare;
	}

	public Company(int companyId, String companyName, int numberOfShares) 
	{
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.numberOfShares = numberOfShares;
	}

	public Company(int companyId, String companyName, int numberOfShares,
			float priceOfShare) 
	{
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		this.numberOfShares = numberOfShares;
		this.priceOfShare = priceOfShare;
	}

	public int getCompanyId()
	{
		return companyId;
	}

	public String getCompanyName() 
	{
		return companyName;
	}

	public int getNumberOfShares() 
	{
		return numberOfShares;
	}

	public float getPriceOfShare() 
	{
		return priceOfShare;
	}

	public void setCompanyId(int companyId) 
	{
		this.companyId = companyId;
	}

	public void setCompanyName(String companyName) 
	{
		this.companyName = companyName;
	}

	public void setNumberOfShares(int numberOfShares)
	{
		this.numberOfShares = numberOfShares;
	}

	public void setPriceOfShare(float priceOfShare)
	{
		this.priceOfShare = priceOfShare;
	}

	public String toString() 
	{
		return "Company [companyId=" + companyId + ", companyName="
				+ companyName + ", numberOfShares=" + numberOfShares
				+ ", priceOfShare=" + priceOfShare + "]";
	}
}
