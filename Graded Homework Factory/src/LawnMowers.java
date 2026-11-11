    public class LawnMowers {

        // classes are blueprints for the things we wanna make
        // lawn mowers need instance variables

        // brand of the lawn mower
        public String mowerBrand;

        // is the mower running or not
        public boolean isRunning;

        // how many hours are on the mower
        public int mowerHours;


        // constructor
        // has to match the name of the class
        // do not say void
        public LawnMowers(String pMowerBrand, boolean pIsRunning, int pMowerHours) {

            mowerBrand = pMowerBrand;
            isRunning = pIsRunning;
            mowerHours = pMowerHours;

        }


        // method to print all the instance variables
        public void printInfo() {

            System.out.println("The lawn mower brand is " + mowerBrand);
            System.out.println("It is " + isRunning + " that the mower is running");
            System.out.println("The mower has " + mowerHours + " hours on it");

        }


        // method to add hours to the lawn mower
        public void addHours() {

            mowerHours++;

        }


        // method to change if the mower is running
        public void changeRunning(boolean newRunning) {

            isRunning = newRunning;

        }

    }