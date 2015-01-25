import javax.swing.JOptionPane;


public class FahrenheitToCelcius {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fahrenheit = JOptionPane.showInputDialog(null, "Enter a the degrees in Fahrenheit", "Fahrenheit to Celsius Input", JOptionPane.QUESTION_MESSAGE);
		
		double convertedFahrenheit = Double.parseDouble(fahrenheit);
		
		double celsius = (5.0 / 9) * (convertedFahrenheit - 32);
		
		String output = "The temperature in degrees Celsius is " + celsius + " degrees.";
		
		JOptionPane.showMessageDialog(null, output, "Fahrenheit to Celsius Output", JOptionPane.INFORMATION_MESSAGE);

	}

}
