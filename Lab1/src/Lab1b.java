
/**
 * CS 2003 - Lab 1. Code to compute the average of doubles from an input
 * file.  NOTE: add data members and methods at your convenience. Use
 * the most accurate data types. You can reuse bits of code from
 * the class Lab1a.
 *
 * @author
 */

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
import java.io.File;
import java.io.IOException;

public class Lab1b {

	// data members
	ArrayList doubleVector;

	/**
	 * Constructor: calls method readFile that reads the doubles contained in the
	 * file "<code>filename</code>" and computes the average of the elements.
	 * 
	 * @param filename
	 *            name of the file containing doubles.
	 * @author George Steuby
	 * @since 9/1/2017
	 * @version 1
	 */
	public Lab1b(String filename) {
		readFile(filename);
	}

	/**
	 * Reads double from a file named <code>filename</code> and computes the average
	 * of the elements contained in the file
	 * 
	 * @param filename
	 *            name of the file containing the doubles
	 * @author George Steuby
	 * @since 9/1/2017
	 * @version 1
	 */
	public void readFile(String filename) {
		// -- TO COMPLETE -- Method description here
		try {
			File inputFile = new File("src/Lab1a.dat");
			Scanner input = new Scanner(inputFile);
			doubleVector = new ArrayList<Double>();
			int count = 0;
			Double elt;
			// store all elements in a vector
			while (input.hasNextDouble()) {
				elt = new Double(input.nextDouble());
				count++;
				doubleVector.add(elt);
			}
			double sum = 0;
			for (int i = 0; i < doubleVector.size(); i++) {
				sum = sum + (doubleVector.get(i)).getDoubleValue();
			}

			double avg = sum / count;

			// output results
			System.out.println("The average value is " + avg);
			input.close();
		} catch (IOException e) {
			System.err.println("IOException in reading input file!!!");
		}
	} // end readFile()

	/**
	 * main : creates a Lab1b Object with the filename passed in argument
	 * 
	 * @author George Steuby
	 * @since 9/1/2017
	 * @version 1
	 */
	public static void main(String args[]) {
		args = new String[] { "src/Lab1b.dat" };
		if (args.length == 0)
			System.err.println("enter the data file name!");
		else
			new Lab1b(args[0]);
	} // end main

} // end class Lab1b
