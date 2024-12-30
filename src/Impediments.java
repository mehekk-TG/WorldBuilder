// Impediments class that extends Terrain
public class Impediments extends Terrain {
    protected String size;
    protected int amount_to_clear;

    // Constructor for Impediments
    public Impediments(double[] location, String name, String size, int amount_to_clear) {
        super(location, name, "Mountain");  // Default type "Mountain"
        this.size = size;
        this.amount_to_clear = amount_to_clear;
    }

    // Method to display Impediment information
    public void display() {
        super.display();  // Call Terrain display method
        System.out.println("Size: " + size);
        System.out.println("Amount to clear: " + amount_to_clear);
    }

    // Main method to test the Impediments class
    public static void main(String[] args) {
        // Create an Impediment object (e.g., a large mountain)
        Impediments mountain = new Impediments(new double[] { 400.0, 300.0 }, "Giant Mountain", "Large", 500);

        // Display the impediment details
        mountain.display();
    }

    public String toString() {
        return super.toString() + "\nSize: " + size + "\nAmount to clear: " + amount_to_clear;
    }

}