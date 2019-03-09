package com.algos.leetcode.medium;


import java.util.Arrays;
import java.util.Scanner;

/**
 * #31
 * https://leetcode.com/problems/next-permutation/
 */
public class NextPermutation {


    static void swap(int a[], int i, int j){

        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static void nextPerm(int nums[]){

        boolean madeSwap = false;

        for(int i = nums.length - 1; i>0; i--){

            if(nums[i]>nums[i-1]){

                swap(nums, i, i-1);
                madeSwap = true;
                break;
            }

        }

        if(!madeSwap){

            for(int i = 0, j = nums.length - 1; i<j; i++, j--){

                swap(nums, i, j);
            }
        }
    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Number of inputs: ");

        int N = input.nextInt();

        int nums[] = new int[N];

        for(int i = 0; i < N; i++){

            nums[i] = input.nextInt();
        }

        nextPerm(nums);

        System.out.println(Arrays.toString(nums));
    }
}
