package src;

public class Dillo {
    public int length;
    public boolean isDead;

    public Dillo(int l, boolean isD) {
        this.length = l;
        this.isDead = isD;
    }

    /**
     * Write a function to determine whether a Dillo
     * is larger than 60 units and dead
     * boolean canShelter(Dillo d) {
     *     d.length > 60 && d.isDead
     * }
     */
    // everything, including functions, must be in a class
    // we call this a  **method**
    public boolean canShelter() {
        return (this.length > 60) && (this.isDead == true);
    }

    // Return true if this dillo is larger than another
    public boolean isBigger(Dillo other) {
        return this.length > other.length;
    }


}
