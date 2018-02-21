/*
 * @project Week3
 * @author  Osbardo Rodriguez
 * Date:    2/20/18
 */
package Week3;

/*
 * Import the Scanner java package.
 */
import java.util.Scanner;

/**
 * Define class Main.
 */
public class Main {

    public static void main(String[] args) {

	    // Instantiate the Scanner
	    Scanner input = new Scanner( System.in );

	    /*
	     * Declare our variables
	     */
	    int userVar;
	    int counter = 1;
	    int result  = 0;

	    /*
	     * Go from 1 to the user number
	     * Update result each time.
	     */
	    System.out.print( "Please enter a number to get the triangle of: " );
	    userVar = input.nextInt();

	    // Use a while loop.
	    while ( counter <= userVar ) {
		    result = result + counter;
		    counter++;
	    }

	    // Print out the result.
	    System.out.println( "The triangle of " + userVar + " is " + result );

	    /*
	     * Reset the necessary variables and create a for loop.
	     */
	    result = 0;

	    for ( counter = 1; counter <= userVar; counter++ ) {
			result = result + counter;
	    }

	    // Print out the result.
	    System.out.println( "The triangle of " + userVar + " is " + result );

	    /*
	     * Reset the necessary variables and create a do-while loop.
	     */
	    result  = 0;
	    counter = 0;

	    // Do the do-while loop.
	    do {
		    result = result + counter;
		    counter++;
	    } while ( counter <= userVar );

	    // Print out the result.
	    System.out.println( "The triangle of " + userVar + " is " + result );
    }
}
