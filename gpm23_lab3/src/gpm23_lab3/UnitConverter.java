package gpm23_lab3;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class UnitConverter {

	public static void main(String[] args) {
		
		String inches = "in";
		String centimeters = "cm";
		String yards = "yd";
		String meters = "m";
		//units of measurement
		
		String ounces = "oz";
		String grams = "g";
		String kilograms = "kg";
		String pounds = "lb";	
		//units of distance
		
		
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the measurement or distance with its units here:");
		double value = input.nextDouble();
		String units = input.next();
		//Scans input and separates the double and the string
		
		
		
		
		
		
		if(units.equals(inches)) {
			System.out.println(value + " " + units + " = " + value*2.54 + " " + centimeters);	
			
		}else if(units.equalsIgnoreCase(centimeters)) {
			System.out.println(value + " " + units + " = " + value*0.393701 + " " + inches);
			
		}else if(units.equalsIgnoreCase(yards)) {
			System.out.println(value + " " + units + " = " + value*0.9144 + " " + meters);
			
		}else if(units.equalsIgnoreCase(meters)) {
			System.out.println(value + " " + units + " = " + value*1.09361 + " " + yards);
			
		}else if(units.equalsIgnoreCase(ounces)) {
			System.out.println(value + " " + units + " = " + value*28.3495 + " " + grams);
			
		}else if(units.equalsIgnoreCase(grams)) {
			System.out.println(value + " " + units + " = " + value*0.035274 + " " + ounces);
			
		}else if(units.equalsIgnoreCase(kilograms)) {
			System.out.println(value + " " + units + " = " + value*2.20462 + " " + pounds);
			
		}else if(units.equalsIgnoreCase(pounds)) {
			System.out.println(value + " " + units + " = " + value*0.453592 + " " + kilograms);
		}else {
			System.out.println("There was an error, please try again using the structure of number *space* unit");
		}
		
		//Converts the units
		
		
		
		
	}
	
	
		
	

		
		
		
		
		
		
		
		
	

	

}

