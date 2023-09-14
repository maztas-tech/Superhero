package information;
public class Superhero {
    //Fields
    private String secretIdentity;
    private String realName;
    final private String superPower;
    final private int yearCreated;
    final private String isHuman;
    private int strength;

    //Constructor with superhero name
    public Superhero(String secretIdentity, String realName, String superPower, String isHuman,
                     int yearCreated, int strength){
        this.secretIdentity = secretIdentity;
        this.realName = realName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.yearCreated = yearCreated;
        this.strength = strength;
    }

    //Constructor without superhero name
    public Superhero(String realName, String superPower, String isHuman, int yearCreated,
                      int strength){
        this.realName = realName;
        this.superPower = superPower;
        this.isHuman = isHuman;
        this.yearCreated = yearCreated;
        this.strength = strength;
    }

    //Getter
    public String getSecretIdentity()
    {
        return secretIdentity;

    }
    public String getRealName()
    {
        return realName;

    }

    public String getSuperPower()
    {
        return superPower;
    }

    public String getIsHuman()
    {
        return isHuman;
    }
    public int getYearCreated()
    {
        return yearCreated;
    }

    public int getStrength()
    {
        return strength;
    }


    //Setter
    public void setRealName(String realName)
    {
        this.realName = realName;
    }
    public void setSecretIdentity(String secretIdentity)
    {
        this.secretIdentity = secretIdentity;
    }
    public void setStrength(int strength){
        if(strength <= 10000){
            this.strength = strength;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nName: ");
        stringBuilder.append(secretIdentity);
        stringBuilder.append("\nReal name: ");
        stringBuilder.append(realName);


        return stringBuilder.toString();

    }
}
