package information;
import datasource.FileHandler;

import java.io.File;
import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();
    private FileHandler fileHandler = new FileHandler();



    //Add a superhero - Crud
    public void addSuperhero(String secretIdentity, String trueIdentity, String superpower,
                             int yearCreated, boolean isHuman, int strength){
        superheroes.add(new Superhero(secretIdentity, trueIdentity, superpower, yearCreated,
                isHuman, strength));

    }

    //Receive all superheroes - cRud
    public ArrayList<Superhero> recieveSuperheroes(){
        return superheroes;
    }

    //Receive a specific superhero - cRud
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
    public void editSuperhero(String secretIdentity, String newSecretIdentity, String newTrueIdentity, int newStrength){
        for (Superhero superhero: superheroes) {
            if (superhero.getSecretIdentity().contains(secretIdentity)){
                superhero.setSecretIdentity(newSecretIdentity);
                superhero.setTrueIdentity(newTrueIdentity);
                superhero.setStrength(newStrength);
            }
        }
    }
    //Remove superhero - cruD
    public void removeSuperhero(String secretIdentity){
        Superhero found = null;
        for (Superhero superhero: superheroes) {
            if (superhero.getSecretIdentity().contains(secretIdentity)){
                found = superhero;
            }
        }
        if (found != null){
            superheroes.remove(found);
        }
    }

    public boolean fileCreator(){
        return fileHandler.fileCreator();
    }

    public boolean saveData(){
        return fileHandler.saveData(superheroes);
    }

    public ArrayList<Superhero> loadSuperheroFile(){
        return superheroes=fileHandler.loadSuperheroFile();
    }

    public ArrayList getSuperheroArraylist(){
        return fileHandler.getSuperheroArraylist();
    }

}