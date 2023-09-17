package information;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    //Add superhero - Crud
    public void addSuperhero(String secretIdentity, String trueIdentity, String superpower,
                             int yearCreated, String isHuman, int strength){
        superheroes.add(new Superhero(secretIdentity, trueIdentity, superpower, yearCreated,
                isHuman, strength));
    }

    //Recieve all superheroes - cRud
    public ArrayList<Superhero> recieveSuperheroes(){
        return superheroes;
    }

    //Recieve a specific superhero - cRud
    public Superhero searchSuperhero(String name){
        //Foreach loop that searches if a superhero matches the search criteria
        for (Superhero superhero: superheroes) {
            if(superhero.getSecretIdentity().contains(name))
            {
                System.out.println(superhero);
            }
        }
        return null;
    }
    //Update values in list - crUd
    public void editSuperhero(){
        Scanner input = new Scanner(System.in);
        System.out.println("Choose a hero you'd to like to edit: ");
        System.out.println(recieveSuperheroes());
        int index = input.nextInt() - 1;
    }
}
