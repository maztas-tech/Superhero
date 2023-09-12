package information;

public class Controller
{
    private Database db;

    public Controller(Database db){
        this.db = db;
    }

    public void addSuperheroWithName(String name, String realName, String superPower, String isHuman,
                                     int yearCreated, int strength){
        db.addSuperheroWithName(name, realName, superPower, isHuman, yearCreated, strength);
    }

    public void addSuperheroWithoutName(String realName, String superPower, String isHuman,
                                        int yearCreated, int strength){
        db.addSuperheroWithoutName(realName, superPower, isHuman, yearCreated, strength);
    }


}
