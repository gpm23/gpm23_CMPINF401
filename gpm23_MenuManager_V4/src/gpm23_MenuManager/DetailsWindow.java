package gpm23_MenuManager;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class DetailsWindow extends JFrame {
	private JTextArea textField;
	private JTextArea textField_1;
	private JTextArea textField_2;
	private JTextArea textField_3;
	private JTextArea textField_4;
	private JTextArea textField_5;
	private ArrayList<Menu> men;
	private JScrollPane scroll;
	MenuManager load = new MenuManager();
	
	DetailsWindow() {
		final JList<Menu> list = new JList();
		
		load.MenuManager("dishes.txt");
		men = new ArrayList<Menu>();
		
		setVisible(true);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Entree");
		lblNewLabel.setBounds(30, 30, 45, 13);
		getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Side");
		lblNewLabel_1.setBounds(30, 120, 45, 13);
		getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Salad");
		lblNewLabel_2.setBounds(30, 210, 45, 13);
		getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Dessert");
		lblNewLabel_3.setBounds(30, 300, 45, 13);
		getContentPane().add(lblNewLabel_3);
		
		textField = new JTextArea();
		textField.setBounds(130, 27, 800, 60);
		getContentPane().add(textField);
		
		int gh = list.getSelectedIndex();
		//System.out.println(gh.toString());
		String entree = men.get(gh).ent.name + "\n" + men.get(gh).ent.description + "\n" +  "Calories: " + men.get(gh).ent.calories + "  Price: " + men.get(gh).ent.price;
		textField.setText(entree);
		System.out.println("size: " + men.size());
		textField.setColumns(10);
		
		textField_1 = new JTextArea();
		String side = men.get(gh).sid.name + "\n" + men.get(gh).sid.description + "\n" +  "Calories: " + men.get(gh).sid.calories + "  Price: " + men.get(gh).sid.price;
		textField_1.setText(side);
		textField_1.setBounds(130, 120, 540, 60);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextArea();
		String salad = men.get(gh).sal.name + "\n" + men.get(gh).sal.description + "\n" +  "Calories: " + men.get(gh).sal.calories + "  Price: " + men.get(gh).sal.price;
		textField_2.setText(salad);
		textField_2.setBounds(130, 207, 540, 60);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextArea();
		String dessert = men.get(gh).des.name + "\n" + men.get(gh).des.description + "\n" +  "Calories: " + men.get(gh).des.calories + "  Price: " + men.get(gh).des.price;
		textField_3.setText(dessert);
		textField_3.setBounds(130, 297, 540, 60);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Total Calories:");
		lblNewLabel_4.setBounds(30, 397, 77, 13);
		getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Total Price: $");
		lblNewLabel_5.setBounds(30, 439, 77, 13);
		getContentPane().add(lblNewLabel_5);
		
		textField_4 = new JTextArea();
		textField_4.setBounds(130, 390, 96, 36);
		int calories = men.get(gh).ent.calories + men.get(gh).sid.calories + men.get(gh).sal.calories + men.get(gh).des.calories;
		textField_4.setText(String.valueOf(calories));
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextArea();
		textField_5.setBounds(130, 436, 96, 36);
		double price = men.get(gh).ent.price + men.get(gh).sid.price + men.get(gh).sal.price + men.get(gh).des.price;
		textField_5.setText(String.valueOf(price));
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
	}
}
	
