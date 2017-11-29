package org.ju.cse.gobinda.mysql_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;

public class DbInsert {

	/***********************************************************************
	 * Here you can see already , that for inserting data into the database we
	 * use the statement object, and we insert 4 times.
	 ***********************************************************************/
	public static void insertDataWithStatement() {

		try {
			String sql = null;
			Connection conn = DbGetConnection.getDatabaseConnection();
			Statement stmt = conn.createStatement();

			sql = "INSERT INTO Person VALUES (200, 'Zara', 'Ali', 18)";
			stmt.executeUpdate(sql);

			sql = "INSERT INTO Person VALUES (301, 'Mahnaz', 'Fatma', 25)";
			stmt.executeUpdate(sql);

			sql = "INSERT INTO Person VALUES (402, 'Zaid', 'Khan', 30)";
			stmt.executeUpdate(sql);

			sql = "INSERT INTO Person VALUES(503, 'Sumit', 'Mittal', 28)";
			stmt.executeUpdate(sql);

			stmt.close();
			conn.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/***********************************************************************
	 * Here you can see already , that for inserting data into the database we
	 * use the prepared statement object and we used it also.
	 ***********************************************************************/

	public static void insertWithPreparedStatement() {

		try {
			Connection connection = DbGetConnection.getDatabaseConnection();
			PreparedStatement insertPreparedStatement = null;
			String InsertQuery = "INSERT INTO Person (id, first, last,age) values (?,?,?,?)";

			connection.setAutoCommit(false);

			insertPreparedStatement = connection.prepareStatement(InsertQuery);
			insertPreparedStatement.setInt(1, 1);
			insertPreparedStatement.setString(2, "gobinda");
			insertPreparedStatement.setString(3, "paul");
			insertPreparedStatement.setInt(4, 24);

			insertPreparedStatement.executeUpdate();
			insertPreparedStatement.close();

			connection.commit();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
