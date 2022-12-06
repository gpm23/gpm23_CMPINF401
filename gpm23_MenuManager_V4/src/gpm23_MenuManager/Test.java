package gpm23_MenuManager;
import javax.swing.*;

public class Test {
	MenuManager load = new MenuManager();
	
	JFrame frame;
	JLabel label1;
	
	public Test() {
		initComponents();
	}
	
	private void initComponents() {
		frame = new JFrame("Menu Manager GUI");
		frame.setBounds(100, 100, 500, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setVisible(true);
		
		label1 = new JLabel("Create new Menu here");
		label1.setBounds(10, 10, 150, 30);
		frame.getContentPane().add(label1);
	}
	
	
	

























	    // Variables declaration - do not modify                     
	                
	}



