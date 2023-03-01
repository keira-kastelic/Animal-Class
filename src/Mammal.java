public class Mammal extends Animal{ // creating an inheritance class that extends the animal class
    private String fur; // creating a fur variable

    public Mammal(){super();} // getting the values from the animal class

    public Mammal(int yearsRemaining, String size, String diet, String fur, int legs){ // getting the variables for the mammal constructor
        super(legs, yearsRemaining, size, diet); // getting the variables from the animal class
        this.fur = fur; // setting the fur variable
    }

    public String getFur(){return fur;} // creating an accessor method for fur

    public void setFur(String fur){
        this.fur = fur;
    } // creating a mutator method for fur

    public void speciesSize(){System.out.println("Varies");} // overriding the species size method from the animal class to be varies

    public void speak(){System.out.println("rawr");}
}
