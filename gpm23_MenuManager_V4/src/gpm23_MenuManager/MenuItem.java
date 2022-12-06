package gpm23_MenuManager;
/**
 * Class MenuItem
 * @author : Gabriel Medeiros
 * @created : 11/26/2022
 */

public class MenuItem {
	String name;
	String type;
	String description;
	int calories;
	double price;

	public MenuItem(String name, String description, int calories, double price) {
		this.name = name;
		this.description = description;
		this.calories = calories;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getCalories() {
		return this.calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;

	}

	public String toString() {
		return this.name + this.description + this.calories + this.price;
	}



}
