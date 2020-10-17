package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private String email;
	private String companySuffix = "gnindia.com";
	private int mailboxCapacity = 500;
	private int passwordLength = 10;
	private String alternativeEmail;
	
	//constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		
		
		//call a method asking for a department - return department
	    this.department = setDepartment();
	    
	
	    
	    //call a method that can return a random password
	     this.password = randomPassword(passwordLength);
	     System.out.println("YOUR PASSWORD IS: " + this.password);
	  
	     //combine elements to generate email
	     email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
	  
	}
	
	//ask for department
	private String setDepartment() {
		System.out.print("New worker : " +firstName +" DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {
			return "sales";
		}else if(depChoice == 2) {
			return "dev";
		}else if(depChoice == 3) {
			return "acct";
		}else {
			return "";
		}
	}
	
	//Generate random password
	  private String randomPassword(int length) {
		  String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789@+$%";
		  char password[] = new char[length];
		  for(int i = 0; i < length ;i++) {
			int rand =  (int)(Math.random() * passwordSet.length());
		    password[i] = passwordSet.charAt(rand);
		  }
		  return new String(password);
	  }
	
	//set the mailbox capacity
	public void setMailboxCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	//set the alternative email 
	 public void setAlternativeEmail(String altEmail) {
		 this.alternativeEmail = altEmail;
	 }
	
	//change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity() {
		return mailboxCapacity;
	}
	
	public String getAlternativeEmail() {
		return alternativeEmail;
	}
	
	public String getPassword() {
		return password;
	}
    
	public String showInfo() {
		return "\nDISPLAY NAME: " + firstName + " " + lastName + 
				"\nCOMPANY EMAIL: " + email + 
				"\nMAILBOX CAPACITY: " + mailboxCapacity + "ab";
	}
}
