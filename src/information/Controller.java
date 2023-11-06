package information;
import datasource.FileHandler;

import java.io.File;
import java.util.ArrayList;


public class Controller {
    private Database db;

    public Controller(){
        db = new Database();
    }
    //Add superhero method - Crud
    public void addSuperhero(String secretIdentity, String trueIdentity, String superpower,
                             int yearCreated, boolean isHuman, int strength){
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

    public boolean fileCreator(){
        return db.fileCreator();
    }

    public boolean saveData(){
        return db.saveData();
    }

    public void loadSuperheroFile(){
        db.loadSuperheroFile();
    }

}