import java.util.*;
public class ProblemOne {

    public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        int X;
	    int Sum = 0;
	    System.out.println("Enter an integer between 0 and 1000: ");
	    X = input.nextInt();
	    while (X<0 || X>999){
	    	System.out.println("Please enter an integer between 0 and 1000");
			X = input.nextInt();
		}
	    int thirdDigit = X%10;
	    int remainingDigits = X/10;
	    int secondDigit = remainingDigits%10;
	    int firstDigit = remainingDigits/10;

	    System.out.println(thirdDigit);
	    System.out.println(secondDigit);
	    System.out.println(firstDigit);
	    Sum = firstDigit + secondDigit + thirdDigit;
	    System.out.println("Sum of the digits: " + Sum);
    }
}
