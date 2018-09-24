package newproject;
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class labonept2 {
	
	    public static void main(String[] args) {
	        //String variables for date inputs
	        String dateToday; 
	        String dateBirth;
	        
	        Scanner scnr = new Scanner(System.in);
	          
	          //Prompts user for date inputs 
	          System.out.println("Using the format MM/DD/YYYY, please enter your birthdate, and on a new line today's date, enter : ");
	          
	          // initializes string variables
	          dateBirth = scnr.nextLine();
	          dateToday = scnr.nextLine();
	           
	        
	        // separates the date string into an array of strings
	           String[] parts1 = dateToday.split("/");
	           String[] parts2 = dateBirth.split("/");
	           
	 
	        /* transforms array of string parts1 into integer variables and builds local date object            LocalDate inputDate = LocalDate.of(year,month,dayOfMonth);*/ 
	               LocalDate inputDate1 = LocalDate.of(Integer.parseInt(parts1[2]),
	                       Integer.parseInt(parts1[0]),
	                       Integer.parseInt(parts1[1]));
	                       
	               /* transforms array of string parts2 into integer variables and builds local date                 object LocalDate inputDate = LocalDate.of(year,month,dayOfMonth);*/   
	                       LocalDate inputDate2 = LocalDate.of(Integer.parseInt(parts2[2]),
	                               Integer.parseInt(parts2[0]),
	                               Integer.parseInt(parts2[1]));           
	              
	        // Calculates period between the two integer dates               
	         Period timeBetween = Period.between(inputDate1, inputDate2);           
	       
	        
	        //Prints the time between the two dates in years, months, and days
	         System.out.println("The difference is" + Math.abs(timeBetween.getYears()) + " year(s), " + Math.abs(timeBetween.getMonths()) + " month(s), and " + Math.abs(timeBetween.getDays()) + " day(s) between " + dateBirth + " and " + dateToday + "have elapsed since you were born!");
	         

	          
	         scnr.close();            
	  
	          }
	  

}
