import javax.swing.JOptionPane;


public class VolumeOfCylinder {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String radiusString = JOptionPane.showInputDialog(null, "Enter the radius of the cylinder", "Radius Input", JOptionPane.QUESTION_MESSAGE);
		String lengthString = JOptionPane.showInputDialog(null, "Enter the length of the cylinder", "Length Input", JOptionPane.QUESTION_MESSAGE);
		
		double radius = Double.parseDouble(radiusString);
		double length = Double.parseDouble(lengthString);
		
		double area = radius * radius * Math.PI;
		
		double volume = area * length;
		
		String output = "The volume of a cylinder with radius "
					  + radius 
					  + " and length "
					  + length
					  + " is equal to "
					  + volume;

		JOptionPane.showMessageDialog(null, output, "Volume output", JOptionPane.INFORMATION_MESSAGE);
	}

}
