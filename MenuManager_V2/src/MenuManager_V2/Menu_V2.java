package MenuManager_V2;



public class Menu_V2 {

	Entree_V2 e;
	Sides_V2 si;
	Salad_V2 sa;
	Dessert_V2 d;
	String name;
	

	
	
	
	public Menu_V2(String name) {
		this.name = name;
		}
	
	public Menu_V2(String name, Entree_V2 entree, Sides_V2 side) {
		this.name = name;
		this.e = entree;
		this.si = side;
		}
	
	public Menu_V2(String name, Entree_V2 entree, Salad_V2 salad) {
		this.name = name;
		this.e = entree;
		this.sa = salad;
		}
	
	public Menu_V2(String name, Entree_V2 entree, Sides_V2 side, Salad_V2 salad, Dessert_V2 dessert) {
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
