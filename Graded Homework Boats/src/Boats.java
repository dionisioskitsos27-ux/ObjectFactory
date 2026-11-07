public class Boats {


    //these are the three variables that describe each boat
    //string stores the brand of boat
public String boatBrand;
// boolean tells us if the boat is running or not
public boolean isRunning;
// int stores ho many hours the boat has
public int boatHours;


//contructor gives the boat its starting values
    //the parameters are used to set the three variables
public Boats (String pBoatBrand, boolean pIsRunning, int pBoatHours){


    boatBrand = pBoatBrand;
    isRunning = pIsRunning;
    boatHours = pBoatHours;

}
//this method prints out all the info about the boats
public void printInfo(){


    System.out.println("The boat brand is" + boatBrand);
    System.out.println("it is" + isRunning + "that the boat is running");
    System.out.println("The boat has" + boatHours + "hours on it");

}
//this method adds 1 hour to the boats total hours
public void addHours() {

    boatHours++;

}
//this methoid changes if the boat is running or not running
    //newRunning is the new boolean value
public void changeRunning(boolean newRunning){

    isRunning = newRunning;
}


}
