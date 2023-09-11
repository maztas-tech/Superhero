import information.Database;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database superhero = new Database();
        char proceed;
        int valg;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.println("1. Opret superhelt ");
        System.out.println("9. Afslut ");
        valg = readInt(keyboard);
        for (int i = 0; i <= 6; i++) {
            if (valg == 1) {
                String name;
                String realName;
                String superPower;
                int yearCreated;
                int strength;
                String isHuman;
                System.out.print("Har du et identitet? Y/N: ");
                proceed = keyboard.nextLine().charAt(0);
                if (proceed == 'Y' || proceed == 'y') {
                    System.out.print("Dit identitet: ");
                    name = keyboard.nextLine();
                    System.out.print("Sande identitet: ");
                    realName = keyboard.nextLine();
                    System.out.print("Dine superkræfter: ");
                    superPower = keyboard.nextLine();
                    System.out.print("Er du et menneske? Y/N: ");
                    isHuman = keyboard.nextLine();

                    System.out.print("Årstal du blev født: ");
                    yearCreated = readInt(keyboard);
                    System.out.print("Dine stats: ");
                    strength = readInt(keyboard);

                    superhero.addSuperheroWithName(name, realName, superPower,
                            isHuman, yearCreated,  strength);

                    System.out.println(superhero);
                } else if (proceed == 'N' || proceed == 'n') {
                    System.out.print("Sande identitet: ");
                    realName = keyboard.nextLine();
                    System.out.print("Dine superkræfter: ");
                    superPower = keyboard.nextLine();
                    System.out.println("Er du et menneske: ");
                    isHuman = keyboard.nextLine();

                    System.out.print("Årstal du blev født: ");
                    yearCreated = readInt(keyboard);
                    System.out.print("Dine stats: ");
                    strength = readInt(keyboard);

                    superhero.addSuperheroWithoutName(realName, superPower,
                            isHuman, yearCreated,  strength);

                    System.out.println(superhero);
                }

            } else if (valg == 9){
                System.out.println("No options have been picked");
                System.exit(0);
            }

        }


    }
    // Avoids scanner bugs for boolean and ints.
    public static int readInt(Scanner keyboard) {
        boolean validInput = false;
        int valueToReturn = 0;

        while(!validInput) {
            String input = keyboard.nextLine();
            try {
                 valueToReturn = Integer.parseInt(input);
                 validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid int value");
            }
        }
        return valueToReturn;
    }
}
