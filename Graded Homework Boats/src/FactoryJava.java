public class FactoryJava {
// these variables store info about the factory
    public String owner = "D.Kitsos Boat Sales";

public boolean isOpen = true;
public int yearFounded = 2008;
//these variables will store the three boat objects
public Boats boat1;
    public Boats boat2;
    public Boats boat3;
// main method where my code starts
    public static void main(String[] args){
// creates a new factory which calls the constructor
        FactoryJava a = new FactoryJava();


    }

// constructor runs when a new factory is made
    public FactoryJava () {
//prints info about the factory
        System.out.println("welcome to Dion Boat Factory");
        System.out.println("The factory was founded in" + yearFounded);
        System.out.println("it is" + isOpen + "that the boat factory is open");


        //creates boat #1 with its brand, running status, and how many hours it has
        boat1 = new Boats( "Boston Whaler", true, 500);
        //prints info about boat 1
        System.out.println("Boat 1");
        boat1.printInfo();

        //adds one hour to boat 1 and prints it in its new info
        boat1.addHours();
        boat1.printInfo();

        //creates second boat with different starting values
        boat2 = new Boats( "Regulator", true, 100);
        //prints info about boat 2
        System.out.println("Boat 2");
        boat2.printInfo();
        boat2.addHours();
        boat2.printInfo();

//creates 3rd boat eith different values
        boat3 = new Boats("Sea pro", false, 1000);
        //prints info about boat 3
        System.out.println("Boat 3");
        boat3.printInfo();
        //adds one hour to boat
        boat3.addHours();
        // print boat 3s updted info
        boat3.printInfo();



    }

}
