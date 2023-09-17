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


        int option = 0;
        do {
            System.out.println("""
                    Welcome to the hero universe!!
                    
                    1. Create superhero
                    2. Show superhero
                    3. Find superhero
                    4. Update superhero 
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
                    String name;
                    System.out.println("Please enter the name of the superhero in the database in order to change it! ");
                    name = input.nextLine();
                    controller.editSuperhero(name, input);
                    break;

                default:
                    System.out.println("Ugyldigt valg. Prøv igen.");
            }

        }while (option != 9);

    }
}
