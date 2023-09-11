package information;

import java.util.Arrays;

public class Database {
    //Fields
    private Superhero[] superheroes;
    int count = 0;

    //Constructor
    public Database(){
        this.superheroes = new Superhero[6];
    }
    //First method - with superhero name.
    public void addSuperheroWithName(String name, String realName, String superPower,
                        int yearCreated, int strength){
        superheroes[count++] = new Superhero(name, realName, superPower, yearCreated, strength);
    }

    //Second method without superhero name.
    public void addSuperheroWithoutName(String realName, String superPower,
                                        int yearCreated, int strength){
        superheroes[count++] = new Superhero(realName, superPower, yearCreated, strength);
    }

    @Override
    public String toString() {
        return "Database{" +
                "superheroes=" + Arrays.toString(superheroes) +
                ", count=" + count +
                '}';
    }
}
