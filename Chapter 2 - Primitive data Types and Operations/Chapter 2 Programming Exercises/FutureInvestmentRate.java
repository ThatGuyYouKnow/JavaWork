import javax.swing.JOptionPane;


public class FutureInvestmentRate {

	/**
	 * This program reads in an investment amount, annual interest rate, and number of years.
	 * It then displays the future investment value.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String amountString = JOptionPane.showInputDialog(null, "Enter the investment amount", "Investment Input", JOptionPane.QUESTION_MESSAGE);
		String interestString = JOptionPane.showInputDialog(null, "Enter the annual interest rate", "Rate Input", JOptionPane.QUESTION_MESSAGE);
		String yearsString = JOptionPane.showInputDialog(null, "Enter the number of years", "Years Input", JOptionPane.QUESTION_MESSAGE);
		
		double amount = Double.parseDouble(amountString);
		double annualInterest = Double.parseDouble(interestString);
		int years = Integer.parseInt(yearsString);
		
		double futureInvestmentValue = amount * Math.pow((1 + (annualInterest/1200)), (years*12));
		
		futureInvestmentValue = (int)(futureInvestmentValue * 100) / 100.0;
		
		String output = "If you invested " + amount + " for " + years + " years with an annual interest rate of " + annualInterest +
						"%, you would have a future investment value of " + futureInvestmentValue;
		
		JOptionPane.showMessageDialog(null, output, "Future Investment Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
