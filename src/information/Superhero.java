package information;
public class Superhero {
    //Fields
    private String name;
    private String realName;
    final private String superPower;
    final private int yearCreated;
    private int strength;

    //Constructor - with superhero name
    public Superhero(String name, String realName, String superPower,
                     int yearCreated, int strength){
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.strength = strength;
    }

    //Constructor - without superhero name
    public Superhero(String realName, String superPower, int yearCreated,
                     int strength){
        this.realName = realName;
        this.superPower = superPower;
        this.yearCreated = yearCreated;
        this.strength = strength;
    }

    //Getter
    public String getName(){
        return name;
    }
    public String getRealName(){
        return realName;
    }

    public String getSuperPower(){
        return superPower;
    }
    public int getYearCreated(){
        return yearCreated;
    }

    public int getStrength(){
        return strength;
    }

    //Setter
    public void setRealName(){
        this.realName = realName;
    }
    public void setName(){
        this.name = name;
    }
    public void setStrength(){
        this.strength = strength;
    }





}
