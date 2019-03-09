package com.algos.Graphz;

import java.util.LinkedList;
import java.util.List;

public class WeightedGraph {


    static class Edge{

        private Integer src;
        private Integer dest;
        private Integer weight;
    }

    List<Edge> adj[];

    public WeightedGraph(int v){

        adj = new LinkedList[v];

        for(int i = 0; i < v; i++){

            adj[i]= new LinkedList<Edge>();
        }

    }


    public void add(int src, int dest, int weight){

        Edge e = new Edge();
        e.dest = dest;
        e.weight = weight;

        adj[src].add(e);
    }


}
