package gpm23_MenuManager;

import java.util.Random;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.AbstractListModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.ListModel;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListDataListener;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class MenuManagerGUI extends JFrame{
	MenuManager load = new MenuManager();

	private JFrame frame;
	private JComboBox<ComboItem> comboBox;
	private JComboBox<ComboItem> comboBox_1;
	private JComboBox<ComboItem> comboBox_2;
	private JComboBox<ComboItem> comboBox_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_1;
	private JLabel lblNewLabel_1_2;
	private JLabel lblNewLabel_1_3;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton_2;
	private JButton btnNewButton_2_1;
	private JButton btnNewButton_2_2;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JButton btnGenerateAMaximum;
	private JButton btnGenerateAMinimum;
	private ArrayList<Menu> men;
	private JScrollPane scroll;
	private JTextArea textField;
	private JTextArea textField_1;
	private JTextArea textField_2;
	private JTextArea textField_3;
	private JTextArea textField_4;
	private JTextArea textField_5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenuManagerGUI window = new MenuManagerGUI();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MenuManagerGUI() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		load.MenuManager("dishes.txt");
		men = new ArrayList<Menu>();
		
		frame = new JFrame();
		frame.setBounds(100, 100, 650, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		lblNewLabel = new JLabel("Build your own Menu");
		lblNewLabel.setBounds(38, 29, 111, 13);
		frame.getContentPane().add(lblNewLabel);
		
		lblNewLabel_1 = new JLabel("Entree");
		lblNewLabel_1.setBounds(38, 52, 45, 13);
		frame.getContentPane().add(lblNewLabel_1);
		
		lblNewLabel_1_1 = new JLabel("Side");
		lblNewLabel_1_1.setBounds(38, 92, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		lblNewLabel_1_2 = new JLabel("Salad");
		lblNewLabel_1_2.setBounds(38, 132, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		lblNewLabel_1_3 = new JLabel("Dessert");
		lblNewLabel_1_3.setBounds(38, 175, 45, 13);
		frame.getContentPane().add(lblNewLabel_1_3);
		
		
		btnNewButton = new JButton("Create Menu with these dishes");
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(339, 52, 275, 348);
		frame.getContentPane().add(scrollPane);
		final JList<Menu> list = new JList();
		scrollPane.setViewportView(list);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
            	if(t.equals("Create Menu with these dishes")) {
            		String dot = JOptionPane.showInputDialog("What would you like the menu to be called?:");
            		int index1 = comboBox.getSelectedIndex();
            		int index2 = comboBox_1.getSelectedIndex();
            		int index3 = comboBox_2.getSelectedIndex();
            		int index4 = comboBox_3.getSelectedIndex();
            		MenuItem item1 = comboBox.getItemAt(index1).item;
            		MenuItem item2 = comboBox_1.getItemAt(index2).item;
            		MenuItem item3 = comboBox_2.getItemAt(index3).item;
            		MenuItem item4 = comboBox_3.getItemAt(index4).item;
            		Menu menu = new Menu(dot, item1, item2, item3, item4);
            		men.add(menu);
            		
            		
            		
            		list.setModel(new javax.swing.DefaultListModel<Menu>() {
        	            public int getSize() {
        	            	return men.size(); 
        	            }
        	            
        	            public Menu getElementAt(int i) { 
        	            	return men.get(i); 
        	            }
        	            

					
        	        });
            		
            	
            	}
            	
            }
			
		});
		
		//scroll.setViewportView(list);
		
		//scroll.setViewportView(list);
		
		btnNewButton.setBounds(38, 213, 250, 21);
		frame.getContentPane().add(btnNewButton);
		
		comboBox = new JComboBox<>();
		comboBox.setBounds(96, 52, 192, 21);
		frame.getContentPane().add(comboBox);
		for(int i = 0; i < load.e.size(); i++) {
        	comboBox.addItem(new ComboItem(load.e.get(i), load.e.get(i).getName()));
        }
		
		comboBox_1 = new JComboBox<>();
		comboBox_1.setBounds(96, 88, 192, 21);
		frame.getContentPane().add(comboBox_1);
		for(int i = 0; i < load.si.size(); i++) {
        	comboBox_1.addItem(new ComboItem(load.si.get(i), load.si.get(i).getName()));
        }
		
		comboBox_2 = new JComboBox<>();
		comboBox_2.setBounds(96, 128, 192, 21);
		frame.getContentPane().add(comboBox_2);
		for(int i = 0; i < load.sa.size(); i++) {
        	comboBox_2.addItem(new ComboItem(load.sa.get(i), load.sa.get(i).getName()));
        }
		
		comboBox_3 = new JComboBox<>();
		comboBox_3.setBounds(96, 171, 192, 21);
		frame.getContentPane().add(comboBox_3);
		for(int i = 0; i < load.d.size(); i++) {
        	comboBox_3.addItem(new ComboItem(load.d.get(i), load.d.get(i).getName()));
        }
		
		btnNewButton_1 = new JButton("Generate a Random Menu");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String dot = JOptionPane.showInputDialog("What would you like the menu to be called?:");
        		int index1 = (int)(Math.random() * comboBox.getItemCount());
        		int index2 = (int)(Math.random() * comboBox_1.getItemCount());
        		int index3 = (int)(Math.random() * comboBox_2.getItemCount());
        		int index4 = (int)(Math.random() * comboBox_3.getItemCount());
        		MenuItem item1 = comboBox.getItemAt(index1).item;
        		MenuItem item2 = comboBox_1.getItemAt(index2).item;
        		MenuItem item3 = comboBox_2.getItemAt(index3).item;
        		MenuItem item4 = comboBox_3.getItemAt(index4).item;
        		Menu menu = new Menu(dot, item1, item2, item3, item4);
        		men.add(menu);
				
				
				list.setModel(new javax.swing.DefaultListModel<Menu>() {
    	            public int getSize() {
    	            	return men.size(); 
    	            }
    	            
    	            public Menu getElementAt(int i) { 
    	            	return men.get(i); 
    	            }
    	            

				
    	        });
			}
		});
		
			
	
		btnNewButton_1.setBounds(38, 318, 250, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		btnGenerateAMinimum = new JButton("Generate a Minimum Calorie Menu");
		btnGenerateAMinimum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
				if(t.equals("Generate a Minimum Calorie Menu")) {
					JOptionPane.showMessageDialog(null, "Sorry, but the Minimum Calorie Menu was extra credit and is not available at this time. Sorry!");
				}
			}
		});
		btnGenerateAMinimum.setBounds(38, 349, 250, 21);
		frame.getContentPane().add(btnGenerateAMinimum);
		
		btnGenerateAMaximum = new JButton("Generate a Maximum Calorie Menu");
		btnGenerateAMaximum.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
				if(t.equals("Generate a Maximum Calorie Menu")) {
					JOptionPane.showMessageDialog(null, "Sorry, but the Maximum Calorie Menu was extra credit and is not available at this time. Sorry!");
			}
			}
		});
		
		
		btnGenerateAMaximum.setBounds(38, 380, 250, 21);
		frame.getContentPane().add(btnGenerateAMaximum);
		
		lblNewLabel_2 = new JLabel("Created Menus:");
		lblNewLabel_2.setBounds(374, 29, 99, 13);
		frame.getContentPane().add(lblNewLabel_2);
		
		btnNewButton_2 = new JButton("Details");
		btnNewButton_2.setBounds(298, 411, 99, 21);
		frame.getContentPane().add(btnNewButton_2);
		
		
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
				if(t.equals("Details")) {
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
		});
		
		btnNewButton_2_1 = new JButton("Delete All");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
				if(t.equals("Delete All")) {
					for(int i = 0; i < men.size(); i++) {
						men.remove(i);
						
					}
					
				}
			}
		});
		btnNewButton_2_1.setBounds(407, 411, 107, 21);
		frame.getContentPane().add(btnNewButton_2_1);
		
		btnNewButton_2_2 = new JButton("Save to File");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String t = e.getActionCommand();
				if(t.equals("Save to File")) {
					FileManager file = new FileManager();
					file.writeMenu("menus.txt", men);
				}
			}
		});
		
		btnNewButton_2_2.setBounds(524, 411, 97, 21);
		frame.getContentPane().add(btnNewButton_2_2);
		
		
		
		
		
		
	}
}
