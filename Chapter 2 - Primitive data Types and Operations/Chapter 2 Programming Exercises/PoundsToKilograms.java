import javax.swing.JOptionPane;


public class PoundsToKilograms {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String poundsString = JOptionPane.showInputDialog(null, "Enter the number of pounds.", "Pounds Input", JOptionPane.QUESTION_MESSAGE);
		
		double pounds = Double.parseDouble(poundsString);
		
		double kilograms = pounds * 0.454;
		
		String output = pounds + " pounds is equal to " + kilograms + " kilograms";
		
		JOptionPane.showMessageDialog(null, output, "Kilograms Output", JOptionPane.INFORMATION_MESSAGE);

	}

}
