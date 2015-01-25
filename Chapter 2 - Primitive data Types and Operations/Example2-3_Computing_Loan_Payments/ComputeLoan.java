/**
 * 
 */
import javax.swing.JOptionPane;
/**
 * @author fleer
 * This example shows you how to write a program that computes loan payments.
 * The loan can be a car loan, a student loan, or a home mortgage loan. The program lets the user
 * enter the interest rate, the number of years, and loan amount, and then computes the monthly payment
 * and the total payment. It concludes by displaying the monthly and total payments.
 */
public class ComputeLoan {

	/**
	 * Main Method
	 * @param args
	 */
	public static void main(String[] args) {
		// Enter yearly interest rate
		String annualInterestRateString = JOptionPane.showInputDialog(
				null, "Enter yearly interest rante, for example 8.25: ",
				"Example 2.3 Input", JOptionPane.QUESTION_MESSAGE);
		
		// Convert string to double
		double annualInterestRate = Double.parseDouble(annualInterestRateString);
		
		// Obtain monthly interest rate
		double monthlyInterestRate = annualInterestRate / 1200;
		
		// Enter number of years
		String numberOfYearsString = JOptionPane.showInputDialog(null,
				"Enter number of years as an integer, \nfor example 5:",
				"Example 2.3 Input", JOptionPane.QUESTION_MESSAGE);
		
		// Convert string to int
		int numberOfYears = Integer.parseInt(numberOfYearsString);
		
		// Enter loan amount
		String loanString = JOptionPane.showInputDialog(null,
				"Enter loan amount, for example 120000.95",
				"Example 2.2 Input", JOptionPane.QUESTION_MESSAGE);
		
		// Convert string to double
		double loanAmount = Double.parseDouble(loanString);
		
		// Calculate payment
		double monthlyPayment = loanAmount * monthlyInterestRate / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12));
		double totalPayment = monthlyPayment * numberOfYears * 12;
		
		// Format to keep two digits after the decimal point
		monthlyPayment = (int)(monthlyPayment * 100) / 100.0;
		totalPayment = (int)(totalPayment * 100) / 100.0;
		
		// Display results
		String output = "The monthly payment is " + monthlyPayment + "\nThe total payment is " + totalPayment;
		JOptionPane.showMessageDialog(null, output, "Example 2.3 Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
