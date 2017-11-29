package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbDelete {

	/***********************************************************************
	 * this method will delete all the data that full fills our condition. we
	 * use statement object to perform this operation.
	 ***********************************************************************/
	public static void deleteDataUsingStatement() {
		try {
			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();

			String sql = "DELETE FROM Person WHERE id = 1";
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***********************************************************************
	 * this method will delete all the data that full fills our condition. we
	 * use prepared statement object to perform this operation.
	 ***********************************************************************/
	public static void deleteDataUsingPreparedStatement() {
		try {
			Connection conn = DbGetConnection.getDatabaseConnection();
			String sql = "DELETE FROM Person WHERE id = ?";

			PreparedStatement preparedStatement = conn.prepareStatement(sql);
			preparedStatement.setInt(1, 1);
			preparedStatement.execute();

			preparedStatement.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
