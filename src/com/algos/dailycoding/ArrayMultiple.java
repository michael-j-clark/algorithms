package com.algos.dailycoding;


import java.util.Arrays;
import java.util.Scanner;

/**
 * Good morning! Here's your coding interview problem for today.
 *
 * This problem was asked by Uber.
 *
 * Given an array of integers, return a new array such that each element at index i
 * of the new array is the product of all the numbers in the original array except the one at i.
 *
 * For example, if our input was [1, 2, 3, 4, 5], the expected output would be
 * [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
 *
 * Follow-up: what if you can't use division?
 */
public class ArrayMultiple {



    static int[] doMultiplication(int a[]){

        int ret[] = new int[a.length];
        for(int i = 0; i < a.length; i++){

            for(int j = 0; j < a.length; j++){

                System.out.println("a[" + i + " ], a["+j+"] : ("+a[i]+","+a[j]+")" );
                if(i!=j){

                    if(ret[i] == 0){
                        ret[i] = a[j];
                    }else{
                        ret[i] *= a[j];
                    }

                }
            }

        }
        return ret;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of inputs: ");

        int N = input.nextInt();

        int a[] = new int[N];

        System.out.println("Enter inputs separated by spaces: ");

        for(int i = 0; i < N; i++){

            a[i] = input.nextInt();
        }

        int res[] = doMultiplication(a);

        System.out.println(Arrays.toString(res));
    }
}
