package com.algos.leetcode.easy;

import java.util.Scanner;

/**
 * #35
 * https://leetcode.com/problems/search-insert-position/
 */
public class SearchInsertPosition {


    static  Integer binSearch(int a[], int lo, int hi, int targ){

        Integer ret = null;

        if(lo<=hi) {

            int mid = lo + (hi - lo) / 2;

            if (a[mid] == targ) {

                ret = mid;
                return ret;
            } else if (a[mid] < targ) {


                return binSearch(a, mid + 1, hi, targ);
            } else if (a[mid] > targ) {


                return binSearch(a, lo, mid - 1, targ);
            }

        }

        //not found
        //return lo
        ret = lo ;
        return ret;


    }


    static Integer findIndex(int a[], int targ){

        return binSearch(a, 0, a.length - 1, targ);


    }


    public static void main(String args[]){

        Scanner input  = new Scanner(System.in);

        System.out.println("Number of inputs: ");

        int N = input.nextInt();

        System.out.println("Enter digits: ");

        int a[] = new int[N];

        for(int i = 0; i < N; i++){
            a[i] = input.nextInt();
        }


        System.out.println("Enter search target: ");

        int T = input.nextInt();

        System.out.println(binSearch(a, 0, a.length - 1, T));


    }
}
