package comparator;
import information.Superhero;
import java.util.Comparator;

public class YearCreatedComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero data1, Superhero data2){
        return Integer.compare(data1.getYearCreated(), data2.getYearCreated());
    }
}
