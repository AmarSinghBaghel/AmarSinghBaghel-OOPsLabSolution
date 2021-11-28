package com.greatlearning.model;

public class Employee {
	private String fristName;
	private String lastName;
	
	//Define a Constructor
    public Employee(String fristName, String lastName) {
    	this.setFristName(fristName);
    	this.setLastName(lastName);
    	
    }
    
    // Create getters and setters
    //getter fristName
  	public String getFristName() {
  		return fristName;
  	}
  	//setter fristName
  	public void setFristName(String fristName) {
  		this.fristName = fristName;
  	}
	//getter lastName
	public String getLastName() {
		return lastName;
	}
	//setter lastName
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
    
}


