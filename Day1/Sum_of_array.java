package Day1;
public class Sum_of_array {
    public static void main(String[] args) 
    {
        // Declaration and initialization of an array
        int[] arr = {1, 2, 3, 4, 5};

        // Variable to store the sum of the array elements
        int sum = 0;

        // Loop to calculate the sum of the array elements
        for (int i =0; i < arr.length; i++)
        {
            sum += arr[i]; // Adding each element to the sum
        }
        System.out.println("Sum of array elements: " + sum);

        // using while loop
        int index = 0;
        int total =0;

        while (index < arr.length) {
            total += arr[index]; // Adding each element to the sum
            index++;
        }
        System.out.println("Sum of array elements using while loop: " + total);
    }
}
