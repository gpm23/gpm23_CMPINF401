package MenuManager_V2;

import javax.print.attribute.standard.Sides;

public class MenuTest_V2 {

	public static void main(String[] args) {
		Entree_V2 e1 = new Entree_V2("Filet Mingon", "Pan seared steak with butter sauce", 710);
		Entree_V2 e2 = new Entree_V2("Fried Chicken", "Deep fried chicken with our classic seasoning", 680);
		Sides_V2 si1 = new Sides_V2("Mashed Potatoes", "Mashed Potatoes with extra cream", 440);
		Salad_V2 sa1 = new Salad_V2("Chicken Caeser Salad", "Salad with many toppings", 500);
		Salad_V2 sa2 = new Salad_V2("Garden Salad", "Salad with many toppings", 360);
		Dessert_V2 d1 = new Dessert_V2("Ice Cream", "Vanilla ice cream with sprinkles", 440);
		
		Menu menu1 = new Menu("Menu 1", e1, sa1);
		Menu menu2 = new Menu("Menu 2", e2, si1, sa2, d1);
		
		System.out.println("The total calories for menu 1 is: " + menu1.totalCalories());
		System.out.println("The total calories for menu 2 is: " + menu2.totalCalories());
		

	}

}
