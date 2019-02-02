package com.dao;

import com.dto.Company;
import com.dto.UserDetails;

public interface UserDetailsDao
{
	boolean insertRecord(UserDetails ud);
	boolean displayRecord(Company c);
}
