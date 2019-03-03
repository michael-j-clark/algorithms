package com.algos.search;

import java.util.Arrays;

public class QuickSort<T> {

    void swap(Comparable<?> a[], int i, int j){

        Comparable<?> tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    int partition(Comparable a[], Integer left, Integer right){

        if(left>= right) return left;

        int i = left - 1;
        int j = right;

        while( true) {

            while (a[++i].compareTo(a[right]) < 0) {

            }
            while (a[right].compareTo(a[--j]) < 0) {
                if (j == left) break;

            }

            if(i>= j) break;

            swap(a, i, j);
        }

        swap(a, i, right);

        return i;
    }

    void sort ( Comparable<Integer> a[]){

        boolean sorted[] = new boolean[a.length];
        int sortedCount = 0, j = 0;

        while(sortedCount < a.length){

            for(int i = 0; i < a.length; i++){

                if(!sorted[i]){

                    for(j = i; j < a.length - 1 && !sorted[j + 1]; j++);
                    sorted[i = partition(a, i, j)] = true;
                    sortedCount++;
                }
            }
        }

    }

    public static void main(String args[]){

        Integer a[] = new Integer[]{4,2,6,4,86,2};

        QuickSort<Integer> qs = new QuickSort<Integer>();

        qs.sort(a);

        System.out.println(Arrays.toString(a));




    }

}
