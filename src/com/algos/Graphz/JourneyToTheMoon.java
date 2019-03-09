package com.algos.Graphz;

import java.util.*;

/**
 * https://www.hackerrank.com/challenges/journey-to-the-moon/problem
 */
public class JourneyToTheMoon {


    static LinkedList<Integer> adj[] = null;

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();//number of astronauts
        int I = input.nextInt();//number of pairs

        adj = new LinkedList[N];

        for(int i = 0; i < N; i++){

            adj[i] = new LinkedList();
        }

        Set<Integer> c0 = new HashSet<Integer>();
        Set<Integer> c1 = new HashSet<Integer>();

        for(int i = 0; i < I; i++){

            Integer p = input.nextInt();
            Integer q = input.nextInt();


            adj[p].add(q);

        }

        //make country 1
        for(int i = 0; i < adj.length; i++){

            LinkedList<Integer> cur = adj[i];

            for(int j = 0; j < cur.size(); j++){

                Integer c = cur.get(j);



            }

            System.out.println("");
        }


    }
}
