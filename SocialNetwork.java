import java.util.ArrayList;
import java.util.Arrays;
public class SocialNetwork {
    /**
     * COMPLETE THIS METHOD
     * takes the name of a person and should return an ArrayList of String objects, which contains
     * the names all the followers of person.
     * @param person - the name of the Person to check
     * @return
     */

    public ArrayList<String> broadcastsTo(String person){
        return null;
    }

    /**
     * COMPLETE THIS METHOD
     * Method takes the name of a person starting a broadcasting a story (source) and the name of the person that the
     * story is broadcast to (target).
     * It uses the refactored depth first search to see if the story will get from the source to the target and
     * should return true if the story will get from the source to the target
     * and false if there is no path from the source to the target.
     * @param source - the name of the Person to check
     * @param target - the name of the target to check
     * @return true if the story will get from the source to the target and false if there is no path from the
     * source to the target.
     */
    public boolean canReach(String source, String target) {
        return false;
    }

    /**
     * COMPLETE THIS METHOD
     * Method takes the name of a person who has started a story and uses a breadth first search to return an
     * ArrayList of String objects that contains the names of all the person who will receive the story
     * broadcast by that person.
     * @param person name of the person to check
     * @return an ArrayList of String objects that contains the names of all the person who will receive the story
     */
    public ArrayList<String> receiversOf(String person){
        return null;
    }
}