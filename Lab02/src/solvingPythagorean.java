import javax.swing.JOptionPane;

public class solvingPythagorean {

	public static void main(String[] args) {
		
		String firstNumber = JOptionPane.showInputDialog("Enter your first number");
		String secondNumber = JOptionPane.showInputDialog("Enter your second number");
		
		int n1 = Integer.parseInt(firstNumber);
		int n2 = Integer.parseInt(secondNumber);
		
		double sideOne = Math.pow(n1, 2);
		//Squaring the first side 
		double sideTwo = Math.pow(n2, 2);
		//Squares the second side
		
		double hypoteanuseFinder = sideTwo + sideOne;
		double hypoteanuseChecker = hypoteanuseFinder - (sideTwo + sideOne);
		
		
		double sideHypoteanuse = Math.sqrt(sideTwo + sideOne);
		
		double hr1 = sideHypoteanuse * 100;
		double hr2 = Math.round(hr1);
		double sideHypoteanuseFinal = hr2 / 100;
		//Rounds Hypoteanuse		
		
		if(hypoteanuseChecker == 0 ) {
			JOptionPane.showMessageDialog(null, "The hypoteanuse is " + (sideHypoteanuseFinal));
		}


	}

}
