package com.algos.dailycoding;

import java.util.Scanner;

/**
 *
 * 3/10/2019
 *
 Good morning! Here's your coding interview problem for today.

 This problem was asked by Stripe.

 Given an array of integers, find the first missing positive integer in linear time and constant space. In other words, find the lowest positive integer that does not exist in the array. The array can contain duplicates and negative numbers as well.

 For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

 You can modify the input array in-place.
 */
public class MissingPosInt {

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of inputs: ");

        int N = input.nextInt();

        int a[] = new int[N];

        System.out.println("Enter n pos/neg ints: ");

        for(int i =0; i < N; i++){

            a[i] = input.nextInt();
        }

    }
}
