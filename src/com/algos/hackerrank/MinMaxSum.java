package com.algos.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MinMaxSum {

    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {

        List<Integer> lst = Arrays.stream(arr).boxed().collect(Collectors.toList());
        Collections.sort(lst);

        long min = 0;
        long max = 0;

        for(int i=0, j = arr.length - 1; i < arr.length-1; i++, j--){

            min += arr[i];
            max += arr[j];
        }

        System.out.println(min+" "+max);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}