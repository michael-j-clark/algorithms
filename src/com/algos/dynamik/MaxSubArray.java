package com.algos.dynamik;

import java.util.Arrays;

public class MaxSubArray {



    static void printArray(int a[][]){

        System.out.println(Arrays.deepToString(a));
    }
    int findMax(int[][] a, int sm, int sn){

        int ret = 0;
        int m = a.length;//rows
        int n = a[0].length;

        int s[][] = new int[m - sm +1][n - sn  + 1 ];

        for(int i = 0; i < m - sm +1; i++)
            for(int j = 0; j < n - sn  + 1 ; j++){

              s[i][j] = a[i][j]+ a[i][j+1] + a[i+1][j] + a[i+1][j +1];
              ret = (ret < s[i][j])? s[i][j]: ret;
            }

        printArray(s);



        return ret;
    }

    /**
     * Max sub-array of length = len
     * @param a
     * @param len
     * @return
     */
    int findMax(int[] a, int len){

        int ret = 0;
        int m = a.length;//rows


        int s[] = new int[a.length - len + 1];

        for(int i = 0; i < a.length - len +1; i++) {
            int sum = 0;
            for (int j = i; j < i + len; j++) {
                sum += a[j];
            }

            ret = (ret < sum) ? sum : ret;

        }
        return ret;
    }

    public static void main(String args[]){

        int a[][] = {
                {1,2,3,4,100},
                {5,6,7,8,100},
                {9,10,11,12,100},
                {13,14,15,16,100}
        };

        int b[] = {1,2,3,4,5,6,7};

        int c[][] = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        MaxSubArray msa = new MaxSubArray();

        int sm = 2;
        int sn = 2;

        int max2d = msa.findMax(c, sm, sn);

        System.out.println("max2d: " + max2d);

        int max1d = msa.findMax(b,2);

        System.out.println("max1d: " + max1d);

    }
}
