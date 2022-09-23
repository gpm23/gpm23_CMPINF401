package gpm23_lab4;
import javax.swing.JOptionPane;
import java.math.*;
import java.util.Scanner;

public class logFinder {

	static int y;
	
	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		
		
		
		
		//double baseFinder = Math.log(y) / Math.log(b);
		
		while(true) {
			System.out.println("Input a value that is greater then zero here:");
			int x = reader.nextInt();
			if(x > 0) {
				System.out.println("Input a value that is greater then one here:");
				int b = reader.nextInt();
				if(b > 1) {
					int finder = (int) (Math.log(x) / Math.log(b));
					System.out.println("The log of " + x + " with a base of " + b + " is " + finder);
					break;
					//MAIN LOG FUNCTION IS GOING HERE
				}
				else {
					System.out.println("The number was invalid. Please re-enter the value and make sure it is greater then 1");
				}
			}else {
				System.out.println("One of the numbers was invalid. Please re-enter both of the values, making sure you follow their rules");
				
			}
			
		
		}
}

		
		
		
		
		
		
		
		
	}


