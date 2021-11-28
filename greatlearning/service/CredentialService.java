package com.greatlearning.service;

public class CredentialService {	
	public static void generateEmailAddress(String dept,String getFristName, String getLastName) {
		
		System.out.println("Email        --->"+ getFristName+getLastName+"@"+dept+".abc.com");	
				
	}
 public static void showCredentials(String dept , String getFristName, String getLastName ) {	 
	 int n = 5;
	 System.out.println("Dear " + getFristName + " your generated credentials are as follows");
	 generateEmailAddress(dept, getFristName, getLastName); 
  	 System.out.println(RandomPassword.generatepassword()+RandomPassword.getAlphaNumericString(n));
 }
}
