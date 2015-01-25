import javax.swing.JOptionPane;


public class UpperToLower {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString = JOptionPane.showInputDialog(null, "Enter a character or message to convert to lowercase", "Input", JOptionPane.QUESTION_MESSAGE);
		
		String input = inputString.toLowerCase();
		
		JOptionPane.showMessageDialog(null, input, "Output", JOptionPane.INFORMATION_MESSAGE);

	}

}
