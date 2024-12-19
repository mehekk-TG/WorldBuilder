import java.util.LinkedList;
import java.util.Scanner;

public class Country {
    String name;
    LinkedList<City> cities = new LinkedList<City>();
    LinkedList<Terrain> terrains = new LinkedList<Terrain>();


    Scanner scanner = new Scanner(System.in);

    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String __ = "Name: " + name + "\n\nCities:\n\n";

        for (int i = 0; i < cities.toArray().length; i++) {
            __ += cities.get(i).toString() + "\n\n";
        }

        __ += "Name: " + name + "\n\nTerrains:\n\n";

        for (int i = 0; i < terrains.toArray().length; i++) {
            __ += terrains.get(i).toString() + "\n";
        }

        return __;
    }

    public void makeCity() {
        System.out.print("Is this a base?: ");
        String response = scanner.nextLine();

        if (response.equals("yes") || response.equals("Yes")) {
            
        }
    }


}
