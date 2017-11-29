package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class DbSelect {

	/***********************************************************************
	 * this method will select all the data and all the field that is in the
	 * table and print it out .
	 ***********************************************************************/
	public static void selectAllData() {
		try {
			String sql = null;
			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();

			sql = "SELECT * FROM Person;";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print("[" + rs.getInt(1));
				System.out.print(" " + rs.getString(2));
				System.out.print(" " + rs.getString(3));
				System.out.print(" " + rs.getInt(4));
				System.out.println("]");
			}

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***********************************************************************
	 * this method will select all the data that fill up our conditions, and
	 * then print them in the console .
	 ***********************************************************************/
	public static void selectSpecificData() {
		try {
			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();

			String sql = "SELECT first,last,age FROM Person where age>=25";
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				System.out.print("[" + rs.getString(1));
				System.out.print(" " + rs.getString(2));
				System.out.print(" " + rs.getInt(3));
				System.out.println("]");
			}
			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
