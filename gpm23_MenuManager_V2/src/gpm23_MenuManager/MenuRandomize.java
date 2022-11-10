package gpm23_MenuManager;
/**
 * Class MenuRandomize
 * @author : Gabriel Medeiros
 * @created: 11/1/2022
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class MenuRandomize {

	private ArrayList<Entree> e;
	private ArrayList<Sides> si;
	private ArrayList<Salad> sa;
	private ArrayList<Dessert> d;
	FileManager file = new FileManager();



	/**
	 * Method MenuRandomize
	 * @param a a string fileName
	 * @param b a string fileName
	 * @param c a string fileName
	 * @param d a string fileName
	 * 
	 */
	public MenuRandomize(String entreeFile, String sideFile, String saladFile, String dessertFile) {
		e = file.readEntrees(entreeFile);
		si = file.readSides(sideFile);
		sa = file.readSalads(saladFile);
		d = file.readDessert(dessertFile);
	}
	/**
	 * Method randomMenu
	 * @return a new random menu object
	 */
	public Menu randomMenu() {
		Random ran = new Random();
		int a1 = (int)(Math.random() * e.size());
		int a2 = (int)(Math.random() * si.size());
		int a3 = (int)(Math.random() * sa.size());
		int a4 = (int)(Math.random() * d.size());


		return new Menu("Random Menu", e.get(a1), si.get(a2), sa.get(a3), d.get(a4));


	}

}
