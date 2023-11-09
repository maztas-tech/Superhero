package comparator;
import information.Superhero;
import java.util.Comparator;


public class IsHumanComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero data1, Superhero data2){
        return Boolean.compare(data1.getIsHuman(),data2.getIsHuman());
    }
}
