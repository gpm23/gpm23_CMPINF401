package gpm23_MenuManager;
/**
 * Class Menu
 * @author : Gabriel Medeiros
 * @created: 11/1/2022
 */

public class Menu {
	Entree e;
	Sides si;
	Salad sa;
	Dessert d;
	String name;





	public Menu(String name) {
		this.name = name;
	}

	public Menu(String name, Entree entree, Sides side) {
		this.name = name;
		this.e = entree;
		this.si = side;
	}

	public Menu(String name, Entree entree, Salad salad) {
		this.name = name;
		this.e = entree;
		this.sa = salad;
	}

	public Menu(String name, Entree entree, Sides side, Salad salad, Dessert dessert) {
		this.name = name;
		this.e = entree;
		this.si = side;
		this.sa = salad;
		this.d = dessert;
	}

	public int totalCalories() {
		int count = 0;
		if(e != null) {
			count += e.calories;
		}
		if(si != null) {
			count += si.calories;
		}
		if(sa != null) {
			count += sa.calories;
		}
		if(d != null) {
			count += d.calories;
		} 
		return count;
	}

	public String description() {
		String s = "";
		if(e != null) {
			s += e.description + "\n";
		}
		if(si != null) {
			s += si.description + "\n";
		}
		if(sa != null) {
			s += sa.description + "\n";
		}
		if(d != null) {
			s += d.description + "\n";
		}



		return s;

	}







}
