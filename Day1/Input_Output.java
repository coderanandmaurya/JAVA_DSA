package Day1;

// importing Scanner class for user input
import java.util.Scanner;

// class to demonstrate input and output in Java
public class Input_Output {
    public static void main(String[] args) 
    {
        // creating a Scanner object to read input from the user
        Scanner sc= new Scanner(System.in);

        // prompting the user to enter their name
        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        // displaying a greeting message to the user
        System.out.println("Hello, " + name + "!");
        sc.close();
}
}