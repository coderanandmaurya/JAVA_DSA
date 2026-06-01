package Day1;

public class Classes {
    // creating a class
    static class Student {
        String name ;
        int age;

        // method to display student details
        void display()
        {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }
        }
    
    // main method to test the Student class
    public static void main(String[] args) 
    {
        Student S1_Aman =new Student();
        S1_Aman.name="Aman";
        S1_Aman.age=20;
        S1_Aman.display();
    }
    
}
