import javax.swing.JOptionPane;


public class CalculateTips {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String subtotalString = JOptionPane.showInputDialog(null, "Enter the subtotal.", "Subtotal Input", JOptionPane.QUESTION_MESSAGE);
		String gratuityString = JOptionPane.showInputDialog(null, "Enter the gratuity.", "Gratuity Input", JOptionPane.QUESTION_MESSAGE);
		
		double subtotal = Double.parseDouble(subtotalString);
		double gratuity = Double.parseDouble(gratuityString);
		
		double tipAmount = subtotal * (gratuity / 100) ;
		double total = subtotal + tipAmount;
		
		String output = "For a subtotal of $" + subtotal + " with a " + gratuity + "% tip rate, please tip $" + tipAmount + " for a total amount of $" + total;
		
		JOptionPane.showMessageDialog(null, output, "Total Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
