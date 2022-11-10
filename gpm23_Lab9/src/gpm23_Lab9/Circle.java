package gpm23_Lab9;
import java.math.*;

public class Circle {
	
	double radius = 5.0;
	String color = "green";
	
	public Circle() {
		
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		double area = radius * radius * Math.PI;
		return area;
	}
}
