package com.assignment.db;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.assignment.beans.User;

public class UserDAO {

	public List<User> getUsers(){
		String sql ="select firstname, lastname,email,pass,pass2,composemsg from Register"; 
		
		GetConnection gc = new GetConnection(); 
		List<User> users = new ArrayList<User>(); 
		
		try {
			gc.ps1 = GetConnection.getMySQLConnection().prepareStatement(sql);
			gc.rs = gc.ps1.executeQuery(); 
			
			while(gc.rs.next()) {
				User user = new User();
				user.setfirstname(gc.rs.getString("firstname")); 
				user.setlastname(gc.rs.getString("lastname")); 
				user.setemaile(gc.rs.getString("email"));
				user.setpass(gc.rs.getString("pass"));
				user.setpass2(gc.rs.getString("pass2"));
				user.setcomposemsg(gc.rs.getString("composemsg"));
				
				users.add(user); 
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return users; 
	}
	
	
}
