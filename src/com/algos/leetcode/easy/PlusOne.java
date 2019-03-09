package com.algos.leetcode.easy;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/plus-one/
 */
public class PlusOne {

    /*static Integer[] plusOne(Integer a[]){



    }*/


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of digits: ");
        Integer N = input.nextInt();

        Integer a[] = new Integer[N];

        System.out.println("Enter digits separated by space: ");

        int index  = 0;
        while(input.hasNext()){

            if(index>N-1) throw new RuntimeException("Too many inputs");

            a[index++] = input.nextInt();
        }

        //Integer res = plusOne(a);

    }
}
