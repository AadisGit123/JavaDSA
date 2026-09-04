package DataStructures.Graphs.Traversal.BFS;

import java.util.*;

public class GraphBFS {

    int vertex;

    public GraphBFS(int vertex) {
        this.vertex = vertex;
    }

    ArrayList<Integer> bfsTraversal(HashMap<Integer, ArrayList<Integer>> adjList){
        boolean[] visited = new boolean[vertex];
        Queue<Integer> q = new LinkedList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        q.offer(0);
        visited[0] = true;
        while (!q.isEmpty()){
            int front = q.poll();
            ans.add(front);
            for (int neighbor:  adjList.get(front)){
                if(!visited[neighbor]){
                    visited[neighbor] = true;
                    q.offer(neighbor);
                }
            }
        }
        return ans;
    }
}

class DriverCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of vertices you want in the graph: ");
        int vertex = sc.nextInt();
        int edge = sc.nextInt();
        GraphBFS G = new GraphBFS(vertex);

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

        //Printing the Adjacency List
        System.out.print("Adjacency List: ");
        System.out.println();
        for(int i: adjList.keySet()) System.out.println(i + "-> " + adjList.get(i));
        ArrayList<Integer> ans = G.bfsTraversal(adjList);
        System.out.println("BFS Traversal result: " + ans);
    }
}
