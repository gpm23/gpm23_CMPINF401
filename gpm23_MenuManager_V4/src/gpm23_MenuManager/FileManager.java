package gpm23_MenuManager;
/**
 * Class FileManager
 * @author : Gabriel Medeiros
 * @created: 11/26/2022
 */

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

public class FileManager {



	/**
	 * Method readEntrees
	 * @param a string fileName
	 * @return an ArrayList
	 */


	public static ArrayList<Entree> readEntree(String fileName) {
		ArrayList<Entree> ent = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Entree e = new Entree(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
				ent.add(e);
			}
			b.close();
			f.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return ent;

	}


	/**
	 * Method readSides
	 * @param a string fileName
	 * @return an ArrayList
	 */


	public static ArrayList<Sides> readSides(String fileName) {

		ArrayList<Sides> sid = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Sides si = new Sides(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
				sid.add(si);
			}
			b.close();
			f.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sid;

	}


	/**
	 * Method readSalads
	 * @param a string fileName
	 * @return an ArrayList
	 */


	public static ArrayList<Salad> readSalads(String fileName) {

		ArrayList<Salad> sal = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Salad s = new Salad(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
				sal.add(s);
			}
			b.close();
			f.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sal;
	}


	/**
	 * Method readDessert
	 * @param a string fileName
	 * @return an ArrayList
	 */


	public static ArrayList<Dessert> readDessert(String fileName) {

		ArrayList<Dessert> des = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Dessert d = new Dessert(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
				des.add(d);
			}
			b.close();
			f.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return des;
	}

	/**
	 * Method readItems
	 * @param a string fileName
	 * @return an ArrayList of MenuItems
	 */
	public static ArrayList<MenuItem> readItems(String fileName) {
		ArrayList<MenuItem> men = new ArrayList<MenuItem>();
		try {
			FileReader f = new FileReader("src/data/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				if(p[1].equals("entree")) {
					Entree ent = new Entree(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
					men.add(ent);
				}
				else if((p[1].equals("side"))) {
					Sides sid = new Sides(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
					men.add(sid);
				}
				else if(p[1].equals("salad")) {
					Salad sal = new Salad(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
					men.add(sal);
				}
				else if(p[1].equals("dessert")) {
					Dessert des = new Dessert(p[0], p[2], Integer.parseInt(p[3]), Double.parseDouble(p[4]));
					men.add(des);
				}	

			}

			b.close();
			f.close();

		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return men;

	}



	/**
	 * Method writeMenu
	 * @param a a string fileName
	 * @param b an ArrayList of type Menu
	 * @return writes to .txt file
	 */
	public static void writeMenu(String fileName, ArrayList<Menu> menus) {
		try {
			FileWriter fw = new FileWriter("src/data/" + fileName);
			BufferedWriter bw = new BufferedWriter(fw);

			for(int i = 0; i < menus.size(); i++) {
				bw.write(menus.get(i).name + ": \n");
				bw.write(menus.get(i).ent.name + "\n");
				bw.write(menus.get(i).ent.description + "\n");
				bw.write(menus.get(i).ent.calories + " calories" + "\n");
				bw.write(menus.get(i).ent.price + " dollars" + "\n");
				bw.write("\n");
				bw.write(menus.get(i).sid.name + "\n");
				bw.write(menus.get(i).sid.description + "\n");
				bw.write(menus.get(i).sid.calories + " calories" + "\n");
				bw.write(menus.get(i).sid.price + " dollars" + "\n");
				bw.write("\n");
				bw.write(menus.get(i).sal.name + "\n");
				bw.write(menus.get(i).sal.description + "\n");
				bw.write(menus.get(i).sal.calories + " calories" + "\n");
				bw.write(menus.get(i).sal.price + " dollars" + "\n");
				bw.write("\n");
				bw.write(menus.get(i).des.name + "\n");
				bw.write(menus.get(i).des.description + "\n");
				bw.write(menus.get(i).des.calories + " calories" + "\n");
				bw.write(menus.get(i).des.price + " dollars" + "\n");
				bw.write("\n");
				int totalCalories = menus.get(i).ent.calories + menus.get(i).sid.calories + menus.get(i).sal.calories + menus.get(i).des.calories;
				bw.write("Total calories: " + totalCalories + " calories" + "\n");
				double totalPrice = menus.get(i).ent.price + menus.get(i).sid.price + menus.get(i).sal.price + menus.get(i).des.price;
				bw.write("Total Price: " + totalPrice + " dollars" + "\n");
				bw.write("\n");
			}

			bw.close();
			fw.close();


		}
		catch(IOException e) {
			System.out.println(e);
		}




	}


}

