import javax.swing.JOptionPane;


public class CheckForEven {

	/**
	 * This program checks to see if a number is even
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String numberInput = JOptionPane.showInputDialog(null, "Enter a number to see if it's even", "Number input", JOptionPane.QUESTION_MESSAGE);
		
		int number = Integer.parseInt(numberInput);
		
		boolean even = true;
		
		if (number % 2 > 0) {
			even = false;
		}
		
		String output = "Is " + number + " an even number? " + even;
		
		JOptionPane.showMessageDialog(null, output, "Is Even?", JOptionPane.INFORMATION_MESSAGE);
	}

}
