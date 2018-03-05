import java.util.Iterator;
import java.util.LinkedList;

/**
 * Here we traverse the graph using DFS with the help of a boolean array
 * that keeps track of the visited nodes.
 * Created by ©Ameya on 3/4/2018 at 11:48 PM.
 */
public class DFSUsingArray {
    static int mVertices;
    LinkedList<Integer> adjListArray[];

    private DFSUsingArray(int vertices) {
        mVertices = vertices;
        adjListArray = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjListArray[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {

        DFSUsingArray dfsUsingArray = new DFSUsingArray(4);
        dfsUsingArray.addEdge(0, 1);
        dfsUsingArray.addEdge(1, 2);
        dfsUsingArray.addEdge(1, 2);
        dfsUsingArray.addEdge(2, 2);
        dfsUsingArray.addEdge(2, 3);
        dfsUsingArray.addEdge(3, 3);

        boolean visited[] = new boolean[mVertices];
        dfsUsingArray.DFS_visit(2, visited);
    }

    /**
     * This function performs the Depth First Traversal for the given graph
     *
     * @param v       the node along which DFS needs to be done
     * @param visited boolean array that keeps track of the visited nodes
     */

    private void DFS_visit(int v, boolean[] visited) {
        visited[v] = true;
        System.out.println(v);
        Iterator<Integer> iterator = adjListArray[v].listIterator();
        while (iterator.hasNext()) {
            int n = iterator.next();
            if (!visited[n]) {
                DFS_visit(n, visited);
            }
        }
    }

    /**
     * Adds an edge in the undirected graph
     *
     * @param source node of the edge
     * @param dest   node of the edge
     */
    private void addEdge(int source, int dest) {
        adjListArray[source].add(dest);
        adjListArray[dest].add(source);
    }

}
