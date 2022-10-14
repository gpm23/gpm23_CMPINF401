package gpm23_MenuManager;

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
	
	public String description(String ent, String sid, String sal, String des) {
		if(ent == null) {
			System.out.println("N/A");
		}
		if(sid == null) {
			System.out.println("N/A");
		}
		if(sal == null) {
			System.out.println("N/A");
		}
		if(des == null) {
			System.out.println("N/A");
		}
		

		return this.description(ent, sid, sal, des);
		
	}
	
	
	
	
	
	

}
