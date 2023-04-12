import java.util.ArrayList;

public class Traversal {
    /**
     * REFACTOR THIS METHOD
     * Perform a BFS traversal of the graph, printing the nodes in the order visited
     */
    public static ArrayList<String> BFS(ArrayList<Integer>[] adjList, Integer startNode) {
        //create the list of visited nodes and the queue
        ArrayList<Integer> visitedNodes = new ArrayList<>();
        Queue theQueue = new ArrayQueue();

        //mark the start as visited and put it in the Queue
        visitedNodes.add(startNode);
        theQueue.enqueue(startNode);

        while (!theQueue.isEmpty()){
            Integer item = (Integer) theQueue.dequeue();
            //mark all the neighbours of the item which have not been visited as visited and add them to the queue
            for (Integer neighbour:adjList[item]){
                if (!visitedNodes.contains(neighbour)){
                    visitedNodes.add(neighbour);
                    theQueue.enqueue(neighbour);
                }
            }
        }
        ArrayList<String> visitedNodesString = new ArrayList<>();
        for (Integer node : visitedNodes) {
            visitedNodesString.add(Names.networkMembers[node]);
        }
        return visitedNodesString;
    }

    /**
     * fix this method
     * Perform a DFS traversal of the graph
     * The refactored method will return true if the destinationNode is encountered in the subgraph descending from
     * startNode
     */
    public static boolean DFS(ArrayList<Integer>[] adjList, Integer startNode, Integer destinationNode) {

        //create the list of visited nodes and the stack
        ArrayList<Integer> visitedNodes = new ArrayList<>();
        Stack theStack = new ArrayStack();

        //mark the start as visited and put it in the stack
        visitedNodes.add(startNode);
        theStack.push(startNode);

        while(!theStack.isEmpty()){
            Integer item = (Integer) theStack.pop();
            // Check if the current node is the destination node
            if (item == destinationNode) {
                return true;
            }


            //mark all the neighbours of the item which have not been visited as visited and add them to the stack
            for (Integer neighbour:adjList[item]){
                if (!visitedNodes.contains(neighbour)){
                    visitedNodes.add(neighbour);
                    theStack.push(neighbour);
                }
            }

        }
        return false;
    }
}
