import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Animal generic = new Animal(); // creating a new animal object
        Mammal mammal = new Mammal(); // creating a new mammal object
        Giraffe gerard = new Giraffe(); // creating a new giraffe object
        Birds bird = new Birds(); // creating a new birds object

        // methods from the animal class
        mammal.speak();
        gerard.getLegs();
        bird.getYearsRemaining();

        // methods created in the class
        mammal.getFur();
        bird.setWingSpan(8);
        gerard.setPrint("Giraffe print");

        // overriding animal class methods
        mammal.speciesSize();
        bird.speak();
        gerard.food();

        Animal maya; // creating a new animal
        Scanner s = new Scanner(System.in); // creatnig a new scaner
        System.out.println("Would you like to make a new Animal (1) , Mammal (2), or Giraffe(3) "); // prompting the user
        int user = s.nextInt(); // printing the users input into the user variable
        if(user == 1){ // creating an if statement for if the user enters 1
            maya = new Animal(); // making maya a new animal
            maya.speak(); // making maya speak as an animal
        } else if(user == 2){ // creating an if else statement for if the user enters 2
            maya = new Mammal(); // making maya a new mammal
            maya.speak(); // making maya speak as a mammal
        } else if(user == 3){ // creating an if else statement for if the user enters 3
            maya = new Giraffe(); // making maya a new giraffe
            maya.speak(); // making maya speak as a giraffe
        }
    }
}
