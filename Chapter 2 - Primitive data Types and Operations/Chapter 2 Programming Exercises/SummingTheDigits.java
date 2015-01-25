import javax.swing.JOptionPane;


public class SummingTheDigits {

	/**
	 * This program sums all the digits of a number together
	 * For example: 932 = 9 + 3 + 2 = 14
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = JOptionPane.showInputDialog(null, "Enter a number between 0 and 1000", "Number Input", JOptionPane.QUESTION_MESSAGE);
		
		int input = Integer.parseInt(inputString);
		int remainingInput = input;
		
		int sum = 0;
		
		// Get the 1's
		sum += remainingInput % 10;
		remainingInput = remainingInput / 10;
		
		// Get the 10's
		sum += remainingInput % 10;
		remainingInput = remainingInput / 10;
		
		// Get the 100's
		sum += remainingInput;
		
		String output = "The sum of the digits in " + input + " equals " + sum;
		
		JOptionPane.showMessageDialog(null, output, "Output", JOptionPane.INFORMATION_MESSAGE);
		
	}

}
