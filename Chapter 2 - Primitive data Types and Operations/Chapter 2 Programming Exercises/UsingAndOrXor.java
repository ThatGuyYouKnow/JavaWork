import javax.swing.JOptionPane;


public class UsingAndOrXor {

	/**
	 * This program demonstrate the use of And (&&), Or (||) and Xor (^)
	 * It will tell us if a number is divisible by 5 and 6, 5 or 6, and 5 or 6 BUT not both
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberString = JOptionPane.showInputDialog(null, "Enter a number", "Number Input", JOptionPane.QUESTION_MESSAGE);
		
		int number = Integer.parseInt(numberString);
		
		boolean valid1 = false;
		boolean valid2 = false;
		boolean valid3 = false;
		
		if ((number % 5 == 0) && (number % 6 == 0)) {
			valid1 = true;
		}
		
		if ((number % 5 == 0) || (number % 6 == 0)) {
			valid2 = true;
		}
		
		if ((number % 5 == 0) ^ (number % 6 == 0)) {
			valid3 = true;
		}
		
		String output = "Is " + number + " divisible by 5 and 6? " + valid1 + "\n" +
						"Is " + number + " divisible by 5 or 6? " + valid2 + "\n" +
						"Is " + number + " divisible by 5 or 6 but not both? " + valid3;
		
		JOptionPane.showMessageDialog(null, output, "Number Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
