package datasource;


import information.Superhero;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class FileHandler {
   private File superheroFile;

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


/*
    public boolean saveData(ArrayList<Superhero> superheroes){

    }*/


}