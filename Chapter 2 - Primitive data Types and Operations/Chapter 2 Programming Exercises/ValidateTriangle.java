import javax.swing.JOptionPane;


public class ValidateTriangle {

	/**
	 * This program validates if a triangle is possible based off of 3 inputs.
	 * If the sum of any two edges is greater than the 3rd edge, the triangle is valid.
	 * For example: 1, 2, 1 is NOT valid. But 2, 2, 1 is.
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String edge1String = JOptionPane.showInputDialog(null, "Enter the first edge", "Edge 1 Input", JOptionPane.QUESTION_MESSAGE);
		String edge2String = JOptionPane.showInputDialog(null, "Enter the second edge", "Edge 2 Input", JOptionPane.QUESTION_MESSAGE);
		String edge3String = JOptionPane.showInputDialog(null, "Enter the third edge", "Edge 3 Input", JOptionPane.QUESTION_MESSAGE);
		
		double edge1 = Double.parseDouble(edge1String);
		double edge2 = Double.parseDouble(edge2String);
		double edge3 = Double.parseDouble(edge3String);
		
		boolean valid = false;
		
		if ( (edge1 + edge2 > edge3) && (edge1 + edge3 > edge2) && (edge2 + edge3 > edge1) ) {
			valid = true;	
		}
		
		String output = "Can edges " + edge1 + ", " + edge2 + ", and " + edge3 + " form a triangle? " + valid;
		
		JOptionPane.showMessageDialog(null, output, "Triangle Validity Output", JOptionPane.INFORMATION_MESSAGE);

	}

}
