package information;

public class Superhero {
    private String secretIdentity;
    private String trueIdentity;
    private String superpower;
    private int yearCreated;
    private String isHuman;
    private int strength;

    //Constructor that creates superhero objects.
    public Superhero(String secretIdentity, String trueIdentity, String superpower,
                     int yearCreated, String isHuman, int strength){
        this.secretIdentity = secretIdentity;
        this.trueIdentity = trueIdentity;
        this.superpower = superpower;
        this.yearCreated = yearCreated;
        this.isHuman = isHuman;
        this.strength = strength;
    }

    //Getter
    public String getSecretIdentity(){
        return secretIdentity;
    }

    public String getTrueIdentity(){
        return trueIdentity;
    }

    public String getSuperpower(){
        return superpower;
    }

    public int getYearCreated(){
        return yearCreated;
    }

    public int getStrength(){
        return strength;
    }

    //Setter
    public void setSecretIdentity(String secretIdentity){
        this.secretIdentity = secretIdentity;
    }
    public void setTrueIdentity(String trueIdentity){
        this.trueIdentity = trueIdentity;
    }
    public void setStrength (int strength){
        this.strength = strength;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("\nListe af superhelte ");
        stringBuilder.append("\nSecret identity: ");
        stringBuilder.append("\u001B[32m" + secretIdentity + "\u001B[0m");
        stringBuilder.append("\nTrue identity: ");
        stringBuilder.append("\u001B[32m" + trueIdentity + "\u001B[0m");
        stringBuilder.append("\nSuperpower(s): ");
        stringBuilder.append("\u001B[32m" + superpower + "\u001B[0m");
        stringBuilder.append("\nDate of birth: ");
        stringBuilder.append("\u001B[32m" + yearCreated + "\u001B[0m");
        stringBuilder.append("\nHuman: ");
        stringBuilder.append("\u001B[32m" + isHuman + "\u001B[0m");
        stringBuilder.append("\nStrength: ");
        stringBuilder.append("\u001B[32m" + strength + "\u001B[0m" +"\n");

        return stringBuilder.toString();
    }
}
