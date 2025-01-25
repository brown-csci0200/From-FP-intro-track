package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    /**
     * Creating a new instance of a class is done
     * using the "new" keyword in Java,
     * followed by a call to the constructor
     */
    Dillo babyDillo = new Dillo(8, false);
    Dillo adultDillo = new Dillo(24, false);
    Dillo hugeDeadDillo = new Dillo(65, true);

    /**
     * Example test method.
     * Test methods must have @Test before the method
     */
    @Test
    public void testExample() {
        // example syntax for assertEquals
        Assert.assertEquals(2, 1 + 1);
    }
    @Test
    public void testMakeDillo() {
        Assert.assertEquals(8, babyDillo.length);
    }

    @Test
    public void testCanShelter() {
        Assert.assertEquals(false, babyDillo.canShelter());
    }

    @Test
    public void testLonger(){
        boolean isLonger = hugeDeadDillo.longerThan(babyDillo);
        Assert.assertEquals(true, isLonger);
    }

    @Test
    public void testZoo () {
        /* Variables created inside of a method (like myZoo1 here)
           are only accessible within that method
         */
        /* Variables created outside of a method (like babyDillo above)
           must still be created with a class,
           because in Java ALL code lives in a class.
           These variables are accessible to every method within that class.
         */
        Zoo myZoo1 = new Zoo(babyDillo, new Snake(1, false));
        Assert.assertEquals(8, myZoo1.myOneDillo.length);
        Assert.assertEquals(1, myZoo1.myOneSnake.length);
    }
}

