public class PlayerBase extends Base{
    int moral;
    int food;
    int supplies;

    //custom
    public PlayerBase(String name, double[] location, int urbanizationLevel, int numOfSoldiers,  int defense, int moral, int food, int supplies){
        super(name, location, urbanizationLevel, true, numOfSoldiers, defense);
        this.moral = moral;
        this.supplies = supplies;
        this.food = food;
    }

    //default
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


    //overrides changeIndex in Base
    public void changeIndex() {
        //ask
        System.out.print("1. Number of Soldiers\n2. Defense\n3. Food\n4. Supplies\n5. Moral\n\nWhich would you like to change?: ");
        int response = scanner.nextInt();

        //soldiers
        if (response == 1) {
            System.out.print("New number of soldiers: ");
            numOfSoldiers = scanner.nextInt();
        }
        //defense
        else if(response == 2) {
            System.out.print("New defense: ");
            defense = scanner.nextInt();
        }
        //food
        else if(response == 3) {
            System.out.print("New food: ");
            food = scanner.nextInt();
        }
        //supplies
        else if(response == 4) {
            System.out.print("New supplies: ");
            supplies = scanner.nextInt();
        }
        //moral
        else if(response == 5) {
            System.out.print("New moral: ");
            defense = scanner.nextInt();
        }
    }


    public static void main(String args[]) {
        //make
        PlayerBase playerBase = new PlayerBase("Some Player Base", new double[] {21.0, 23.0}, 1, 21431, 234, 432, 34,432);
        PlayerBase bland = new PlayerBase();

        //info
        System.out.println(playerBase);
        System.out.println(bland);

        //change on run
        playerBase.changeIndex();

        //info
        System.out.println(playerBase);
    }
}
