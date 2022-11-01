package MenuManager_V2;

public class Salad_V2 {
	String name;
	String description;
	int calories;
	
	public Salad_V2(String name, String description, int calories) {
		this.name = name;
		this.calories = calories;
		this.description = description;	
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
	
	public void setDescription(String name) {
		this.description = description;
	}
	
	public Integer getCalories() {
		return this.calories;
	}
	
	public void setCalories(int calories) {
		this.calories = calories;
	}

}
