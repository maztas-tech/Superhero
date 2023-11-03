package datasource;


import information.Superhero;

import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

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
                    superhero.getYearCreated() + DELIMITER + superhero.getIsHuman() + DELIMITER + superhero.getStrength();

    }


}