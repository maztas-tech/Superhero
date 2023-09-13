package information;
import java.util.ArrayList;

public class Database
{
    //Fields
    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    //Methods
    //First method with superhero name.
    public void addSuperheroWithName(String name, String realName, String superPower, String isHuman,
                                     int yearCreated, int strength)
    {
        superheroes.add(new Superhero(name, realName, superPower, isHuman, yearCreated, strength));
    }

    //Second method without superhero name.
    public void addSuperheroWithoutName(String realName, String superPower, String isHuman,
                                        int yearCreated, int strength)
    {
        superheroes.add(new Superhero(realName, superPower, isHuman, yearCreated, strength));
    }

    public ArrayList<Superhero> recieveSuperheroes()
    {
        return superheroes;
    }

    public Superhero searchSuperhero(String name)
    {
        //Find a hero if their name matches search criteria
        for (Superhero superhero: superheroes)
        {
            if(superhero.getRealName().contains(name) || superhero.getName().contains(name))
            {
                System.out.println(superhero);
            }
        } return null;

    }
}
