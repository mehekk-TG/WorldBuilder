import java.util.Random;

public class Terrain {
    protected double[] location;
    protected String name;
    protected String type;

    // Constructor to initialize terrain
    public Terrain(double[] location, String name, String type) {
        this.location = location;
        this.name = name;
        this.type = type;
    }

    // Static method to create a random Terrain
    public static Terrain makeRandom() {
        Random rand = new Random();

        // Random location with two coordinates between -1000 and 1000
        double[] randomLocation = { rand.nextDouble() * 2000 - 1000, rand.nextDouble() * 2000 - 1000 };

        // Random name from a predefined list
        String[] names = { "Dana", "Hen", "Swamplandia", "Permia", "Kronyland"};
        String randomName = names[rand.nextInt(names.length)];

        // Random type from a predefined list
        String[] types = { "Forest", "Mountain", "Water"};
        String randomType = types[rand.nextInt(types.length)];

        // Return a new Terrain object with random values
        return new Terrain(randomLocation, randomName, randomType);
    }

    // Display method for easy visualization
    public void display() {
        System.out.println("Terrain: " + name);
        System.out.println("Location: [" + location[0] + ", " + location[1] + "]");
        System.out.println("Type: " + type);
    }

    public static void main(String[] args) {
        // Create a specific Terrain object
        Terrain terrain1 = new Terrain(new double[] { 81.0, 89.0 }, "hi", "Forest");
        terrain1.display();

        // Create a random Terrain object
        Terrain randomTerrain = Terrain.makeRandom();
        randomTerrain.display();
    }


    public String toString() {
        return "Terrain: " + name + "\nLocation: [" + location[0] + ", " + location[1] + "]" + "\nType: " + type;
    }
}