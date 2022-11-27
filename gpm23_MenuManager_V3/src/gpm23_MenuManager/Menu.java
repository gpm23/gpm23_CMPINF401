package gpm23_MenuManager;
/**
 * Class Menu
 * @author : Gabriel Medeiros
 * @created: 11/26/2022
 */

public class Menu{
	Entree e;
	Sides si;
	Salad sa;
	Dessert d;
	String name;
	MenuItem ent;
	MenuItem sid;
	MenuItem sal;
	MenuItem des;





	public Menu(String name) {
		this.name = name;
	}
	public Menu(String name, MenuItem entree, MenuItem side, MenuItem salad, MenuItem dessert) {
		this.name = name;
		this.ent = entree;
		this.sid = side;
		this.sal = salad;
		this.des = dessert;
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
		if(ent != null) {
			count += e.calories;
		}
		if(sid != null) {
			count += si.calories;
		}
		if(sal != null) {
			count += sa.calories;
		}
		if(des != null) {
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

	public String toString() {
		return this.name;
	}







}
