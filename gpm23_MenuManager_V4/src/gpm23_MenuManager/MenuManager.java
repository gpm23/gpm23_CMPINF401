package gpm23_MenuManager;
/**
 * Class MenuManager
 * @author : Gabriel Medeiros
 * @created : 11/26/2022
 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MenuManager {
	ArrayList<MenuItem> e;
	ArrayList<MenuItem> si;
	ArrayList<MenuItem> sa;
	ArrayList<MenuItem> d;

	
	/**
	 * Method MenuManger
	 * @param a a text file
	 */
	public void MenuManager(String dishesFile) {
		ArrayList<MenuItem> men = FileManager.readItems("dishes.txt");
		ArrayList<MenuItem> entrees = new ArrayList<>();
		ArrayList<MenuItem> sides = new ArrayList<>();
		ArrayList<MenuItem> salads = new ArrayList<>();
		ArrayList<MenuItem> desserts = new ArrayList<>();
		for(int i = 0; i < men.size(); i++) {
			if(men.get(i) instanceof Entree) {
				entrees.add(men.get(i));

			}
			else if(men.get(i) instanceof Sides) {
				sides.add(men.get(i));

			}
			else if(men.get(i) instanceof Salad) {
				salads.add(men.get(i));

			}
			else if(men.get(i) instanceof Dessert) {
				desserts.add(men.get(i));

			}

		}
		this.e = entrees;
		this.si = sides;
		this.sa = salads;
		this.d = desserts;

		Menu menu = randomMenu("Menu 1");
		System.out.println(menu.name);
		System.out.println(menu.ent.name);
		System.out.println(menu.sid.name);
		System.out.println(menu.sal.name);
		System.out.println(menu.des.name);






	}
	/**
	 * Method randomMenu
	 * @param a a string name
	 * @return a Menu object
	 */
	public Menu randomMenu(String name) {
		int a1 = (int)(Math.random() * e.size());
		int a2 = (int)(Math.random() * si.size());
		int a3 = (int)(Math.random() * sa.size());
		int a4 = (int)(Math.random() * d.size());


		return new Menu(name, e.get(a1), si.get(a2), sa.get(a3), d.get(a4));



	}
	/*
	public Menu minCalorieMenu(String name) {
		ArrayList<MenuItem> men = FileManager.readItems("dishes.txt");
		ArrayList<MenuItem> entrees = new ArrayList<>();
		ArrayList<MenuItem> sides = new ArrayList<>();
		ArrayList<MenuItem> salads = new ArrayList<>();
		ArrayList<MenuItem> desserts = new ArrayList<>();
		for(int i = 0; i < men.size(); i++) {
			if(men.get(i) instanceof Entree) {
				entrees.add(men.get(i));

			}
			else if(men.get(i) instanceof Sides) {
				sides.add(men.get(i));

			}
			else if(men.get(i) instanceof Salad) {
				salads.add(men.get(i));

			}
			else if(men.get(i) instanceof Dessert) {
				desserts.add(men.get(i));

			}

		}
		
		for(int i = 0; i < entrees.size(); i++) {
			int min = entrees.get(0).calories;
			if(entrees.get(i).calories < entrees.get(0).calories) {
				min = entrees.get(i).calories;
			}
		}
		for(int i = 0; i < sides.size(); i++) {
			int min = sides.get(0).calories;
			if(sides.get(i).calories < sides.get(0).calories) {
				min = sides.get(i).calories;
			}
		}
		for(int i = 0; i < salads.size(); i++) {
			int min = salads.get(0).calories;
			if(salads.get(i).calories < salads.get(0).calories) {
				min = salads.get(i).calories;
			}
		}
		for(int i = 0; i < desserts.size(); i++) {
			int min = desserts.get(0).calories;
			if(desserts.get(i).calories < desserts.get(0).calories) {
				min = desserts.get(i).calories;
			}
		}
		return new Menu(name)
	}
	*/

}
