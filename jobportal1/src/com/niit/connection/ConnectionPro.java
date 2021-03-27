package com.niit.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionPro {

	private static Connection con;

	public static Connection getConnection() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			con = DriverManager.getConnection("jdbc:sqlserver://LAPTOP-9EDA795N/myhibernate", "sa", "niit@123");

		} catch (Exception e) {
			e.printStackTrace();
		}
		return con;
	}

}
