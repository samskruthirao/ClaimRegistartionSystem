package com.cg.jdbcutility;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtility {
	
	public static Connection getConnection() {

		Connection con = null;
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		String username = "system";
		String password = "123456";

		try {
			Class.forName(driver);
		} catch (Exception e) {
			e.printStackTrace();
		}

		try {
			con = DriverManager.getConnection(url, username, password);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}
}
