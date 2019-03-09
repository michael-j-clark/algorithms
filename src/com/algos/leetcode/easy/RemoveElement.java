package com.algos.leetcode.easy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {


    static int removeElement(Integer a[], Integer val){

        int ret = a.length;


        for(int i = 0; i < a.length; i++) {


            if (a[i].intValue() == val.intValue()) {

                ret--;
            }
        }

        return ret;

    }



    public static void main(String args[]){


        Scanner input = new Scanner(System.in);

        System.out.println(("Enter array of numbers: "));

        String str = input.nextLine();

        System.out.println(("Number to remove: "));

        Integer targ = input.nextInt();

        String aStr[] = str.split("\\s");

        Integer a[] = new Integer[aStr.length];

        for(int i = 0; i < aStr.length; i++){

            Integer cur = Integer.parseInt(aStr[i]);

            a[i] = cur;
        }

        removeElement(a, targ);

        System.out.println(removeElement(a, targ));

    }
}
