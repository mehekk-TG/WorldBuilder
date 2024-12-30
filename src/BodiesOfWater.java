import java.util.Random;

// BodiesOfWater class that extends Supplying
public class BodiesOfWater extends Supplying {
    protected int foodSupplied;

    // Constructor for BodiesOfWater
    public BodiesOfWater(double[] location, String name) {
        super(location, name, "Water", 100);  // Call the Supplying constructor, supply rate 100 by default
        this.foodSupplied = 50;  // Assume a default value for foodSupplied (e.g., 50)
    }

    // Override testProduce to include foodSupplied
    @Override
    public void testProduce() {
        super.testProduce();  // Call the base method to print supplies produced
        System.out.println(name + " is also supplying " + foodSupplied + " food per round.");
    }

    // Method to simulate random food supply production (for BodiesOfWater)
    public void produceRandomFood() {
        Random rand = new Random();
        int randomFood = foodSupplied + rand.nextInt(20); // Adding some randomness to food supply
        System.out.println(name + " supplied " + randomFood + " food this round.");
    }

    // Override display to include foodSupplied
    @Override
    public void display() {
        super.display();  // Call Supplying display method
        System.out.println("Food supplied per round: " + foodSupplied);
    }

    public String toString() {
        return super.toString() + "\nFood supplied per round: " + foodSupplied;
    }



    public static void main(String[] args) {
        // Create a BodiesOfWater terrain object
        BodiesOfWater waterBody = new BodiesOfWater(new double[]{150.0, 250.0}, "Misty Lake");

        // Display BodiesOfWater information
        waterBody.display();

        // Test produce supplies and food
        waterBody.testProduce();
        waterBody.produceRandomFood();
    }
}