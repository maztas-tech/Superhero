package information;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    String secretIdentity;
    String trueIdentity;
    String superpower;
    int yearCreated;
    String isHuman;
    int strength;
    public void startProgram(){
        Controller controller = new Controller();
        Scanner input = new Scanner(System.in);

        controller.addSuperhero("Superman", "Klark Kent", "Flying",
                1940, "No", 400);
        controller.addSuperhero("Batman", "Bruce Wayne", "Money",
                1945, "Yes", 200);



        int option = 0;
        do {
            System.out.println("""
                    Welcome to the hero universe!!
                    
                    1. Create superhero
                    2. Show superhero
                    3. Find superhero
                    4. Update superhero 
                    5. Delete superhero
                    9. Close the program
                    """);
            try {
                option = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Must use an integer!");

            }
            input.nextLine(); //To avoid scanner bug
            switch (option) {
                case 1:
                    System.out.print("Secret identity: ");
                    secretIdentity = input.nextLine();

                    System.out.print("Real name: ");
                    trueIdentity = input.nextLine();

                    System.out.print("Superpower: ");
                    superpower = input.nextLine();

                    System.out.print("When were you born? ");
                    try{
                        yearCreated = input.nextInt();
                    }catch(InputMismatchException ime){
                        System.out.println("Must use an integer!");
                    }
                    input.nextLine(); // Consume the newline character

                    System.out.print("Are you a human? ");
                    isHuman = input.nextLine();

                    System.out.print("What is your strength? ");
                    try{
                        strength = input.nextInt();
                    }catch(InputMismatchException ime){
                        System.out.println("Must use an integer!");
                    }
                    input.nextLine(); // Consume the newline character

                    System.out.println("Your superhero has been added!");
                    controller.addSuperhero(secretIdentity, trueIdentity, superpower, yearCreated, isHuman, strength);
                    break;

                case 2:
                    System.out.println(controller.recieveSuperheroes());
                    input.nextLine();
                    break;

                case 3:
                    String find;
                    System.out.print("Type in the superhero you're searching for: ");
                    find = input.nextLine();
                    controller.searchSuperhero(find);
                    input.nextLine();
                    break;

                case 4:
                    System.out.println("Please enter the name of the superhero in the database in order to change it! ");
                    secretIdentity = input.nextLine();
                    System.out.print("Please type in the new secret identity: ");
                    String newSecretIdentity;
                    newSecretIdentity = input.nextLine();
                    System.out.println("New secret identity has been implemented!");

                    System.out.print("Please type in the new real identity: ");
                    String newTrueIdentity;
                    newTrueIdentity = input.nextLine();
                    System.out.println("New true identity has been implemented!");

                    System.out.print("Please type in the new strength value: ");
                    int newStrength;
                    newStrength = input.nextInt();
                    System.out.println("New strength has been implemented!");

                    controller.editSuperhero(secretIdentity, newSecretIdentity, newTrueIdentity, newStrength);
                    break;

                case 5:
                    System.out.println("Please enter the name: ");
                    secretIdentity = input.nextLine();
                    controller.removeSuperhero(secretIdentity);
                    System.out.println("Superhero has been removed");
                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }

        }while (option != 9);

    }
}