/**
 * 
 */

/**
 * @author fleer
 *
 */
public class ComputeArea {
	/** Main method */
	public static void main(String[] args) {
		// Declare PI to be a constant.
		// Constant means it cannot change.
		final double PI = 3.14159;
		
		double radius;
		double area;
		
		// Assign a radius
		radius = 20;
		
		// Compute area
		// This computation now uses the constant, PI.
		area = radius * radius * PI;
		
		// Display results
		System.out.println("The area for the circle of radius " + radius + " is " + area);
	}
}
