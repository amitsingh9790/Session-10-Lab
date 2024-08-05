import java.util.InputMismatchException;
import java.util.Scanner;

public class InputInteger {
    public static void main(String[] args) {
        // Creating Object of Scanner class
        Scanner sc = new Scanner(System.in);
        int number = 0;
        
        System.out.print("Enter a integer value: ");

        // Handle InputMismatchException using try and catch block
        // Try block to read an integer form the user input
        try {
            number = sc.nextInt(); // This line may throw InputMismatchException if input is not an integer
            System.out.println("Entered value: "+number); // Print the entered integer value
        }
        // Catch block to handle InputMismatchException
        catch (InputMismatchException e){
            System.out.println(e);
            System.out.println("User has entered non-integer value");
        }
    }
}
