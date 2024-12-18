public class City {
    String name;
    double[] location;
    int urbanizationLevel;
    boolean ruler; //true for player, false for hexcorp


    public City() {
        this.name = "New City";
        this.location = new double[]{0, 0};
        this.urbanizationLevel = 3;
        this.ruler = false;
    }

    public City(String name, double[] location, int urbanizationLevel, boolean ruler) {
        this.name = name;
        this.location = location;
        this.urbanizationLevel = urbanizationLevel;
        this.ruler = ruler;
    }

    public String toString() {
        String __ =  "Name: " + name + "\nLocation: [" + location[0] + ", " + location[1] + "]" + "\nUrbanization Level: " + urbanizationLevel;
        if (ruler){
            __ += "\nRuler: Player";
        }
        else {
            __ += "\nRuler: Hexcorp";
        }

        return __;
    }



}
