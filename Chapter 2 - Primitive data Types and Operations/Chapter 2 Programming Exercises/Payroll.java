import javax.swing.JOptionPane;


public class Payroll {

	/**
	 * This program reads in an employee's name, number of hours worked in a week, hourly pay rate,
	 * federal tax withholding rate, and state tax withholding rate.
	 * It then prints a payroll slip.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nameString = JOptionPane.showInputDialog(null, "Enter employee's full name:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
		String hoursString = JOptionPane.showInputDialog(null, "Enter number of hours worked in a week:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
		String hourlyRateString = JOptionPane.showInputDialog(null, "Enter hourly pay rate:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
		String federalTaxRateString = JOptionPane.showInputDialog(null, "Enter federal tax withholding rate:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
		String stateTaxRateString = JOptionPane.showInputDialog(null, "Enter state tax withholding rate:", "Payroll Input", JOptionPane.QUESTION_MESSAGE);
		
		int hours = Integer.parseInt(hoursString);
		double hourlyRate = Double.parseDouble(hourlyRateString);
		double federalTaxRate = Double.parseDouble(federalTaxRateString);
		double stateTaxRate = Double.parseDouble(stateTaxRateString);
		
		double grossPay = (int)((hourlyRate * hours) * 100) / 100.0;
		double federalTax = (int)((grossPay * federalTaxRate) * 100) / 100.0;
		double stateTax = (int)((grossPay * stateTaxRate) * 100) / 100.0;
		
		double totalDeductions = federalTax + stateTax;
		double netPay = grossPay - totalDeductions;
		
		String output = "Employee Name: " + nameString +
						"\n\n Hours Worked: " + hours +
						"\n Pay Rate: $" + hourlyRate +
						"\n Gross Pay: $" + grossPay +
						"\n Deductions: " +
						"\n     Federal Withholding (" + (federalTaxRate * 100) + "%): $" + federalTax +
						"\n     State Withholding (" + (stateTaxRate * 100)+ "%): $" + stateTax +
						"\n     Total Deduction: $" + totalDeductions +
						"\n Net Pay: $" + netPay;
		
		JOptionPane.showMessageDialog(null, output, "Payroll Output", JOptionPane.INFORMATION_MESSAGE);
	}

}
