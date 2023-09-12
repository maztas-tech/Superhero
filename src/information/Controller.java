package information;
import java.util.ArrayList;

public class Controller
{
    private Database db;
    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    public Controller(Database db){
        this.db = db;
    }

    //Add a superhero with a secret identity
    public void addSuperheroWithName(String name, String realName, String superPower, String isHuman,
                                     int yearCreated, int strength){
        db.addSuperheroWithName(name, realName, superPower, isHuman, yearCreated, strength);
    }

    //Add a superhero without secret identity
    public void addSuperheroWithoutName(String realName, String superPower, String isHuman,
                                        int yearCreated, int strength){
        db.addSuperheroWithoutName(realName, superPower, isHuman, yearCreated, strength);
    }

    //Receive all superheroes
    public ArrayList<Superhero> receiveSuperheroes(){
        return db.recieveSuperheroes();
    }

    //Receive a specific superhero
    public Superhero findSuperhero(String name)
    {
        //Find a hero if their name matches search criteria
        for (Superhero superhero: superheroes)
        {
            if(superhero.getName().equals(name))
            {
                return superhero;
            }
        }
        return null;
    }

}
