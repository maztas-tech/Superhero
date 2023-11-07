package comparator;
import information.Superhero;

import java.util.Comparator;

public class TrueIdentityComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero data1, Superhero data2){
        return data1.getTrueIdentity().compareTo(data2.getTrueIdentity());
    }

}
