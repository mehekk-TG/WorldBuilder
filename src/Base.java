import java.util.Scanner;


public class Base extends City {
    int numOfSoldiers;
    int defense;

    Scanner scanner = new Scanner(System.in);

    //custom
    public Base(String name, double[] location, int urbanizationLevel, boolean ruler, int numOfSoldiers,  int defense) {
        super(name, location, urbanizationLevel, ruler);
        this.numOfSoldiers = numOfSoldiers;
        this.defense = defense;
    }

    //default
    public Base(){
        this.name = "New Base";
        this.location = new double[]{0.0, 0.0};
        this.urbanizationLevel = 3;
        this.ruler = true;
        this.numOfSoldiers = 0;
        this.defense = 0;
    }




    @Override
    public String toString() { //get info
        return super.toString() + "\n\nType: Base\n" + "Number of soldiers: " + numOfSoldiers + "\nDefense: " + defense;
    }


    //change numofsodliers or defense index
    public void changeIndex() {
        System.out.print("1. Number of Soldiers\n2. Defense\n\nWhich would you like to change?: "); // ask
        int response = scanner.nextInt();

        if (response == 1) { //soldier change
            System.out.print("New number of soldiers: ");
            numOfSoldiers = scanner.nextInt();
        }
        else if(response == 2) { //defense change
            System.out.print("New defense: ");
            defense = scanner.nextInt();
        }
    }


    public static void main(String[] args) {
        //make
        Base base = new Base("Blah Base", new double[] {21.0, 21.0}, 2, false, 2132, 32);
        Base base1= new Base();

        System.out.println(base);//info
        System.out.println(base1);

        base.changeIndex();//index change on run

        System.out.println(base); //display change
    }

}
