import java.util.LinkedList;
import java.util.Scanner;

public class Country {

    //country info variables
    String name;
    LinkedList<City> cities = new LinkedList<City>();
    LinkedList<Terrain> terrains = new LinkedList<Terrain>();


    Scanner scanner = new Scanner(System.in);

    //Country constructor
    public Country(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        String __ = "Name: " + name + "\n\nCities:\n\n"; //add country name and header "Cities: "

        for (int i = 0; i < cities.toArray().length; i++) { //add all cities and their info
            __ += cities.get(i).toString() + "\n\n";
        }

        __ += "\n\nTerrains:\n\n"; // do same for terrains

        for (int i = 0; i < terrains.toArray().length; i++) {
            __ += terrains.get(i).toString() + "\n\n";
        }

        return __;
    }

    public void makeCity() {
        String __ = getStringInfo("Wanna make a default city?");
        if (__.equals("yes") || __.equals("Yes")) { //make a default city
            cities.add(new City());
        }
        else { //custom city
            String name = getStringInfo("Name"); //name

            System.out.print("First coordinate of location: "); //ask for location
            double firstCoord = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Second coordinate of location: ");
            double secondCoord = scanner.nextDouble();
            scanner.nextLine();
            double[] coords = {firstCoord, secondCoord};


            boolean ruler; //ruler (Hexcorp or Player)
            String ans = getStringInfo("Ruler (Hexcorp or Player)");
            if (ans.equals("Hexcorp")) {ruler = false;} else {ruler = true;}

            int urbanLevel = getInfo("Urbanization Level (int)"); //urbanization level

            String response = getStringInfo("Is this a base?"); //decide if making a Base class
            if (response.equals("yes") || response.equals("Yes")) { //make Base
                int soldiers = getInfo("Num of soldiers: "); //base-specific info
                int defense = getInfo("Defense Index: ");

                System.out.print("Is this a player base?: "); //player base class
                response = scanner.nextLine();

                if (response.equals("yes") || response.equals("Yes")) { //delve deeper into player base
                    int food = getInfo("Food: "); //playerbase-specific stats
                    int supplies = getInfo("Supplies: ");
                    int moral = getInfo("Moral: ");

                    cities.add(new PlayerBase(name, coords, urbanLevel, soldiers, defense, food, supplies, moral)); //add to list of cites
                } else { //hexcorp base (is just a plain base)
                    cities.add(new Base(name, coords, urbanLevel, ruler, soldiers, defense));
                }
            }
            else {  //just making a city
                cities.add(new City(name, coords, urbanLevel, ruler));
            }
        }
    }


    public void makeTerrain() {
        System.out.println("Make a random terrain?: "); //make rand terrain?
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.print(">");

        if (scanner.nextInt() == 1){ // yes rand
            terrains.add(Terrain.makeRandom());
        }
        else { //no rand
            scanner.nextLine();
            System.out.println("Ugh, fine");

            String name = getStringInfo("Name");//ask for name

            System.out.print("First coordinate of location: "); //ask for location
            double firstCoord = scanner.nextDouble();
            scanner.nextLine();
            System.out.print("Second coordinate of location: ");
            double secondCoord = scanner.nextDouble();
            scanner.nextLine();
            double[] coords = {firstCoord, secondCoord};

            String type = getStringInfo("Type [Forest, Mountain, Water, Whatever else]: ");//ask for terrain type

            if (type.equals("Forest")) { // set to Forest Class
                Forest forest = new Forest(coords, name);
                terrains.add(forest);
                forest.testProduce(); //just to use
            }
            else if (type.equals("Mountain")) { // set to Impediment (bc only type of Impediment is mountain)
                String size = getStringInfo("How Chonky?: ");
                int clear_num = getInfo("How many resources to clear?: ");
                terrains.add(new Impediments(coords, name, size, clear_num));
            }
            else if (type.equals("Water")) { // set to BodiesOfWater
                BodiesOfWater water = new BodiesOfWater(coords, name);
                terrains.add(water);
                water.testProduce(); //just to use
            }
            else { // none of specific...
                System.out.println("Is it supplying?: "); // Supplying class?
                System.out.println("1. Yes");
                System.out.println("2. No");
                System.out.print(">");

                if (scanner.nextInt() == 1) { //yes
                    scanner.nextLine();
                    int amt_per_round = getInfo("Amount Produced per Round");//specific stat

                    Supplying supplying= new Supplying(coords, name, type, amt_per_round); //make
                    supplying.produceRandomSupplies(); //just to use
                }
                else { //no
                    scanner.nextLine();
                    terrains.add(new Terrain(coords, name, type)); //add bland terrain
                }
            }



        }
    }


    public int getInfo(String prompt) {
        System.out.print(prompt + ": "); //ask
        int ans = scanner.nextInt(); //get int
        scanner.nextLine(); //get rid of \n
        return ans;
    }

    public String getStringInfo(String prompt) {
        System.out.print(prompt + ": "); //ask
        return scanner.nextLine();
    }



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Welcome to the GAME WORLD BUILDER THINGY\n");

        System.out.print("What is the name of your country?: "); //make country
        String name = scanner.nextLine();
        Country country= new Country(name);


        while (true) {
            System.out.println("What to do?: "); //menu
            System.out.println("1. Make a city");
            System.out.println("2. Make a terrain");
            System.out.println("3. Look at info");
            System.out.println("4. Leave");
            System.out.print(">");

            int response = scanner.nextInt(); //get choice

            if (response==1) {//make city
                country.makeCity();
            }
            else if (response == 2) { //make terrain
                country.makeTerrain();
            }
            else if ((response == 3)){ //get country info
                System.out.println(country);
            }
            else {
                System.exit(0); //leave
            }

        }
    }



}

