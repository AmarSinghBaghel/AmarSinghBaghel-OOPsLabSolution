package com.greatlearning.main;
import java.util.Scanner;
import com.greatlearning.model.*;
import com.greatlearning.service.*;
public class Driver {
	
	
	// Create Objects
	private static Scanner sc = new Scanner(System.in);
	private static Employee employee = new Employee("Anuj","baghel");
	
	 public static void main(String[] arg  ) {
		 String dept ;
		 System.out.println("Enter Your Frist Name");
	     employee.setFristName(sc.next());
	     System.out.println("Enter Your Last Name");
	     employee.setLastName(sc.next());
		 displayMenu();
		 int choice = sc.nextInt();
			 
			
			 switch(choice) {
   	      case 1:
   	    	  dept = "tech";
   	    	  CredentialService.showCredentials(dept,employee.getFristName(),employee.getLastName());
   	          break;
   	          
   	      case 2:
   	    	  dept = "Admin";
   	    	  CredentialService.showCredentials(dept,employee.getFristName(),employee.getLastName());
 	    	  break;
   	      
   	      case 3:
   	    	  dept = "HumanResource";
   	    	  CredentialService.showCredentials(dept,employee.getFristName(),employee.getLastName());
	    	  break;
   	      
   	      case 4:
   	    	  dept = "Legal";
   	    	  CredentialService.showCredentials(dept,employee.getFristName(),employee.getLastName());
	    	  break;
   	        
   	      }
   	  }
	private static void displayMenu() {
		
		System.out.println("Please enter the department from the following");
	     System.out.println("----------------------------");
		 System.out.println("1.Technical");
		 System.out.println("2.Admin");
		 System.out.println("3.Human Resource");
		 System.out.println("4.Legal");
		 System.out.println("----------------------------");
		 System.out.println("Enter your department");
	} 
   	  
	 }

