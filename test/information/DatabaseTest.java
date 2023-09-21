package information;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database db;
    private ArrayList<Superhero> superheroes = new ArrayList<Superhero>();

    @BeforeEach
    void setUp() {
        db = new Database();
        db.recieveSuperheroes().addAll(List.of(
                new Superhero("Batman", "Bruce Wayne", "Fighting", 1943, "Yes", 200),
                new Superhero("Catwoman", "Selina Kyle", "Burglary", 1950,"Yes" ,100)));

    }

    @AfterEach
    void tearDown() {

        db = null;
    }

    @Test
    void addSuperhero() {
        //TODO Add superHero
        //Arrange - man sætter scenen
        String secretIdentity = "Superman";
        String trueIdentity = "Klark Kent";
        String superpower = "Flying";
        int yearCreated = 1940;
        String isHuman = "No";
        int strength = 400;
        String secretIdentity1 = "Batman";
        String trueIdentity1 = "Bruce Wayne";
        String superpower1 = "Fighting";
        int yearCreated1 = 1950;
        String isHuman1 = "Yes";
        int strength1 = 200;

        superheroes.add(new Superhero(secretIdentity, trueIdentity, superpower, yearCreated, isHuman, strength));
        superheroes.add(new Superhero(secretIdentity1, trueIdentity1, superpower1, yearCreated1, isHuman1, strength1));
        //Act - Hvordan scenen skal aktiveres. Counting amount of objects
        int expectedSize = 2;
        int actualSize = superheroes.size();

        //Assertion
        assertEquals(expectedSize, actualSize);
    }

    @Test
    void recieveSuperheroes() {
        //TODO Add recieveSuperheroes
        //Arrange - man sætter scenen



        //Act - Hvordan scenen skal aktiveres.



        //Assertion

    }

    @Test
    void searchSuperhero() {
        //TODO add searchSuperhero
        //Arrange - man sætter scenen
        String secretIdentity = "Superman";
        String trueIdentity = "Klark Kent";
        String superpower = "Flying";
        int yearCreated = 1940;
        String isHuman = "No";
        int strength = 400;

        //Act - Hvordan scenen skal aktiveres.
        db.addSuperhero(secretIdentity, trueIdentity, superpower, yearCreated, isHuman, strength);
        Superhero result = db.searchSuperhero(secretIdentity);

        //Assertion
        assertEquals(result.getSecretIdentity(), secretIdentity);
    }

    @Test
    void editSuperhero() {
        //TODO Add editSuperhero
        //Arrange - man sætter scenen

        //Act - Hvordan scenen skal aktiveres.


        //Assertion

    }

    @Test
    void removeSuperhero(){
        //TODO Add removeSuperhero
        //Arrange - man sætter scenen


        //Act - Hvordan scenen skal aktiveres.


        //Assertion
        fail();
    }
}