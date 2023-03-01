/**
 * Auto Coin Lab
 * Author: Keira
 * Collaborator(s):
 * On My Honor, I confirm that I followed all collaboration policy guidelines and that the work I am submitting is my own: KAK
 **/

public class Animal { // initializing the variables
    private int legs; // creating a leg variable
    private int yearsRemaining; // creating a years remaining variable
    private String size; // creating a size variable
    private String diet; // creating a diet variable

    public Animal() { // setting the variables equal to something
        legs = 4; // setting legs to 2
        yearsRemaining = 10; // setting years remaining to 10
        size = "medium"; // setting the size to medium
        diet = "prey"; // setting the diet to prey
    }

    public Animal (int legs, int yearsRemaining, String diet, String size){ // setting them equal to the variables
        this.legs = legs;
        this.yearsRemaining = yearsRemaining;
        this.size = size;
        this.diet = diet;
    }

    public int getLegs() {
        return legs;
    } // creating an accessor method for legs
    public int getYearsRemaining(){
        return yearsRemaining;
    } // creating an accessor method for years remaining
    public String getSize() {
        return size;
    } // creating an accessor method for size
    public String getDiet() {return diet;} // creating an accessor method for diet

    public void setLegs(int legs){
        this.legs = legs;
    } // creating a mutator constructor for legs
    public void setYearsRemaining(int yearsRemaining){this.yearsRemaining = yearsRemaining;} // creating a mutator constructor for years renmaining
    public void setSize(String size){
        this.size = size;
    } // creating a mutator constructor for size
    public void setDiet(String diet) {this.diet = diet;} // creating a mutator constructor diet

    public void speak() {
        System.out.println("hello");
    } //
    public void food() {System.out.println("meat");}
    public void speciesSize() {System.out.println("medium");}
}