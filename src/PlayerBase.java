public class PlayerBase extends Base{
    int moral;
    int food;
    int supplies;

    public PlayerBase(String name, double[] location, int urbanizationLevel, boolean ruler, int numOfSoldiers,  int defense, int moral, int food, int supplies){
        super(name, location, urbanizationLevel, ruler, numOfSoldiers, defense);
        this.moral = moral;
        this.supplies = supplies;
        this.food = food;
    }

    public PlayerBase() {
        super();
        this.name = "New Player Base";
        this.moral = 150;
        this.supplies = 150;
        this.food = 150;


    }


    public String toString() {
        return super.toString() + "\nAllegiance: Player" + "\nFood: " + food + "\nSupplies: " + supplies + "\nMoral: " +moral;
    }
}
