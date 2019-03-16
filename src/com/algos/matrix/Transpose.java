package com.algos.matrix;

import java.util.Arrays;

public class Transpose {


    static int[][] transpose(int a[][]){

        int columns = a[0].length;
        int rows = a.length;
        int tmp[][] = new int[columns][rows];


        for(int i =  0; i < rows; i++){

            for(int j = 0; j < columns; j++){


                tmp[j][i] = a[i][j];

            }
        }

        return tmp;
    }

    public static void main(String args[]){

        int a[][] = {{1,2,3, 5}, {4,5,6, 7}, {7,8,9, 10}};

        System.out.println(Arrays.deepToString(a));

        int t[][] = transpose(a);

        System.out.println(Arrays.deepToString(t));

    }
}
