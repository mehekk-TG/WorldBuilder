import java.util.Scanner;


public class Base extends City {
    int numOfSoldiers;
    int defense;

    Scanner scanner = new Scanner(System.in);

    public Base(String name, double[] location, int urbanizationLevel, boolean ruler, int numOfSoldiers,  int defense) {
        super(name, location, urbanizationLevel, ruler);
        this.numOfSoldiers = numOfSoldiers;
        this.defense = defense;
    }


    public Base(){
        this.name = "New Base";
        this.location = new double[]{0.0, 0.0};
        this.urbanizationLevel = 3;
        this.ruler = true;
        this.numOfSoldiers = 0;
        this.defense = 0;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\nType: Base\n" + "Number of soldiers: " + numOfSoldiers + "\nDefense: " + defense;
    }

    public void changeIndex() {
        System.out.print("1. Number of Soldiers\n2. Defense\n\nWhich would you like to change?: ");
        int response = scanner.nextInt();

        if (response == 1) {
            System.out.print("New number of soldiers: ");
            numOfSoldiers = scanner.nextInt();
        }
        else if(response == 2) {
            System.out.print("New defense: ");
            defense = scanner.nextInt();
        }
    }

}
