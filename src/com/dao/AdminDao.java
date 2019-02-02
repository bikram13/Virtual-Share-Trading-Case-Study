package com.dao;

import com.dto.Company;

public interface AdminDao 
{
	boolean insert(Company c);
	boolean update(Company c);
}
