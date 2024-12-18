public class Base extends City {
    int numOfSoldiers;
    int defense;


    public Base(String name, double[] location, int urbanizationLevel, boolean ruler, int numOfSoldiers,  int defense) {
        super(name, location, urbanizationLevel, ruler);
        this.numOfSoldiers = numOfSoldiers;
        this.defense = defense;
    }


    public Base(){
        this.name = "New Base";
        this.location = new double[]{0.0, 0.0};
        this.urbanizationLevel = 3;
        this.ruler = true;
        this.numOfSoldiers = 0;
        this.defense = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nType: Base\n" + "Number of soldiers: " + numOfSoldiers + "\nDefense: " + defense;
    }
}
