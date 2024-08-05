import java.util.Scanner;

public class ConvertIntoInteger {
    public static void main(String[] args) {
        // Creating object of Scanner class
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");

        // Taking input(in String) from user using Scanner class object
        String str = sc.nextLine();
        int num;

        // Handling NumberFormatException and NullPointerException
        try {
            if(str == null || str.isEmpty())
                throw new NullPointerException("Input string is null or empty");
            num = Integer.parseInt(str); // This line may throw NumberFormatException if input is not an integer
            System.out.println("Entered value after parsing into integer: "+num);
        }
        // Catch block to handle NullPointerException
        catch (NullPointerException e){
            System.out.println(e);
        }
        // Catch block to handle NumberFormatException
        catch (NumberFormatException e){
            System.out.println(e);
            System.out.println("Error: The input string is not a valid integer.");
        }
    }
}
