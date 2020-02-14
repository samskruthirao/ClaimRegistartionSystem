package com.cg.dao;

import com.cg.service.UserroleDto;

public interface ILoginDAO {

	public boolean validate(UserroleDto user);
	
	public String getRoleCode(UserroleDto user);
}
