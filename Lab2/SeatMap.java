import java.util.*;
import java.util.Vector;
import java.io.File;
import java.io.IOException;
/**
 * 
 * @author George Steuby
 * @since 9/7/2017 10:51 AM
 *
 */
public class SeatMap {
	private String[][] seats;
	public int count;
	public SeatMap() {
		readFile();
		populateArray();
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		SeatMap seatMap = new SeatMap();
		System.out.println("Input row number:");
		int i = input.nextInt();
		System.out.println("Input column number:");
		int x = input.nextInt();
		seatMap.getSeat(i, x);
		input.close();
	}
public void readFile() {
	try {
	File inputFile = new File("src/names.dat");
    Scanner input = new Scanner(inputFile);
    
    while(input.hasNext()) {
    	count++;
    input.nextLine();
    }
    input.close();
	}catch (IOException e) {
	    System.err.println("IOException in reading input file!");
	}	
		
		
	}
	
public void populateArray() {
	int size = (int) (Math.sqrt( (double)(count))) + 1;
	seats = new String[size][size];
	try {
		File inputFile = new File("src/names.dat");
	    Scanner input = new Scanner(inputFile);
	for(int i = 0; i <= size; i++) {
		for(int x = 0; x <= size; x++) {
			if (input.equals(null)) break;
			seats[i][x] = input.nextLine();
		}

	}
	input.close();
	}catch (IOException e) {
	    System.err.println("IOException in reading input file!");
	}	
}
public String getSeat(int i, int x) {
	if(!(seats[i][x].equals(null)) ) {
		
	
	return seats[i][x].toString();
	}
	else return "empty seat";
}
}


