package gpm23_lab5;
import java.util.*;
import java.math.*;

public class Main {

	public static void main(String[] args) {
		
	
		
		
		Random ran = new Random();
		functions f = new functions();
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("How many times do you want to spin the two dice: ");
		int spins = scan.nextInt();
		System.out.println("Do you wish to continue? Type yes or no: ");
		String answer = scan.next();
		int total = 0;
		
		while(spins > total) {
			if(answer.equalsIgnoreCase("yes")) {
				f.rollDice(spins, ran);
				total++;
			}
			else {
				spins = total;
				System.out.println("Program terminated");
			}
			
		}
		
		System.out.println("The amount of times the sum was 2: " + f.result2 + " / " + spins);
		System.out.println("The amount of times the sum was 3: " + f.result3 + " / " + spins);
		System.out.println("The amount of times the sum was 4: " + f.result4 + " / " + spins);
		System.out.println("The amount of times the sum was 5: " + f.result5 + " / " + spins);
		System.out.println("The amount of times the sum was 6: " + f.result6 + " / " + spins);
		System.out.println("The amount of times the sum was 7: " + f.result7 + " / " + spins);
		System.out.println("The amount of times the sum was 8: " + f.result8 + " / " + spins);
		System.out.println("The amount of times the sum was 9: " + f.result9 + " / " + spins);
		System.out.println("The amount of times the sum was 10: " + f.result10 + " / " + spins);
		System.out.println("The amount of times the sum was 11: " + f.result11 + " / " + spins);
		System.out.println("The amount of times the sum was 12: " + f.result12 + " / " + spins);
		
		
		
		

}
		
	
}

