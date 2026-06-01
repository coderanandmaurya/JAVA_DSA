package Day1;

public class Methods {

    // Method to add two numbers
    static int add(int num1, int num2) {
        return num1 + num2;
    }

    // Method to greet a person
    static String greet(String name) {
        return "Hello, " + name + "!";
    }

    // Main method to test the above methods
    public static void main(String[] args) {
        // Testing the add method
        int result = add(5, 10);
        System.out.println("Sum: " + result);

        // Testing the greet method
        String greeting = greet("Anand");
        System.out.println(greeting);
    }
}