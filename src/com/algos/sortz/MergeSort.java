package com.algos.sortz;

import java.util.Arrays;

public class MergeSort {


    public static void iterativeMergesortWithoutCopy(int[] a) {
        int[] from = a, to = new int[a.length];
        for (int blockSize=1; blockSize<a.length; blockSize*=2) {
            for (int start=0; start<a.length; start+=2*blockSize)
                mergeWithoutCopy(from, to, start, start+blockSize, start+2*blockSize);
            int[] temp = from;
            from = to;
            to = temp;
        }
        if (a != from)
            // copy back
            for (int k = 0; k < a.length; k++)
                a[k] = from[k];
    }

    public static int[] mergesort(int[] a) {
        int[] from = a, to = new int[a.length];
        for (int blockSize=1; blockSize<a.length; blockSize*=2) {
            for (int start=0; start<a.length; start+=2*blockSize)
                merge(from, to, start, start+blockSize, start+2*blockSize);
            //int[] temp = from;
            //from = to;
            //to = temp;
        }
        return from;
    }

    private static void mergeWithoutCopy(int[] from, int[] to, int lo, int mid, int hi) {
        // DK: cannot just return if mid >= a.length, but must still copy remaining elements!
        // DK: add two tests to first verify "mid" and "hi" are in range
        if (mid > from.length) mid = from.length;
        if (hi > from.length) hi = from.length;
        int i = lo, j = mid;
        for (int k = lo; k < hi; k++) {
            if      (i == mid)          to[k] = from[j++];
            else if (j == hi)           to[k] = from[i++];
            else if (from[j] < from[i]) to[k] = from[j++];
            else                        to[k] = from[i++];
        }
        // DO NOT copy back
        // for (int k = lo; k < hi; k++)
        //   a[k] = aux[k];
    }

    static void merge(int from[], int to[], int lo, int mid, int hi){

        if(mid> from.length) mid = from.length;
        if(hi>from.length) hi = from.length;

        int i = lo, j = mid;

        for(int k = lo; k < hi; k++) {

            if (i == mid) to[k] = from[j++];
            else if (i == hi) {to[k] = from[i++];}
            else if(from[j] < from[i]) {to[k] = from[j++];}
            else{
                to[k] = from[i++];
            }

        }
    }


    public static void main(String args[]){

        int a[] = {4, 3, 6, 87, 2};

        int to[] = new int[a.length];



        mergesort(a);

        System.out.println(Arrays.toString(a));

    }
}
