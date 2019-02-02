package com.dao;

import com.dto.Login;

public interface LoginDao
{
	String validate(int m_regId, String password);
	boolean insertRecord(Login l);
}

