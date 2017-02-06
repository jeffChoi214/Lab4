import java.util.Scanner;

/*
 * Lab 4 written by Jeff Choi
*/

public class main {
    public static long factorial (int input, long result) {
        if (input == 1) {
            return result;
        }
        else {
            return factorial(input - 1, result * input);
        }

    }
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Factorial Calculator!");

        System.out.print("Enter an integer that is greater than 0 but less than 10: ");
        int factorialNum = sc.nextInt();

        System.out.println("taking the factorial of " + factorialNum);

        while (factorialNum <= 0 || factorialNum > 10) {
            System.out.println("Please choose an integer between 0 and 10");
            factorialNum = sc.nextInt();
        }

        System.out.println("The factorial of " + factorialNum + " is " + factorial(factorialNum, 1));
    }
}
