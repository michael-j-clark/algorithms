package com.algos.Graphz;

// Java program to count islands in boolean 2D matrix
import java.util.*;
import java.lang.*;
import java.io.*;

class Islands
{
    //No of rows and columns
    static final int ROW = 5, COL = 5;

    // A function to check if a given cell (row, col) can
    // be included in DFS
    boolean isSafe(int M[][], int row, int col,
                   boolean visited[][])
    {
        // row number is in range, column number is in range
        // and value is 1 and not yet visited
        return (row >= 0) && (row < ROW) &&
                (col >= 0) && (col < COL) &&
                (M[row][col]==1 && !visited[row][col]);
    }

    // A utility function to do DFS for a 2D boolean matrix.
    // It only considers the 8 neighbors as adjacent vertices
    void DFS(int M[][], int row, int col, boolean visited[][])
    {
        // These arrays are used to get row and column numbers
        // of 8 neighbors of a given cell
        int rowNbr[] = new int[] {-1, -1, -1, 0, 0, 1, 1, 1};
        int colNbr[] = new int[] {-1, 0, 1, -1, 1, -1, 0, 1};

        // Mark this cell as visited
        visited[row][col] = true;

        // Recur for all connected neighbours
        for (int k = 0; k < 8; ++k)
            if (isSafe(M, row + rowNbr[k], col + colNbr[k], visited) )
                DFS(M, row + rowNbr[k], col + colNbr[k], visited);
    }

    // The main function that returns count of islands in a given
    // boolean 2D matrix
    int countIslands(int M[][])
    {
        // Make a bool array to mark visited cells.
        // Initially all cells are unvisited
        boolean visited[][] = new boolean[ROW][COL];


        // Initialize count as 0 and travese through the all cells
        // of given matrix
        int count = 0;
        for (int i = 0; i < ROW; ++i)
            for (int j = 0; j < COL; ++j)
                if (M[i][j]==1 && !visited[i][j]) // If a cell with
                {								 // value 1 is not
                    // visited yet, then new island found, Visit all
                    // cells in this island and increment island count
                    DFS(M, i, j, visited);
                    ++count;
                }

        return count;
    }

    public int numIslands(int[][] grid) {
    if (grid.length == 0)   return 0;

    int m = grid.length, n = grid[0].length;
        boolean visited[][] = new boolean[m][n];

    int count = 0;
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            if (grid[i][j] == 1) {

                dfs(grid, i, j, visited);
                count++;
            }
    // recover the grid
    for (int i = 0; i < m; i++)
        for (int j = 0; j < n; j++)
            if (!visited[i][j])
                grid[i][j] = 1;
    return count;
}

    private void dfs(int[][] grid, int i, int j, boolean visited[][]) {
        if (grid[i][j] == 0 && !visited[i][j])  return;
        if (grid[i][j] == 1 && !visited[i][j]) {
            visited[i][j] = true;
            int m = grid.length, n = grid[0].length;
            if (i - 1 >= 0)   dfs(grid, i - 1, j, visited);
            if (i + 1 < m)    dfs(grid, i + 1, j, visited);
            if (j - 1 >= 0)   dfs(grid, i, j - 1, visited);
            if (j + 1 < n)    dfs(grid, i, j + 1, visited);
        }
    }

    // Driver method
    public static void main (String[] args) throws java.lang.Exception
    {
        int M[][]= new int[][] {
                {1, 1, 0, 0, 0},
                {0, 1, 0, 0, 1},
                {1, 0, 0, 1, 1},
                {0, 0, 0, 0, 0},
                {1, 0, 1, 0, 1}
        };
        Islands islands = new Islands();
        System.out.println("Number of islands is: "+ islands.numIslands(M));
    }
} //Contributed by Aakash Hasija

