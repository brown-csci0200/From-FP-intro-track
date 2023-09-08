package src;

public class Dillo {
    public int length;
    public boolean isDead;

    public Dillo(int l, boolean isD) {
        this.length = l;
        this.isDead = isD;
    }

    /*
     * Write a function to determine whether a Dillo is larger
     * than 60 units and dead
     * In the spirit of Racket/Pyret/Reason, this would look like:
     * boolean canShelter(Dillo d) {
     *     d.length > 60 && d.isDead
     * }
     */
    // We call this a *method*
    public boolean canShelter() {
        return (this.length > 60) && this.isDead;
    }

    // Returns true if dillo is bigger than another dillo
    public boolean isBiggger(Dillo other) {
        return this.length > other.length;
    }



}
