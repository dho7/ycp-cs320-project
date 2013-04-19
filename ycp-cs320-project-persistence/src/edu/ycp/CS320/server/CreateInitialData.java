package edu.ycp.CS320.server;

import java.sql.SQLException;

import edu.ycp.CS320.shared.FireApparatus;
import edu.ycp.CS320.shared.FireApparatusSpec;
import edu.ycp.CS320.shared.User;

public class CreateInitialData {

	public static void main(String[] args) throws SQLException {
		DerbyDatabase db = new DerbyDatabase();		
		
		User drew = new User(-1, "drew", "pw");
		User jake = new User(-1, "jake", "pw");
		User josh = new User(-1, "josh", "pw");
		User alana = new User(-1, "alana", "pw");
		
		/*db.addUserToDB(drew);
		db.addUserToDB(jake);
		db.addUserToDB(josh);
		db.addUserToDB(alana);
		
		FireApparatusSpec spec1 = new FireApparatusSpec("x", "y", "z", "2013");
		FireApparatus app1 = new FireApparatus();
		app1.setFireApparatusSpec(spec1);
		
		db.addFireApparatusToDB(app1);*/
		
		System.out.println("Successfully created initial data");
	}

}