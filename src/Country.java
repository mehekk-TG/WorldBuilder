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
        System.out.println("Name: ");
        String name = scanner.nextLine();

        System.out.println("Ruler: ");
        boolean ruler;



        System.out.print("Is this a base?: ");
        String response = scanner.nextLine();

        if (response.equals("yes") || response.equals("Yes")) {
            System.out.print("Is this a player base?: ");
            response = scanner.nextLine();
            if (response.equals("yes") || response.equals("Yes")) {

                int soldiers = getInfo("Num of soldiers: ");
                int defense = getInfo("Defense Index: ");
                int food = getInfo("Food: ");
                int supplies = getInfo("Supplies: ");
                int moral = getInfo("Moral: ");

                cities.add(new PlayerBase(soldiers, defense, food, supplies, moral));
            }
        }
    }


    public int getInfo(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextInt();
    }



    public static void main(String[] args) {
        Country country = new Country("Country");
        System.out.println(country.toString());
    }



}

