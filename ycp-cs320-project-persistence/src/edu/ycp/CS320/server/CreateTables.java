package edu.ycp.CS320.server;

import java.sql.SQLException;

public class CreateTables {

	public static void main(String[] args) throws SQLException {
		DerbyDatabase db = new DerbyDatabase();
		db.createTables();
		System.out.println("Successfully created tables");
	}

}
