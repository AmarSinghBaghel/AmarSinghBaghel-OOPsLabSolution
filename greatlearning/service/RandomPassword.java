package com.greatlearning.service;

public class RandomPassword {
	
	public static int generatepassword() {
		return 100 + (int)(Math.random() * 900) ;
	}
	
		  
	    // function to generate a random string of length n
	   public static String getAlphaNumericString(int n)
	    {
	  
	        // chose a Character random from this String
	        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
	                                    + "abcdefghijklmnopqrstuvxyz"
	                                    + "!@#$%^&*";
	        StringBuilder sb = new StringBuilder(n);
	        
	        for (int i = 0; i < n; i++) {

				// generate a random number between0 to AlphaNumericString variable length
				
	        	int index = (int)(AlphaNumericString.length()* Math.random());

				// add Character one by one in end of sb
				sb.append(AlphaNumericString.charAt(index));
			}

	        
	        return sb.toString();
	    }
}