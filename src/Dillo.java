package src;

/**
 * Dillo is the class, the template for the objects we want to create
 *
 * length and isDead are fields which all Dillo objects will have
 */
public class Dillo {
    public int length;
    public boolean isDead;

    /**
     * This is the constructor, the function that tells Java
     * how to create a new Dillo object
     *
     * @param l is the value that should be put into the length field
     * @param isD is the value that should be put into the isDead field
     */
    public Dillo(int l, boolean isD) {
        this.length = l;
        this.isDead = isD;
    }

    /**
     * Check whether this Dillo can shelter a human.
     *
     * canShelter() is a method, a function associated with a particular class.
     * Methods have access to the fields and other methods of the object
     * on which they are called, through the keyword "this" .
     *
     * @return true IFF this Dillo is longer than 60ft and is dead
     */
    public boolean canShelter() {
        return (this.length >= 60 &&
                this.isDead);
    }

    /**
     * Check whether this Dillo is longer than another provided Dillo
     *
     * longerThan has access to the Dillo on which it was called
     * through the "this" keyword, and then references the other input Dillo
     * through its parameter name ("otherDillo").
     *
     * @param otherDillo the other Dillo to compare against
     * @return true IFF this Dillo is longer than otherDillo
     */
    public boolean longerThan(Dillo otherDillo) {
        return (this.length > otherDillo.length);
    }
}
