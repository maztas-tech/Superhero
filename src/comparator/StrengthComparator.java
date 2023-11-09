package comparator;
import information.Superhero;
import java.util.Comparator;

public class StrengthComparator implements Comparator<Superhero> {

    @Override
    public int compare(Superhero data1, Superhero data2){
        return Integer.compare(data1.getStrength(), data2.getStrength());
    }
}
