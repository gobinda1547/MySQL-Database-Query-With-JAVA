package org.ju.cse.gobinda.mysql_db;

public class Main {

	public static void main(String[] args) {

		// for getting the database connection
		DbGetConnection.getDatabaseConnection();

		// for creating table
		DbCreateTable.createTable();

		// inserting data using statement object
		DbInsert.insertDataWithStatement();
		
		// inserting data using prepared statement object
		DbInsert.insertWithPreparedStatement();

		// updating data using statement object
		DbUpdate.updateTableData1();
		// updating data using prepared statement object
		DbUpdate.updateTableData2();

		// deleting data using statement object
		DbDelete.deleteDataUsingStatement();
		// deleting data using prepared statement object
		DbDelete.deleteDataUsingPreparedStatement();

		// selecting all the data
		DbSelect.selectAllData();
		// selecting specific data
		DbSelect.selectSpecificData();

	}

}
