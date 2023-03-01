public class Birds extends Animal{ // creating an inheritance class that extend the animal class
    private int wingSpan; // creating a new variable for wing span

    public Birds(){ //getting the values from the animal class
        super();
        wingSpan = 10;
    }

    public Birds(int legs, int yearsRemaining, String size, String diet, int wingSpan){ // getting the variables for the birds constructor
        super(legs, yearsRemaining, size, diet);// getting the variables from the animal class
        this.wingSpan = wingSpan; // setting the wingSpan variable
    }

    public int getWingSpan(){
        return wingSpan;
    } // creating a wingSpan accessor method

    public void setWingSpan(int wingSpan){
        this.wingSpan = wingSpan;
    } // creating a wingSpan mutator method

    public void speak(){
        System.out.println("churp");
    } // overriding the speak method from the animal class to be churp
}
