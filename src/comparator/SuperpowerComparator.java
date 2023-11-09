package comparator;

import information.Superhero;

import java.util.Comparator;

public class SuperpowerComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero data1, Superhero data2){
        return data1.getSuperpower().toUpperCase().compareTo(data2.getSuperpower().toUpperCase());
    }
}
