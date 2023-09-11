import information.Database;
import information.Superhero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database superhero = new Database();
        char proceed;
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Velkommen til SUPERHERO UNIVERSET");
        System.out.print("Opret superhelt Y/N: ");
        proceed = keyboard.nextLine().charAt(0);

        if (proceed == 'Y' || proceed == 'y') {
            String name = "";
            String realName = "";
            String superPower = "";
            int yearCreated = 0;
            int strength = 0;
            System.out.print("Har du et identitet? Y/N: ");
            proceed = keyboard.nextLine().charAt(0);
            if (proceed == 'Y' || proceed == 'y') {
                System.out.print("Dit identitet: ");
                name = keyboard.nextLine();
                System.out.print("Sande identitet: ");
                realName = keyboard.nextLine();
                System.out.print("Dine superkræfter: ");
                superPower = keyboard.nextLine();

                System.out.print("Årstal du blev født: ");
                yearCreated = keyboard.nextInt();
                System.out.print("Dine stats: ");
                strength = keyboard.nextInt();

                superhero.addSuperheroWithName(name, realName, superPower,
                        yearCreated, strength);

                System.out.println(superhero.toString());
            } else if (proceed == 'N' || proceed == 'n') {
                System.out.print("Sande identitet: ");
                realName = keyboard.nextLine();
                System.out.print("Dine superkræfter: ");
                superPower = keyboard.nextLine();

                System.out.print("Årstal du blev født: ");
                yearCreated = keyboard.nextInt();
                System.out.print("Dine stats: ");
                strength = keyboard.nextInt();

                superhero.addSuperheroWithoutName(realName, superPower,
                        yearCreated, strength);

                System.out.println(superhero.toString());
            }

        }
    }
}
