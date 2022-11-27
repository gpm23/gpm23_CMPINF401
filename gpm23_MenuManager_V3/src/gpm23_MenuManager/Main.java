package gpm23_MenuManager;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Main
 * @author : Gabriel Medeiros
 * @created: 11/26/2022
 */

public class Main {
	public static void main(String[] args){
		MenuManager tester = new MenuManager();

		tester.MenuManager("dishes.txt");

		ArrayList<Menu> men = new ArrayList<>();

		men.add(tester.randomMenu("Menu 1"));
		men.add(tester.randomMenu("Menu 2"));

		FileManager.writeMenu("new.txt", men);





	}

}
