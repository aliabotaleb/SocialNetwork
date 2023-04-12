import java.util.ArrayList;
import java.util.Arrays;
public class  SocialNetwork extends DiGraph {
    public SocialNetwork(int numberOfNodes) {
        super(numberOfNodes);
    }

    /**
     * COMPLETE THIS METHOD
     * takes the name of a person and should return an ArrayList of String objects, which contains
     * the names all the followers of person.
     * @param person - the name of the Person to check
     * @return
     */

    public ArrayList<String> broadcastsTo(String person){
        ArrayList<String> followers = new ArrayList<>();
        for(int i = 0; i < numberOfNodes; i++){
            if(hasEdge(i, Arrays.asList(Names.networkMembers).indexOf(person))){
                followers.add(Names.networkMembers[i]);
            }
        }
        return followers;
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
        // get the index of the source and target names in the Names.networkMembers array
        int sourceIndex = Arrays.asList(Names.networkMembers).indexOf(source);
        int targetIndex = Arrays.asList(Names.networkMembers).indexOf(target);

        // call DFS with the adjacency list, sourceIndex and targetIndex
        return Traversal.DFS(adjacencyList, sourceIndex, targetIndex);

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
        // get the index of the person name in the Names.networkMembers array
        int personIndex = Arrays.asList(Names.networkMembers).indexOf(person);

        // call BFS with the adjacency list and personIndex
        ArrayList<String> receivers = Traversal.BFS(adjacencyList, personIndex);

        // remove the person name from the receivers list
        receivers.remove(person);

        // return the receivers list
        return receivers;
    }
}