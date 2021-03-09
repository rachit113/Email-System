package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String email;
	private String role;
	private String password;
	private int defaultPasswordLength = 10;
	private int mailCapacity = 500;
	private String alternateEmail;
	private String companySufix = "company.com";
	// Constructor for Name
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		//System.out.println("Email created :" + this.firstName +  " " + this.lastName);
		
		// Method for the role of user
		this.role = setRole();
		 //System.out.println("Role:" + this.role);
		
		// Method for password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Password : " + this.password);
		
		//Generate email
		email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+ role+"." + companySufix;
		//System.out.println("Your email is :" + email);
	}
	
	



    // Department info

	private String setRole() {
		System.out.println("Codes for your role: \n1 for Student \n2 for Faculty \n3 for Staff\n0 for none\nEnter your code:");
		Scanner in = new Scanner (System.in);
		 int roleChoice = in.nextInt();
		 
		 if(roleChoice == 1) {
			 return "student";
		 }
		 else if(roleChoice == 2) {
			 return "faculty";
			 }
		 else if(roleChoice == 3) {
			 return "staff";
		 }
		 else {
			 return " ";
		 }
	}
	
	// Generate Passwords
	
	private String randomPassword(int length) {
		String passwordSet =  "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char[] password = new char[length];
		
		for(int i = 0 ; i< length ;i++) {
			int random = (int) (Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(random);
		}
		return new String(password);
	}
	
	public void setMailboxcapacity(int capacity) {
		this.mailCapacity = capacity;
	}
	
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity () {
		return mailCapacity;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		return "Display name: " + firstName + " " + lastName + "\nRole : " + email + "\nMailbox Capacity:" + mailCapacity +"mb";
	}

}

