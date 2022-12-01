package gpm23_MenuManager;
/**
 * Class MenuTest
 * @author : Gabriel Medeiros
 * @created: 11/1/2022
 */

import java.util.ArrayList;

public class MenuTest {

	public static void main(String[] args) {
		/*Entree e1 = new Entree("Filet Mingon", "Pan seared steak with butter sauce", 710);
		Entree e2 = new Entree("Fried Chicken", "Deep fried chicken with our classic seasoning", 680);
		Sides si1 = new Sides("Mashed Potatoes", "Mashed Potatoes with extra cream", 440);
		Salad sa1 = new Salad("Chicken Caeser Salad", "Salad with many toppings", 500);
		Salad sa2 = new Salad("Garden Salad", "Salad with many toppings", 360);
		Dessert d1 = new Dessert("Ice Cream", "Vanilla ice cream with sprinkles", 440);

		Menu menu1 = new Menu("Menu 1", e1, sa1);
		Menu menu2 = new Menu("Menu 2", e2, si1, sa2, d1);

		System.out.println("The total calories for menu 1 is: " + menu1.totalCalories());
		System.out.println("The total calories for menu 2 is: " + menu2.totalCalories());

		 */

		FileManager f = new FileManager();

		ArrayList<Entree> e = f.readEntrees("data/entrees.txt");
		System.out.println(e);
		for(int i = 0; i < e.size(); i++) {
			System.out.println(e.get(i).name);
			System.out.println(e.get(i).description);
			System.out.println(e.get(i).calories);
			System.out.println();
		}




	}

}
