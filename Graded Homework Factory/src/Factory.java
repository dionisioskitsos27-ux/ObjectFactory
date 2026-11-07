
    public class Factory {

        public String owner = "Dion";

        public boolean isOpen = true;
        public int yearFounded = 2023;

        // make three lawn mower objects
        public LawnMowers mower1;
        public LawnMowers mower2;
        public LawnMowers mower3;


        // main method
        // creates a new factory
        public static void main(String[] args) {

            Factory a = new Factory();

        }


        // special method: constructor
        // name has to be the same as the class
        // do not say void
        public Factory() {

            System.out.println("Welcome to Dion Lawn Mower Factory");
            System.out.println("The factory was founded in " + yearFounded);
            System.out.println("It is " + isOpen + " that the factory is open");


            // make the first lawn mower
            mower1 = new LawnMowers("Wright", true, 500);

            System.out.println("Mower 1");
            mower1.printInfo();

            // add one hour to mower 1
            mower1.addHours();
            mower1.printInfo();


            // make the second lawn mower
            mower2 = new LawnMowers("Scag", false, 300);

            System.out.println("Mower 2");
            mower2.printInfo();

            // change the mower to running
            mower2.changeRunning(true);
            mower2.printInfo();


            // make the third lawn mower
            mower3 = new LawnMowers("Exmark", true, 200);

            System.out.println("Mower 3");
            mower3.printInfo();

            // add an hour and turn off the mower
            mower3.addHours();
            mower3.changeRunning(false);
            mower3.printInfo();

        }
    }
