package gpm23_lab5;
import java.math.*;
import java.util.Random;

public class functions {
	static int result2 = 0;
	static int result3 = 0;
	static int result4 = 0;
	static int result5 = 0;
	static int result6 = 0;
	static int result7 = 0;
	static int result8 = 0;
	static int result9 = 0;
	static int result10 = 0;
	static int result11 = 0;
	static int result12 = 0;
	
	static void rollDice(int rolls, Random ran) {
		int total = 0;
		int first = ran.nextInt(6);
		int second = ran.nextInt(6);
		int sum = first + second;
			
		if(sum == 2) {
			result2++;
		}
		else if(sum == 3) {
			result3++;
		}
		else if(sum == 4) {
			result4++;
		}
		else if(sum == 5) {
			result5++;
		}
		else if(sum == 6) {
			result6++;
		}
		else if(sum == 7) {
			result7++;
		}
		else if(sum == 8) {
			result8++;
		}
		else if(sum == 9) {
			result9++;
		}
		else if(sum == 10) {
			result10++;
		}
		else if(sum == 11) {
			result11++;
		}
		else if(sum == 12) {
			result12++;
		}
		total++;
		
		
		
		
		
		
		
		
			
			
		
		
		
		
		

	}

}
