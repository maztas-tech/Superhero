package information;
public class Superhero {
    //Fields
    private String name;
    private String realName;
    final private String superPower;
    final private int yearCreated;
    final private String isHuman;
    private int strength;

    //Constructor - with superhero name
    public Superhero(String name, String realName, String superPower, String isHuman,
                     int yearCreated, int strength){
        this.name = name;
        this.realName = realName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.yearCreated = yearCreated;
        this.strength = strength;
    }

    //Constructor - without superhero name
    public Superhero(String realName, String superPower, String isHuman, int yearCreated,
                      int strength){
        this.realName = realName;
        this.superPower = superPower;
        this.isHuman = isHuman;
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

    public String getIsHuman(){
        return isHuman;
    }
    public int getYearCreated(){
        return yearCreated;
    }

    public int getStrength(){
        return strength;
    }


    //Setter
    public void setRealName(String realName){
        this.realName = realName;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStrength(int strength){
        if(strength <= 10000){
            this.strength = strength;
        }
    }

    @Override
    public String toString() {
        return "Superhero{" +
                "name='" + name + '\'' +
                ", realName='" + realName + '\'' +
                ", superPower='" + superPower + '\'' +
                ", yearCreated=" + yearCreated +
                ", isHuman=" + isHuman +
                ", strength=" + strength +
                '}';
    }
}
