package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbGetConnection {

	/***********************************************************************
	 * this method will give you a Connection object back , which contain the
	 * connection with person database, of the given URL
	 ***********************************************************************/
	public static Connection getDatabaseConnection() {

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost/person";
		String USER = "username";
		String PASS = "password";

		try {
			Class.forName(JDBC_DRIVER);
			return DriverManager.getConnection(DB_URL, USER, PASS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

}
