package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.cg.jdbcutility.JdbcUtility;
import com.cg.service.UserroleDto;

public class LoginDAOImpl implements ILoginDAO {

	PreparedStatement statement = null;
	ResultSet resultSet = null;
	
	@Override
	public boolean validate(UserroleDto user) {
		Connection con = JdbcUtility.getConnection();

		boolean validateFlag = false;
		try {
			statement = con.prepareStatement("select * from user_role where user_name=? and password=?");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			resultSet = statement.executeQuery();
			validateFlag = resultSet.next();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		return validateFlag;
		
		
	}


	@Override
	public String getRoleCode(UserroleDto user) {
		
		String roleCode = null;
		Connection con = JdbcUtility.getConnection();
		try {
			statement = con.prepareStatement("select role_code from user_role where user_name=? and password=?");
			statement.setString(1, user.getUsername());
			statement.setString(2, user.getPassword());

			resultSet = statement.executeQuery();
			resultSet.next();
			roleCode = resultSet.getString("role_code");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				statement.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}

			try {
				con.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return roleCode;
	}
	
}
