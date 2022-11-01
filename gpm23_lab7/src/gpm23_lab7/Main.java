package gpm23_lab7;
import java.util.*;
import java.math.*;


public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ArrayMethods arr = new ArrayMethods();
		Random rand = new Random();
		
		
		System.out.println("How many numbers do you want in the array?: ");
		int x = scan.nextInt();
		
		double data[] = new double[x];
		
		for(int i = 0; i < x; i++) {
			data[i] = rand.nextDouble();
		}
		System.out.println(Arrays.toString(data));
		
		System.out.println("Maximum number: " + arr.max(data));
		System.out.println("Minimum number: " + arr.min(data));
		System.out.println("Sum of all numbers: " + arr.sum(data));
		System.out.println("Average of all numbers: " + arr.ave(data));
		
		
		
		
		
	

	}

}
