package com.algos.Graphz;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class AdjMatrix
{

    public static void dfs(int adjacency_matrix[][], int source)
    {
        int n = adjacency_matrix[source].length - 1;

        Stack<Integer> stack = new Stack<Integer>();

        int visited[] = new int[n + 1];
        int element = source;
        int i = source;
        System.out.print(element + "\t");
        visited[source] = 1;
        stack.push(source);

        while (!stack.isEmpty())
        {
            element = stack.peek();
            i = element;
            while (i <= n)
            {
                if (adjacency_matrix[element][i] == 1 && visited[i] == 0)
                {
                    stack.push(i);
                    visited[i] = 1;
                    element = i;
                    i = 1;
                    System.out.print(element + "\t");
                    continue;
                }
                i++;
            }
            stack.pop();
        }
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter dimensions m X n");

        int M = input.nextInt();

        int N = input.nextInt();

        System.out.println("Enter the number of edges:");

        int E = input.nextInt();


        int adj[][] = new int[M][N];

        System.out.println("Enter edges as pairs of vertices separated by a space:");

        for(int i = 0; i < E; i++){

            adj[input.nextInt()][input.nextInt()] = 1;
        }

        dfs(adj, 0);



        //System.out.println(Arrays.deepToString(adj));



    }
}
