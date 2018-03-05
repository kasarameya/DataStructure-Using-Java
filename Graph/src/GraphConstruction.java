import java.util.Iterator;
import java.util.LinkedList;

/**
 * Here we construct a graph using Adjacency List representation
 * Created by ©Ameya on 3/4/2018 at 12:00 PM.
 */
public class GraphConstruction {

    private int vertices;
    private LinkedList<Integer>[] adjLinkedListArr;

    /**
     * Constructor that creates an array of LinkedList for the creation of Adjacency List
     *
     * @param nodes number of vertices the graph has
     */
    private GraphConstruction(int nodes) {
        vertices = nodes;
        adjLinkedListArr = new LinkedList[nodes];
        for (int i = 0; i < vertices; i++) {
            adjLinkedListArr[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args) {
        GraphConstruction gc = new GraphConstruction(4);

        gc.addEdge(0, 1);
        gc.addEdge(0, 2);
        gc.addEdge(0, 3);
        gc.addEdge(2, 1);
        gc.addEdge(2, 3);

        gc.printGraph();
    }

    /**
     * Add an edge between the given vertices
     *
     * @param v1 the first vertex
     * @param v2 the second vertex
     */
    private void addEdge(int v1, int v2) {
        adjLinkedListArr[v1].add(v2);
        adjLinkedListArr[v2].add(v1);
    }

    /**
     * Method used to print the construction of graph
     */
    private void printGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.println("Adjacency List for " + i + " node :- ");
            Iterator<Integer> li = adjLinkedListArr[i].listIterator();
            while (li.hasNext()) {
                System.out.println(li.next().intValue());
            }


            System.out.println();
        }
    }
}
