import java.util.Random;

class Supplying extends Terrain {
    protected int suppliesPerRound;

    // Constructor for Supplying
    public Supplying(double[] location, String name, String type, int suppliesPerRound) {
        super(location, name, type);  // Call Terrain constructor
        this.suppliesPerRound = suppliesPerRound;  // Initialize suppliesPerRound
    }

    // Method to produce supplies per round (simulating production)
    public void testProduce() {
        System.out.println(name + " is producing " + suppliesPerRound + " supplies per round.");
    }

    // Method to simulate random supplies production based on some random factor
    public void produceRandomSupplies() {
        Random rand = new Random();
        int randomSupply = suppliesPerRound + rand.nextInt(10); // Adding some randomness
        System.out.println(name + " produced " + randomSupply + " supplies this round.");
    }

    // Override display to include suppliesPerRound
    @Override
    public void display() {
        super.display();  // Call Terrain display method
        System.out.println("Supplies per round: " + suppliesPerRound);
    }

    public static void main(String[] args) {
        // Create a Supplying terrain
        Supplying supplyingTerrain = new Supplying(new double[] { 500.0, 300.0 }, "Supply Base", "Depot", 50);
        supplyingTerrain.display();   // Display terrain and supplies information
        supplyingTerrain.testProduce(); // Test producing supplies
        supplyingTerrain.produceRandomSupplies(); // Produce random supplies
    }
}