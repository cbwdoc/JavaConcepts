package intro.objects;

/*  This is a Java class file.
    Here the Player object is created to take 2 integer data fields jerseyNumber and rating.
    The Player() methods are the object's constructors.
    Use these to create a new instance of the object with or without specified data values.
*/
/*  The only other methods needed for this object are "getters" and "setters".
    Object data fields are conventionally set to private,
    meaning they cannot be accessed directly from another file (i.e. the main class).
    As such these methods are needed in order to access and alter these fields.
 */

public class Player {
    private int jerseyNumber;
    private int rating;

    // default constructor
    public Player() {
        jerseyNumber = 0;
        rating = 0;
    }

    // constructors with parameters to set each data field
    public Player(int j, int n) {
        jerseyNumber = j;
        rating = n;
    }

    // SETTERS
    public void setJerseyNumber(int j) {
        jerseyNumber = j;
    }

    public void setRating(int r) {
        rating = r;
    }

    // GETTERS
    public int getJerseyNumber() {
        return jerseyNumber;
    }

    public int getRating() {
        return rating;
    }
}
