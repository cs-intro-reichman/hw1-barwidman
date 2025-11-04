import java.util.Random;

// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
        int lim = Integer.parseInt(args[0]);
        int firstNumber = (int)(Math.random() * lim);
        int secondNumber = (int)(Math.random() * lim);
        int thirdNumber = (int)(Math.random() * lim);
        int minValue = Math.min(Math.min(firstNumber, secondNumber),  thirdNumber);
        int maxValue = Math.max(Math.max(firstNumber, secondNumber),  thirdNumber);
        int middleValue = (firstNumber + secondNumber + thirdNumber) - minValue - maxValue;
        System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
        System.out.println(minValue + " " + middleValue + " " + maxValue);
	}
}
