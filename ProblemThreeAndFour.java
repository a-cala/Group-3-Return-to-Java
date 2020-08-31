import java.util.Scanner;

public class ProblemThreeAndFour {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        FindIndex(array);


    }
    public static void FindIndex(int array[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an array index number between 1 and 5");
        int X = input.nextInt();
        while (X < 1 || X > 5 ) {
            System.out.println("that number is not in the array");
            X = input.nextInt();
        }
        for (int i = 0; i < 4; i++){
            if (X == array[i]) {
                System.out.println("index: " + i);
            }
        }
    }
}
