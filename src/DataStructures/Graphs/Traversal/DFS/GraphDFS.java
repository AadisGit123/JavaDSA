package DataStructures.Graphs.Traversal.DFS;

import java.util.*;

public class GraphDFS {
    int vertex;

    GraphDFS(int v){
        this.vertex=v;
    }

    private void dfsRec(int srcNode, HashMap<Integer, ArrayList<Integer>> adjList, ArrayList<Integer> ans, boolean[] visited) {
        visited[srcNode]=true;
        ans.add(srcNode);
        for(int neighbor:adjList.get(srcNode)){
            if(!visited[neighbor]){
                dfsRec(neighbor,adjList, ans, visited);
            }
        }
    }
    ArrayList<Integer> dfsTraversal(HashMap<Integer, ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[vertex];
        ArrayList<Integer> ans = new ArrayList<>();
        dfsRec(0, adjList, ans, visited);
        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices you want in the graph: ");
        int vertex = sc.nextInt();
        int edge = sc.nextInt();

        //Adjacency List
        HashMap<Integer, ArrayList<Integer>> adjList = new HashMap<>();
        //Creating an empty arrayList for every node
        for (int i = 0; i < vertex; i++) {
            adjList.put(i, new ArrayList<>());
        }
        //add edges
        for (int i = 0; i < edge; i++) {
            System.out.print("Enter edge " + (i + 1) + ": ");
            int u = sc.nextInt();
            int v = sc.nextInt();
            adjList.get(u).add(v);
            adjList.get(v).add(u);
        }

        GraphDFS dfs = new GraphDFS(vertex);
        //Printing the Adjacency List
        System.out.print("Adjacency List: ");
        System.out.println();
        for(int i: adjList.keySet()) System.out.println(i + "-> " + adjList.get(i));
        ArrayList<Integer> ans = dfs.dfsTraversal(adjList);
        System.out.println("BFS Traversal result: " + ans);
    }
}
