package information;
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInterface {
    String secretIdentity;
    String trueIdentity;
    String superpower;
    int yearCreated = 0;
    String humanOrNot;
    boolean isHuman = false;
    int strength = 0;
    boolean isRunning = true;
    Controller controller = new Controller();
    Scanner input = new Scanner(System.in);

    public void startProgram(){
        controller.addSuperhero("Superman", "Klark Kent", "Flying",
                1940, false, 400);
        controller.addSuperhero("Batman", "Bruce Wayne", "Money",
                1945, true, 200);
        int option = 0;
        do {
            welcome();
            try {
                option = input.nextInt();
            }catch(InputMismatchException ime){
                System.out.println("Must use an integer!");

            }
            input.nextLine(); //To avoid scanner bug
            switch (option) {
                case 1 -> createSuperhero();
                case 2 -> recieveSuperheroes();
                case 3 -> findSuperhero();
                case 4 -> updateSuperhero();
                case 5 -> deleteSuperhero();
                case 6 -> createNewFile();
                case 7 -> loadSuperheroFile();
                case 9 -> exitProgram();
                default -> System.out.println("Ugyldigt valg. Prøv igen.");
            }

        }while (isRunning);
    }

    private void welcome(){
        System.out.println("""
                    Welcome to the hero universe!!
                    
                    1. Create superhero
                    2. Show superhero
                    3. Find superhero
                    4. Update superhero\s
                    5. Delete superhero
                    6. Create a new file
                    7. load file
                    9. Close the program
                    """);
    }
    private void createSuperhero(){
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

        System.out.print("Are you a human? Y/N");
        try {
            humanOrNot = input.nextLine();
            if (humanOrNot.equals("y")){
                isHuman = true;
            } else if (humanOrNot.equals("n")) {
                isHuman = false;
            }
        }catch (InputMismatchException ime){
            System.out.println("Must be a string!");
        }

        System.out.print("What is your strength? ");
        try{
            strength = input.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Must use an integer!");
        }
        input.nextLine(); // Consume the newline character

        System.out.println("Your superhero has been added!");
        controller.addSuperhero(secretIdentity, trueIdentity, superpower, yearCreated, isHuman, strength);


    }

    private void recieveSuperheroes(){
        System.out.println(controller.recieveSuperheroes());
        input.nextLine();
        System.out.println("show superheroFile");
    }
    private void findSuperhero(){
        String find;
        System.out.print("Type in the superhero you're searching for: ");
        find = input.nextLine();
        controller.searchSuperhero(find);
        input.nextLine();
    }
    private void updateSuperhero(){
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
    }
    private void deleteSuperhero(){
        System.out.println("Please enter the name: ");
        secretIdentity = input.nextLine();
        controller.removeSuperhero(secretIdentity);
        System.out.println("Superhero has been removed");
    }
    private void createNewFile(){
        if (!controller.fileCreator()){
            System.out.println("File already exists!");
        }
        else {
            System.out.println("File has been created!");
        }
    }

    public void loadSuperheroFile(){
        controller.loadSuperheroFile();
    }

    private void exitProgram(){

        isRunning = false;
        controller.saveData();
    }




}