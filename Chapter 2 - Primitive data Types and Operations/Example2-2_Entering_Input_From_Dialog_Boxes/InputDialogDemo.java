/**
 * 
 */

// Import an Option Panel for inputs
import javax.swing.JOptionPane;
/**
 * @author fleer
 * This example shows you how to enter input from dialog boxes. The program prompts the user to enter a year as an int value and checks whether
 * it is a leap year; then it prompts the user to enter a double value and checks whether it is positive.
 * 
 * A year is a leap year if it is divisible by 4 but not by 100 or if it is divisible by 400
 */
public class InputDialogDemo {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Prompt the user to enter a year
		String yearString = JOptionPane.showInputDialog( null, "Enter a year", "Example 2.2 Input (int)",
				JOptionPane.QUESTION_MESSAGE);
		
		// Convert the string into an int value
		int year = Integer.parseInt(yearString);
		
		// Check if the year is a leap year
		boolean isLeapYear = 
				((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
		
		// Display the result in a message dialog box
		JOptionPane.showMessageDialog(null,
				year + " is a leap year? " + isLeapYear,
				"Example 2.2 Output (int)", JOptionPane.INFORMATION_MESSAGE);
		
		// Prompt the user to enter a double value
		String doubleString = JOptionPane.showInputDialog(null,
				"Enter a double value", "Example 2.2 Input (double)",
				JOptionPane.QUESTION_MESSAGE);
		
		// Conver the string into a double value
		double doubleValue = Double.parseDouble(doubleString);
		
		// Check if the number is positive
		JOptionPane.showMessageDialog(null, doubleValue + " is positive? " + (doubleValue > 0),
				"Example 2.2 Output (double)",
				JOptionPane.INFORMATION_MESSAGE);
	}

}
