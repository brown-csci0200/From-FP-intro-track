package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {
    // Every piece of data must be in a class
    // Make a dillo, save it as babyDillo
    Dillo babyDillo = new Dillo(5, false);
    Dillo d1 = new Dillo(42, true);
    Dillo d2 = new Dillo(31, false);
    Bear b1 = new Bear(5);

    @Test
    public void testIsBigger() {
        Assert.assertEquals(true, d1.isBiggger(d2));
        Assert.assertEquals(false, d2.isBiggger(d1));
    }

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
        // Check that babyDillo's length == 5
        Assert.assertEquals(5, babyDillo.length);
    }

    @Test
    public void testCanShelter() {
        Dillo d3 = new Dillo(80, true);
        Assert.assertEquals(true, d3.canShelter());
    }


}
