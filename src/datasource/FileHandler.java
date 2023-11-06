package datasource;

import information.Superhero;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
   private File superheroFile;
   private final String DELIMITER = ";";

    public FileHandler(){
        this.superheroFile= new File("superhero.csv");
    }

    public boolean fileCreator() {

        try {
            if (superheroFile.createNewFile()){
                return true;
            }
            else {
                return false;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }


    public boolean saveData(ArrayList<Superhero> superheroes){
        try{
            PrintStream output = new PrintStream(superheroFile);
            for (Superhero superhero: superheroes) {
                //lave en csv string for hver superhero
                String superheroCSV = superheroToCSV(superhero);
                output.println(superheroCSV);
                // skriv string til filen
            }
            output.close();
        }catch (IOException e){
            e.printStackTrace();
        }
        return true;
    }

    private String superheroToCSV(Superhero superhero) {
        return superhero.getSecretIdentity() + DELIMITER + superhero.getTrueIdentity() + DELIMITER + superhero.getSuperpower() + DELIMITER +
                    superhero.getYearCreated() + DELIMITER + superhero.getIsHuman() + DELIMITER + superhero.getStrength();}

    public void loadSuperheroFile() {
    ArrayList<Superhero>superheroes = new ArrayList<>();
            try {
                Scanner sc = new Scanner(superheroFile);
                while (sc.hasNextLine()) {
                    String linje = sc.nextLine();
                    String[] AntalAtributes = linje.split(";");
                    if (AntalAtributes.length == 6){
                    String secretIdentity = AntalAtributes[0].trim();
                    String trueIdentity = AntalAtributes[1].trim();
                    String superpower = AntalAtributes[2].trim();
                    int yearCreated = Integer.parseInt(AntalAtributes[3].trim());
                    boolean isHuman = Boolean.parseBoolean(AntalAtributes[4].trim());
                    int strength = Integer.parseInt(AntalAtributes[5].trim());

                    Superhero superhero = new Superhero(secretIdentity, trueIdentity,
                               superpower, yearCreated, isHuman, strength);

                    superheroes.add(superhero);
                }else {
                        System.out.println("FEJL");
                    }
                }

            }catch (IOException ioe){
               ioe.printStackTrace();
            }

           for (Superhero superhero: superheroes) {
               System.out.println(superhero);
           }

}
    }