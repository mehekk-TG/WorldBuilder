// Forest class that extends Supplying
public class Forest extends Supplying {
    // Constructor for Forest
    public Forest(double[] location, String name) {
        super(location, name, "Forest", 50);  // Call the Supplying constructor, supply rate 50 by default
    }

    public static void main(String[] args) {
        // Create a Forest terrain object
        Forest forest = new Forest(new double[] { 100.0, 200.0 }, "Mystic Forest");

        // Display Forest information
        forest.display();

        // Test the produce supplies function
        forest.testProduce();
        forest.produceRandomSupplies();
    }
}