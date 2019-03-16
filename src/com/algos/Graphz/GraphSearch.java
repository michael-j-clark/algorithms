package com.algos.Graphz;

// Java program to print DFS traversal from a given given graph
import java.util.*;

// This class represents a directed graph using adjacency list
// representation
class GraphSearch
{
    private int V; // No. of vertices

    // Array of lists for Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    GraphSearch(int v)
    {
        V = v;
        adj = new LinkedList[v];
        for (int i=0; i<v; ++i)
            adj[i] = new LinkedList();
    }

    //Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }




    // prints BFS traversal from a given source s
    void DFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        Stack<Integer> stack = new Stack<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        stack.add(s);

        while (stack.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = stack.pop();
            System.out.print(stack+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    stack.add(n);
                }
            }
        }
    }


        // Mark the current node as visited and enq

    // prints BFS traversal from a given source s
    void BFS(int s)
    {
        // Mark all the vertices as not visited(By default
        // set as false)
        boolean visited[] = new boolean[V];

        // Create a queue for BFS
        LinkedList<Integer> queue = new LinkedList<Integer>();

        // Mark the current node as visited and enqueue it
        visited[s]=true;
        queue.add(s);

        while (queue.size() != 0)
        {
            // Dequeue a vertex from queue and print it
            s = queue.poll();
            System.out.print(s+" ");

            // Get all adjacent vertices of the dequeued vertex s
            // If a adjacent has not been visited, then mark it
            // visited and enqueue it
            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext())
            {
                int n = i.next();
                if (!visited[n])
                {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String args[])
    {
        GraphSearch g = new GraphSearch(5);

        g.addEdge(0, 1);

        g.addEdge(2, 3);
        g.addEdge(3, 4);
        g.addEdge(1, 4);

        System.out.println("Following is Depth First Traversal "+
                "(starting from vertex 2)");

        int m [][] = {
                {0, 1, 1},
                {0, 0, 0},
                {0, 1, 1}
        };

        g.DFS(2);
        //g.DFSmat(m, 0);
    }
}
// This code is contributed by Aakash Hasija
