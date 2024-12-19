public class PlayerBase extends Base{
    int moral;
    int food;
    int supplies;

    public PlayerBase(String name, double[] location, int urbanizationLevel, boolean ruler, int numOfSoldiers,  int defense, int moral, int food, int supplies){
        super(name, location, urbanizationLevel, ruler, numOfSoldiers, defense);
        this.moral = moral;
        this.supplies = supplies;
        this.food = food;
    }

    public PlayerBase() {
        super();
        this.name = "New Player Base";
        this.moral = 150;
        this.supplies = 150;
        this.food = 150;


    }


    public String toString() {
        return super.toString() + "\nAllegiance: Player" + "\nFood: " + food + "\nSupplies: " + supplies + "\nMoral: " +moral;
    }

    public void changeIndex() {
        System.out.print("1. Number of Soldiers\n2. Defense\n3. Food\n4. Supplies\n5. Moral\n\nWhich would you like to change?: ");
        int response = scanner.nextInt();

        if (response == 1) {
            System.out.print("New number of soldiers: ");
            numOfSoldiers = scanner.nextInt();
        }
        else if(response == 2) {
            System.out.print("New defense: ");
            defense = scanner.nextInt();
        }
        else if(response == 3) {
            System.out.print("New food: ");
            food = scanner.nextInt();
        }
        else if(response == 4) {
            System.out.print("New supplies: ");
            supplies = scanner.nextInt();
        }
        else if(response == 5) {
            System.out.print("New moral: ");
            defense = scanner.nextInt();
        }
    }
}
