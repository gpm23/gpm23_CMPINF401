package gpm23_MenuManager;
/**
 * Class FileManager
 * @author : Gabriel Medeiros
 * @created: 11/1/2022
 */

import java.util.ArrayList;
import java.util.Collection;
import java.io.*;

public class FileManager {
	
	
	public static ArrayList<Entree> readEntrees(String fileName) {
		ArrayList<Entree> ent = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Entree e = new Entree(p[0], p[1], Integer.parseInt(p[2]));
				ent.add(e);
			}
			b.close();
			f.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return ent;
		
	}
	
	public static ArrayList<Sides> readSides(String fileName) {
		
		ArrayList<Sides> sid = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Sides si = new Sides(p[0], p[1], Integer.parseInt(p[2]));
				sid.add(si);
			}
			b.close();
			f.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sid;
		
	}
	
	public static ArrayList<Salad> readSalads(String fileName) {
		
		ArrayList<Salad> sal = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Salad s = new Salad(p[0], p[1], Integer.parseInt(p[2]));
				sal.add(s);
			}
			b.close();
			f.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return sal;
	}
	
	public static ArrayList<Dessert> readDessert(String fileName) {
		
		ArrayList<Dessert> des = new ArrayList<>();
		try {
			FileReader f = new FileReader("src/" + fileName);
			BufferedReader b = new BufferedReader(f);
			String line = null;
			while((line = b.readLine()) != null){
				String[] p = line.split("@@");
				Dessert d = new Dessert(p[0], p[1], Integer.parseInt(p[2]));
				des.add(d);
			}
			b.close();
			f.close();
			
		}catch(IOException e) {
			System.out.println(e.getMessage());
		}
		return des;
	}

}
