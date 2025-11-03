// Splits a restaurant bill evenly among three diners.

public class Bill3 {
    public static final int NUM_OF_ARGS = 4;
	public static void main(String[] args) {

        if (args.length != NUM_OF_ARGS) {
            System.err.println("Usage: java Bill3 <name1> <name2> <name3> <TOTAL_PAYMENT>");
            return;
        }
        String name1 = args[0];
        String name2 = args[1];
        String name3 = args[2];
        int totalPayment = Integer.parseInt(args[3]);
        double toPayForEach = Math.ceil((double) totalPayment / 3);
        String formatLine = String.format("Dear %s, %s, and %s: pay " + toPayForEach + " Shekels each.", name3, name2, name1);
        System.out.println(formatLine);
	}
}
