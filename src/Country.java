import java.util.LinkedList;

public class Country {
    String name;
    LinkedList<City> cities = new LinkedList<City>();
    LinkedList<Terrain> terrains = new LinkedList<Terrain>();

    public Country(String name) {
        this.name = name;

        cities.add(new City());
        cities.add(new Base());
        cities.add(new PlayerBase());
    }

    @Override
    public String toString() {
        String __ = "Name: " + name + "\n\nCities:\n\n";

        for (int i = 0; i < cities.toArray().length; i++) {
            __ += cities.get(i).toString() + "\n\n";
        }

        for (int i = 0; i < terrains.toArray().length; i++) {
            __ += terrains.get(i).toString() + "\n";
        }

        return __;
    }
}
