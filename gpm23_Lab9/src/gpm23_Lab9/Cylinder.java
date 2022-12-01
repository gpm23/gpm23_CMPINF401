package gpm23_Lab9;

public class Cylinder extends Circle {
	double height = 1.0;
	
	public Cylinder() {
		
	}
	
	public Cylinder(double radius, String color) {
		super(radius, color);
	}
	
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
		
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		double volume = super.getArea() * height;
		return volume;
	}
	
	

}
