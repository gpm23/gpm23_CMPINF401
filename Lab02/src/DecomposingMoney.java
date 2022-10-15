import javax.swing.JOptionPane;

public class DecomposingMoney {

	public static void main(String[] args) {
		String money = JOptionPane.showInputDialog("Enter an amount of money");
		int amount = Integer.parseInt(money);
		
		int bucks = amount % 10;
		amount = amount / 10;
		
		int sawbucks = amount % 10;
		amount = amount / 10;
		
		int benjamins = amount % 10;
		amount = amount / 10;
		
		int grands = amount % 10;
		amount = amount / 10;
		
		JOptionPane.showMessageDialog(null, "You have " + grands + " grands, " + benjamins + " benjamins, " + sawbucks + " sawbucks, and " + bucks + " bucks." );
		
		
		
		

	}

}
