package gpm23_Lab10;

public class Main {

	public static void main(String[] args) {
		//System.out.println(sumOfDigits(123));
		
		
		//int[] values = new int[] {1, 5, 24, 54, 21, 90, 54, 65, 32, 13, 2343, 2564};
		//printArrayElements(values, values.length - 1);
	
			
		}
	
	public static int sumOfDigits(int x) {
		if(x < 0) {
			x *= -1;
		}
		if(x < 10) {
			return x;
		}
		return (x % 10 + sumOfDigits(x / 10));

	}
	
	public static void printArrayElements(int a[], int index) {
		if(index > -1) {
			System.out.println(a[index]);
			printArrayElements(a, index - 1);
			
		}
	}
	
	public static void printCombos(int[] a, String out, int startIndex, int k) {
		if(k <= a.length) {
			
		}
	}
	
	
	
	
	
	

}
