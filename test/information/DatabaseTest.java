package information;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DatabaseTest {
    private Database db;
    @BeforeEach
    void setUp() {
        db = new Database();
        db.addSuperhero("Superman", "Klark Kent", "Flying",
                1940, "No", 400);

        db.addSuperhero("The Flash", "Barry Allen", "Speed",
                1994, "Yes", 300);
    }

    @AfterEach
    void tearDown() {
        db = null;
    }

    @Test
    void addSuperhero() {
        //TODO Add superHero
        //Arrange - man sætter scenen


        //Act - Hvordan scenen skal aktiveres.


        //Assertion
        fail();
    }

    @Test
    void recieveSuperheroes() {
        //TODO Add recieveSuperheroes
        //Arrange - man sætter scenen


        //Act - Hvordan scenen skal aktiveres.


        //Assertion
        fail();
    }

    @Test
    void searchSuperhero() {
        //TODO add searchSuperhero
        //Arrange - man sætter scenen


        //Act - Hvordan scenen skal aktiveres.


        //Assertion
        fail();
    }

    @Test
    void editSuperhero() {
        //TODO Add editSuperhero
        //Arrange - man sætter scenen


        //Act - Hvordan scenen skal aktiveres.


        //Assertion
        fail();
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