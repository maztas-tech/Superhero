package information;
import java.util.Scanner;

public class UserInterface {

    public void startProgram(){
        Controller controller = new Controller();

        //Variables
        int userDecision = 0;

        String name;
        String realName;
        String superPower;
        String isHuman;
        int yearCreated;
        int strength;
        //Scanner
        Scanner input = new Scanner(System.in);

        while(userDecision != 9)
        {
            System.out.println("""
                    Velkommen til SUPERHERO UNIVERSET
                
                    1. Opret superhelt
                    2. Vis superhelte
                    3. Find superhelt
                    9. Afslut
                    """);
            userDecision = readInt(input);
            if(userDecision == 1)
            {
                char singleCharacter;
                System.out.println("Do you have a secret identity? Y/N: ");
                singleCharacter = input.nextLine().charAt(0);
                if (singleCharacter == 'Y' || singleCharacter == 'y')
                {
                    System.out.print("Dit identitet: ");
                    name = input.nextLine();
                    System.out.print("Sande identitet: ");
                    realName = input.nextLine();
                    System.out.print("Dine superkræfter: ");
                    superPower = input.nextLine();
                    System.out.print("Er du et menneske? Y/N: ");
                    isHuman = input.nextLine();

                    System.out.print("Årstal du blev født: ");
                    yearCreated = readInt(input);
                    System.out.print("Dine stats: ");
                    strength = readInt(input);
                    controller.addSuperheroWithName(name, realName, superPower, isHuman, yearCreated, strength);
                    System.out.println("Dine stats er blevet tilføjet!");
                }
                else if(singleCharacter == 'N' || singleCharacter == 'n')
                {
                    System.out.print("Sande identitet: ");
                    realName = input.nextLine();
                    System.out.print("Dine superkræfter: ");
                    superPower = input.nextLine();
                    System.out.print("Er du et menneske? Y/N: ");
                    isHuman = input.nextLine();

                    System.out.print("Årstal du blev født: ");
                    yearCreated = readInt(input);
                    System.out.print("Dine stats: ");
                    strength = readInt(input);
                    controller.addSuperheroWithoutName(realName, superPower, isHuman, yearCreated, strength);
                    System.out.println("Dine stats er blevet tilføjet!");
                }
            }
            else if(userDecision == 2)
            {
                System.out.println(controller.receiveSuperheroes());
            }
            else if(userDecision == 3)
            {
                String find;
                System.out.println("Which superhero are you looking for? ");
                find = input.nextLine();
                controller.findSuperhero(find);
            }
            else if(userDecision == 9)
            {
                System.out.println("No options have been picked \n" +
                        "Exiting the system!");
                System.exit(0);
            }
        }
    }

    public static void addSuperhero(){
        System.out.println("Add superhero");
    }

    public static void showSuperheroes(){
        System.out.println("Show superheroes");
    }
    public static void searchSuperhero(){
        System.out.println("Search for superhero");
    }

    public static int readInt(Scanner input) {
        boolean validInput = false;
        int valueToReturn = 0;

        while(!validInput) {
            String userInput = input.nextLine();
            try {
                valueToReturn = Integer.parseInt(userInput);
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid int value");
            }
        }
        return valueToReturn;
    }
}
