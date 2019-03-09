package com.algos.Graphz;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Problem 4.1.4 in Sedgwick
 */
public class HasEdge {


    static LinkedList<Integer> adj[] = null;

    static Boolean hasEdge(Integer r, Integer s){

        LinkedList<Integer> targ = adj[r];

        for(Iterator<Integer> it = targ.iterator(); it.hasNext();){

            Integer cur = it.next();
            if(cur.intValue() == s.intValue()){
                return Boolean.TRUE;
            }

        }

        return Boolean.FALSE;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        //first is number of vertices
        final Integer V = input.nextInt();

        //first is number of edges
        final Integer N = input.nextInt();

        adj = new LinkedList[V];

        for(int i = 0; i < V ; i++){
            adj[i] = new LinkedList<Integer>();

        }

        for(int i = 0; i < N ; i++){
            Integer p = input.nextInt();
            Integer q = input.nextInt();

            adj[p].add(q);

        }

        //last row is target
        Integer r = input.nextInt();
        Integer s = input.nextInt();

        System.out.println(hasEdge(r, s));



    }


}
