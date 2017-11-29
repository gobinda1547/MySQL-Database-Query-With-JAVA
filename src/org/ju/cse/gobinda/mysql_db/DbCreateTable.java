package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.Statement;

public class DbCreateTable {

	/***********************************************************************
	 * this method will create the table (named Person) normally
	 ***********************************************************************/
	public static void createTable() {

		try {
			StringBuilder sql = new StringBuilder();
			sql.append("CREATE TABLE Person(");
			sql.append("id INTEGER not NULL, ");
			sql.append("first VARCHAR(255), ");
			sql.append("last VARCHAR(255), ");
			sql.append("age INTEGER, ");
			sql.append("PRIMARY KEY(id))");

			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();
			stmt.executeUpdate(sql.toString());
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
