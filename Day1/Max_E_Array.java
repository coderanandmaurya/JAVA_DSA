package Day1;

public class Max_E_Array 
{
public static void main(String[] args)
{
    //creating array of integers
    int marks[] = {85, 92, 78, 90, 88};

    //init a vale to store max value
    int Max_Marks = marks[0];

    //loop to iterate through the array
    for (int i =1; i<marks.length; i++)
        
    //compare each element with the current max value
    {
        if (marks[i]> Max_Marks){
            Max_Marks = marks[i];
        }
    }

System.out.println("The maximum marks is: " + Max_Marks);   
}

}
