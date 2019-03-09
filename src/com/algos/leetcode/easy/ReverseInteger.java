package com.algos.leetcode.easy;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    static void swap(char c[], int i, int j){

        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    static String reverseInt(Integer _int){


        String strInt = String.valueOf(_int);

        char charInt[] = strInt.toCharArray();

        for(int i = 0, j = charInt.length - 1; i <j; i++, j--){

            swap(charInt, i, j);
        }

        return String.valueOf(charInt);

    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter integer: ");

        String str = input.nextLine();

        Integer strInt = null;

        try{

            strInt = Integer.parseInt(str);

        }catch(NumberFormatException nfex){

            System.out.println("Not a number");
            System.exit(0);
        }

        String revInt = reverseInt(strInt);

        System.out.println(revInt);

    }
}
