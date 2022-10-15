import javax.swing.JOptionPane;

public class areaAndPerimeterOfCircle {

	public static void main(String[] args) {
		String r = JOptionPane.showInputDialog("Put the radius of the circle in here");
		int rad = Integer.parseInt(r);
		
		double pi = Math.PI;
		
		double perimeter = 2 * pi * rad;
		//perimeter formula
	
		double pv1 = perimeter * 100;
		double pv2 = Math.round(pv1);
		double perimeterFinal = pv2 / 100;
		//Rounds perimeter
		
	
		double area = pi * rad * rad;
		//area formula
		double av1 = area * 100;
		double av2 = Math.round(av1);
		double areaFinal = av2 / 100;
		
		
		
		JOptionPane.showMessageDialog(null, "The circle with a radius of " + rad + " has an area of " + areaFinal + " and a perimeter of " + perimeterFinal + ".");

	}

}
