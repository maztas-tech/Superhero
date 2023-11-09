package information;
import comparator.*;

import java.util.*;

public class UserInterface {
    String secretIdentity;
    String trueIdentity;
    String superpower;
    int yearCreated = 0;
    String humanOrNot;
    boolean isHuman;
    int strength = 0;
    boolean isRunning = true;
    Controller controller = new Controller();
    Scanner input = new Scanner(System.in);

    public void startProgram(){
        loadSuperheroFile();
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
                case 6 -> sortSuperhero();
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
                    6. Show superheroes sorted
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
    private void sortSuperhero(){
        int userSort = 0;

        ArrayList<Superhero> superheroArrayList = controller.getSuperheroCSVList();
        do {
            System.out.println("""
                    Pick a sort method
                    1: Sort by secret identity
                    2: Sort by true identity
                    3: Sort by superpower
                    4: Sort by year created
                    5: Sort by is human or not
                    6: Sort by strength
                    7: Sort by primary and secondary attributes""");
            userSort = input.nextInt();
            switch (userSort){
                case 1:
                    System.out.println("Sorting by secret identities");
                    Collections.sort(superheroArrayList, new SecretIdentityComparator());
                    for (Superhero superhero: superheroArrayList) {
                        System.out.println(superhero);
                    }
                    break;
                case 2:
                    System.out.println("sort by true identities");
                    Collections.sort(superheroArrayList,new TrueIdentityComparator());
                    for (Superhero superhero: superheroArrayList){
                        System.out.println(superhero);
                    }
                    break;
                case 3:
                    System.out.println("Sort by superpower");
                    Collections.sort(superheroArrayList,new SuperpowerComparator());
                    for (Superhero superhero: superheroArrayList){
                        System.out.println(superhero);
                    }
                    break;
                case 4:
                    System.out.println("Sort by year created");
                    Collections.sort(superheroArrayList,new YearCreatedComparator());
                    for (Superhero superhero: superheroArrayList){
                        System.out.println(superhero);
                    }
                    break;
                case 5:
                    System.out.println("sort by isHuman");
                    Collections.sort(superheroArrayList,new IsHumanComparator());
                    for (Superhero superhero: superheroArrayList){
                        System.out.println(superhero);
                    }
                    break;
                case 6:
                    System.out.println("sort by strength");
                    Collections.sort(superheroArrayList,new StrengthComparator());
                    for (Superhero superhero:superheroArrayList){
                        System.out.println(superhero);
                    }
                    break;
                case 7:
                    String primaryComparatorName;
                    String secondaryComparatorName;
                    System.out.println("Whats your primary comparator?");
                    Comparator comparator = null;
                    Comparator comparator2 = null;
                    input.nextLine();
                    primaryComparatorName = input.nextLine();
                    if (primaryComparatorName.equals("strength")){
                        comparator = new StrengthComparator();
                    } else if (primaryComparatorName.equals("year created")){
                        comparator = new YearCreatedComparator();
                    } else if (primaryComparatorName.equals("secret identity")) {
                        comparator = new SecretIdentityComparator();
                    } else if (primaryComparatorName.equals("true identity")) {
                        comparator = new TrueIdentityComparator();
                    } else if (primaryComparatorName.equals("is human")) {
                        comparator = new IsHumanComparator();
                    } else if (primaryComparatorName.equals("super power")) {
                        comparator = new SuperpowerComparator();
                    }
                    input.nextLine();
                    System.out.println("Whats your secondary comparator?");
                    secondaryComparatorName = input.nextLine();

                    if (secondaryComparatorName.equals("strength")){
                        comparator2 = new StrengthComparator();
                    } else if (secondaryComparatorName.equals("year created")){
                        comparator2 = new YearCreatedComparator();
                    } else if (secondaryComparatorName.equals("secret identity")) {
                        comparator2 = new SecretIdentityComparator();
                    } else if (secondaryComparatorName.equals("true identity")) {
                        comparator2 = new TrueIdentityComparator();
                    } else if (secondaryComparatorName.equals("is human")) {
                        comparator2 = new IsHumanComparator();
                    } else if (secondaryComparatorName.equals("super power")) {
                        comparator2 = new SuperpowerComparator();
                    }
                    //input.nextLine();


                    Collections.sort(superheroArrayList, comparator.thenComparing(comparator2));
                    for (Superhero superhero:superheroArrayList){
                        System.out.println(superhero);
                    }

            }
        }while (userSort != 9);
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