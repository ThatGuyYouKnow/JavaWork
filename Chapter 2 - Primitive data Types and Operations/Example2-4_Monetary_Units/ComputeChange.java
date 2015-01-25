/**
 * 
 */
import javax.swing.JOptionPane;

/**
 * @author fleer
 * This program classifies a given amount of money into smaller monetary units. The program lets the user enter
 * an amount as a double value representing a total in dollars and cents, and ouputs a report listing the
 * monetary equivalent in dollars, quarters, dimes, nickels, and pennies.
 * 
 * The program reports the maximum number of dollars, then the maximum number of quarters,
 * and so on in this order.
 */
public class ComputeChange {

	/**
	 * Main method
	 * @param args
	 */
	public static void main(String[] args) {
		// Receive the amount entered from the keyboard
		String amountString = JOptionPane.showInputDialog(null, 
				"Enter an amount in double, for example 11.56",
				"Example 2.4 Input", JOptionPane.QUESTION_MESSAGE);
		
		// Convert string to double
		double amount = Double.parseDouble(amountString);
		
		int remainingAmount = (int)(amount * 100);
		
		// Find the number of one dollars
		int numberOfOneDollars = remainingAmount / 100;
		remainingAmount = remainingAmount % 100;
		
		// Find the number of quarters in the remaining amount
		int numberOfQuarters = remainingAmount / 25;
		remainingAmount = remainingAmount % 25;
		
		// Find the number of dimes in the remaining amount
		int numberOfDimes = remainingAmount / 10;
		remainingAmount = remainingAmount % 10;
		
		// find the number of nickels in the remaining amount
		int numberOfNickels = remainingAmount / 5;
		remainingAmount = remainingAmount % 5;
		
		// find the number of pennies in the remaining amount
		int numberOfPennies = remainingAmount;
		
		// Display results
		String output = "Your amount " + amount + " consists of \n" +
				numberOfOneDollars + " dollars\n" +
				numberOfQuarters   + " quarters\n" +
				numberOfDimes      + " dimes\n" +
				numberOfNickels    + " nickels\n" +
				numberOfPennies    + " pennies";
		JOptionPane.showMessageDialog(null, output, "Example 2.4 Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
