package gpm23_MenuManager;

public class ComboItem {

	MenuItem item;
	String name;

	public String toString() {
		return name;
	}

	public ComboItem(MenuItem t, String name) {
		this.item = t;
		this.name = name;
	}

}
