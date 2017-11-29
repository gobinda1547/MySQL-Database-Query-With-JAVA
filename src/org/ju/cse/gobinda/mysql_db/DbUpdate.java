package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbUpdate {

	/***********************************************************************
	 * this method will update the table (named Person), we use statement object
	 * to implement this update operation
	 ***********************************************************************/
	public static void updateTableData1() {

		try {
			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();

			String sql = "UPDATE Person SET age = 30 WHERE id=1";
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/***********************************************************************
	 * this method will update the table (named Person), we use prepared
	 * statement object to implement this update operation
	 ***********************************************************************/
	public static void updateTableData2() {
		try {
			Connection conn = DbGetConnection.getDatabaseConnection();
			String sql = "UPDATE Person SET age = ? WHERE id=?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
			preparedStatement.setInt(2, 101);

			preparedStatement.execute();

			preparedStatement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
