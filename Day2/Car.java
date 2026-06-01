package Day2;

public class Car {
   

        //Attributes (Fields)
        String year;
        String Color;

        //constructor
        public Car(String year, String Color) {
            this.year = year;
            this.Color = Color;
        }

        //methods
        public void start() 
        {
            System.out.println("Car is starting");
        }       

        //main method
        public static void main(String[] args) 
        {
            Car TOTO=new Car("2020", "Red");
            System.out.println(TOTO.year);  
            System.out.println(TOTO.Color);  

            TOTO.start();
        }


    }

