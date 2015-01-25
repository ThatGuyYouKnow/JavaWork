import javax.swing.JOptionPane;


public class FeetToMeters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String feetString = JOptionPane.showInputDialog(null, "Enter the number of feet.", "Feet Input", JOptionPane.QUESTION_MESSAGE);
		
		double feet = Double.parseDouble(feetString);
		
		double meters = feet * 0.305;
		
		String output = feet + " feet is equal to " + meters + " meters";
		
		JOptionPane.showMessageDialog(null, output, "Meters output", JOptionPane.INFORMATION_MESSAGE);
	}

}
