import java.util.Scanner;

public class ProblemTwo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input an integer: ");
        int a = input.nextInt();
        System.out.println("Input an integer: ");
        int b = input.nextInt();
        System.out.println("Input an integer: ");
        int c = input.nextInt();


        if (c<b && b<a) {
            System.out.println("Decreasing Order");
        } else if (c>b && b>a) {
            System.out.println("Increasing Order");
        } else {
            System.out.println("neither increasing or decreasing order");

        }
    }
}
