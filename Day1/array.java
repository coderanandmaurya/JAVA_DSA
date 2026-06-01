package Day1;

public class array {
    public static void main(String[] args)
    {
        //Declaration
        //int [] arr=new int[5];

        //Initialization
        int [] arr2={1,2,3,4,5};

        //Accessing elements
        System.out.println("First element: " + arr2[0]);

        // Modifying elements
        arr2[0] = 10;
        System.out.println("Modified first element: " + arr2[0]);

        // Length of the array
        System.out.println("Length of the array: " + arr2.length);

        // traversing the array
        for(int i=0; i<arr2.length; i++)
        {
            System.out.println("Element at index " + i + ": " + arr2[i]);
        }

}
}
