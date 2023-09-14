import information.Controller;
import information.Database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Objects
        Database db = new Database();
        Controller controller = new Controller(db);

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

       /* for (int i = 0; i <= 6; i++) {
            if (valg == 1) {
                String name;
                String realName;
                String superPower;
                int yearCreated;
                int strength;
                String isHuman;
                System.out.print("Har du et identitet? Y/N: ");
                proceed = input.nextLine().charAt(0);
                if (proceed == 'Y' || proceed == 'y') {
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

                    superhero.addSuperheroWithName(name, realName, superPower,
                            isHuman, yearCreated, strength);

                    System.out.println(superhero);
                } else if (proceed == 'N' || proceed == 'n') {
                    System.out.print("Sande identitet: ");
                    realName = input.nextLine();
                    System.out.print("Dine superkræfter: ");
                    superPower = input.nextLine();
                    System.out.println("Er du et menneske: ");
                    isHuman = input.nextLine();

                    System.out.print("Årstal du blev født: ");
                    yearCreated = readInt(input);
                    System.out.print("Dine stats: ");
                    strength = readInt(input);

                    superhero.addSuperheroWithoutName(realName, superPower,
                            isHuman, yearCreated,  strength);

                    System.out.println(superhero);
                }

            } else if (valg == 9){
                System.out.println("No options have been picked");
                System.exit(0);
            }

        }*/


    }

    // Avoids scanner bugs for boolean and ints.
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
