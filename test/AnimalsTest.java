package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import src.*;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AnimalsTest {

    Dillo babyDillo = new Dillo(5, false);
    // make a new Dillo, call it babyDillo

    // Make some more Dillos
    Dillo d1 = new Dillo(20, true);
    Dillo d2 = new Dillo(20000, true);

    Bear bear1 = new Bear(50);

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
        Assert.assertEquals(5, babyDillo.length);
    }

    @Test
    public void testCanShelter() {
        Assert.assertEquals(false, babyDillo.canShelter());
    }

    @Test
    public void testIsBigger() {
        Assert.assertEquals(true, d2.isBigger(d1));
        Assert.assertEquals(false, d1.isBigger(d2));
    }

}
