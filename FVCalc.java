// Computes the future value of a saving investment.
public class FVCalc {
    public static final int NUM_OF_ARGS = 3;
	public static void main(String[] args){

        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java FVCalc <CURRENT_VALUE> <INTEREST_RATE> <NUMBER_OF_YEARS>");
            return;
        }

        int currentValue = Integer.parseInt(args[0]);
        double interest = Double.parseDouble(args[1]);
        double numYears = Integer.parseInt(args[2]);

        double interestPercentage = interest / 100; // It is a percentage.

        double valueAfterYears = currentValue * (Math.pow(1 + interestPercentage, (int)numYears));
        System.out.println("After " + (int)numYears + " years, $" + currentValue + " saved at " + interest + "% will yield $" + (int)valueAfterYears);
	}
}