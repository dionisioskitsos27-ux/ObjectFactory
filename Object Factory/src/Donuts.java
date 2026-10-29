public class Donuts {
    //classes are blueprints for the things we wanna make
// donuts need instance variables
    // frosting tyope
    public String frostingType;
    //is there filling or no filling
    public boolean hasFilling;
    //how many donuts
    public int numberOfDonuts;
    //todo: make these 3 comments into variables. think about data tyoes

// constructor
    //method
    //do not say void
    // has to match exactly the name of the class
    public Donuts(int pNumberOfDonuts){

        frostingType = "boston creme";
        hasFilling = true;
        numberOfDonuts = pNumberOfDonuts;


    }

//todo: make a method called printInfo

    public void printInfo(){
        //todo: use souts to print the instance variables
        System.out.println(frostingType);
        System.out.println("the number of donuts is " + numberOfDonuts);

    }

}

