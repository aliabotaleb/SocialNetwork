import java.util.ArrayList;
import java.util.Arrays;
public class  SocialNetwork extends DiGraph {
    public SocialNetwork() {
        super(7);
        addEdge(Names.ABEL, Names.BINA);
        addEdge(Names.ABEL, Names.CATO);
        addEdge(Names.BINA, Names.DANA);
        addEdge(Names.CATO, Names.ABEL);
        addEdge(Names.CATO, Names.DANA);
        addEdge(Names.CATO, Names.EDEN);
        addEdge(Names.DANA, Names.FERN);
        addEdge(Names.FERN, Names.EDEN);
        addEdge(Names.FERN, Names.GENO);
        addEdge(Names.FERN, Names.DANA);
        addEdge(Names.FERN, Names.HEDY);
        addEdge(Names.JODY, Names.HEDY);
        addEdge(Names.JODY, Names.EDEN);
        addEdge(Names.INEZ, Names.JODY);
        addEdge(Names.INEZ, Names.GENO);
        addEdge(Names.GENO, Names.DANA);
        addEdge(Names.GENO, Names.INEZ);
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
        return null;
    }
}