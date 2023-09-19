package information;

import java.util.ArrayList;
import java.util.Scanner;

public class Controller {
    private Database db;

    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    public Controller(){
        db = new Database();
    }
    //Add superhero method - Crud
    public void addSuperhero(String secretIdentity, String trueIdentity, String superpower,
                             int yearCreated, String isHuman, int strength){
        db.addSuperhero(secretIdentity, trueIdentity, superpower, yearCreated, isHuman, strength);
    }

    //Recieve ALL superheroes cRud 1
    public ArrayList<Superhero> recieveSuperheroes(){
        return db.recieveSuperheroes();
    }

    //Recieve a certain superhero cRud 2
    public Superhero searchSuperhero(String name){
        return db.searchSuperhero(name);
    }

    public void editSuperhero(String secretIdentity, String newSecretIdentity, String newTrueIdentity, int newStrength){
        db.editSuperhero(secretIdentity, newSecretIdentity, newTrueIdentity, newStrength);
    }

    public void removeSuperhero(String secretIdentity){
        db.removeSuperhero(secretIdentity);
    }
}