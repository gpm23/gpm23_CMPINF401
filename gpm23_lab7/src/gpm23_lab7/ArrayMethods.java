package gpm23_lab7;

public class ArrayMethods {
	
	public static double max(double[] data) {
		double x = 0;
		for(int i = 0; i < data.length; i++) {
			if(x < data[i] ) {
				x = data[i];
			}
			
		}
		return x;
	}
	
	public static double min(double[] data) {
		double x = data[0];
		for(int i = 0; i < data.length; i++) {
			if(x > data[i] ) {
				x = data[i];
			}
			
		}
		return x;
	}
	
	public static double sum(double[] data) {
		double sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		return sum;
	}
	
	public static double ave(double[] data) {
		double ave = 0;
		for(int i = 0; i < data.length; i++) {
			ave += data[i];
		}
		ave = ave / data.length;
		return ave;
	}
	
	
	
	

}
