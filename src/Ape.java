public class Ape extends Animal{
    private String aggressiveness;

    public Ape(){
        super();
    }

    public Ape(int legs, int yearsRemaining, String size, String diet, String aggressiveness){
        super(legs, yearsRemaining, size, diet);
        this.aggressiveness = aggressiveness;
    }

    public String getAggressiveness(){
        return aggressiveness;
    }

    public void setAggressiveness(String aggressiveness){
        this.aggressiveness = aggressiveness;
    }

    public void speak(){
        System.out.println("oo oo ah ah!!!");
    }

}
