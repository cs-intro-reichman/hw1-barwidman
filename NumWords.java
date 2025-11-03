// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
    public static final int NUM_OF_ARGS = 1;
	public static void main(String args[]) {
	    // Replace this comment with your code
        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java NumWords <NUMBER>");
            return;
        }

        int inputNumber = Integer.parseInt(args[0]);

        int hundreds = inputNumber % 1000;
        int tens = inputNumber % 100 / 10;
        int units = inputNumber % 10;
        System.out.println(hundreds + " hundreds, " + tens + " tens, and " + units + " ones.");
	}
}
