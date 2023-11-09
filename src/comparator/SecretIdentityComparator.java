package comparator;

import information.Superhero;

import java.util.Comparator;

public class SecretIdentityComparator implements Comparator<Superhero> {
    @Override
    public int compare(Superhero data1, Superhero data2){
        return data1.getSecretIdentity().toUpperCase().compareTo(data2.getSecretIdentity().toUpperCase());
    }
}
