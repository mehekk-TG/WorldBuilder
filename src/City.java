public class City {
    String name;
    double[] location;
    int urbanizationLevel;
    boolean ruler; //true for player, false for hexcorp


    public City() {  //default constructor
        this.name = "New City";
        this.location = new double[]{0, 0};
        this.urbanizationLevel = 3;
        this.ruler = false;
    }

    public City(String name, double[] location, int urbanizationLevel, boolean ruler) { // custom constructor
        this.name = name;
        this.location = location;
        this.urbanizationLevel = urbanizationLevel;
        this.ruler = ruler;
    }

    public String toString() { //get info
        String __ = "Name: " + name + "\nLocation: [" + location[0] + ", " + location[1] + "]" + "\nUrbanization Level: " + urbanizationLevel;
        if (ruler) {
            __ += "\nRuler: Player";
        } else {
            __ += "\nRuler: Hexcorp";
        }

        return __;
    }


    public static void main(String[] args) {
        //make
        City city = new City("Blah City", new double[] {765.9, 8765.0}, 98, true);
        City meh = new City();

        //info
        System.out.println(city);
        System.out.println(meh);

    }

}
