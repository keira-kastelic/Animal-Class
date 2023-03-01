public class Giraffe extends Mammal{ // creating an inheritance class that extends the mammal class
    private String print; // creating a print variable

    public Giraffe(){ super(); } // getting the values from the mammal class

    public Giraffe(String fur, int yearsRemaining, String size, String diet, int legs, String print){ // creating a giraffe constructor
        super (yearsRemaining, size, diet, fur, legs); // gettint the variables from the animal and mammal classes
        this.print = print; // setting the print variable
    }

    public String getPrint(){return print;} // creating a print accessor method

    public void setPrint(String print){
        this.print = print;
    } // creating a print mutator method

    public void food(){System.out.println("trees");} // overriding the fodd method to be trees
    public void speciesSize() {System.out.println("Large");} // overriding the species size method to be large
    public void speak(){System.out.println("...");} // giraffes cant talk/ we cant hear it
}
