public class Factory {
    public String owner = "Dion";


    public boolean isOpen = true;
    public int yearFounded = 2023;
    public Donuts donutOrder1;
    int randomNumber;
    int randomNumber2;

   //todo: make a new donut called donutsOrder2
    public Donuts donutOrder2;

    //class blueprints
    //object->
    public static void main(String[] args) {
Factory a = new Factory ();
    }
// special method:constructor
    // name has to be the same name as the class
    // do not say void
    public Factory(){

        System.out.println("Welcome to Dion Factory");
        System.out.println("the factory was founded in ");
        System.out.println(yearFounded);
        System.out.println("It is " + isOpen + " that the factory is open");


        randomNumber = (int) (Math.random() * 100) +1; //1-100 donuts
        // make an object of type Donuts
        donutOrder1 = new Donuts ( randomNumber);
        System.out.println(donutOrder1.numberOfDonuts + " Donuts Please ");
        System.out.println(" It Is " + donutOrder1.hasFilling + " that I want filling");
        System.out.println(" I would like " + donutOrder1.frostingType + " Please ") ;
        // todo: print all of the instance variables of donuts
        donutOrder1.numberOfDonuts = donutOrder1.numberOfDonuts + 1;
        System.out.println(donutOrder1.numberOfDonuts + " Donuts Please ");


        randomNumber2 = (int) (Math.random() * 45) +1;
        donutOrder2 = new Donuts(6);
        System.out.println(donutOrder2.numberOfDonuts + " Donuts Please ");
        System.out.println(" It Is " + donutOrder2.hasFilling + " that I  Dont want filling");
        System.out.println(" I would like " + donutOrder2.frostingType + " Please ") ;
       donutOrder2. numberOfDonuts = donutOrder1.numberOfDonuts * 2;
        System.out.println(donutOrder2.numberOfDonuts + " Donuts Please ");


        donutOrder2.printInfo();

    }
}
