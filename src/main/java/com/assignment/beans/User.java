package com.assignment.beans;

public class User {
	private static String firstname; 
	private String lastname;
	private String email;
	private String pass;
	private String pass2;
	private String composemsg;
	public User() {}
	
	public User(String firstname, String lastname, String email, String pass,String pass2,String composemsg) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.pass = pass;
		this.pass2 = pass2;
		this.composemsg = composemsg;
	}
	public static String getfirstnamee() {
		return firstname;
	}
	public void setfirstname(String firstname) {
		User.firstname = firstname;
	}
	public String getlastname() {
		return lastname;
	}
	public void setlastname(String lastname) {
		this.lastname = lastname;
	}

	
	
	public String getemail() {
		return email;
	}
	public void setpass(String email) {
		this.email = email;
	}

	public String getpass() {
		return pass;
	}
	public void setemaile(String pass) {
		this.pass = pass;
	}

	
	
	public String getpass2() {
		return pass2;
	}
	public void setpass2(String pass2) {
		this.pass2 = pass2;
	}
	
	
	
	
	
	public String getcomposemsg() {
		return composemsg;
	}
	public void setcomposemsg(String composemsg) {
		this.composemsg = composemsg;
	}
	
	
	
	
	
	
	@Override
	public String toString() {
		return "User [userName=" + firstname + ", email=" + email + " , pass=" + pass + " ,pass2=" + pass2 + ", composemsg=" + composemsg + "]";
	} 
	
	
}
