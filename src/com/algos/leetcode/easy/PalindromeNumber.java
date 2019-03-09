package com.algos.leetcode.easy;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    static Boolean isPalindrome(Integer x){


        String numStr = String.valueOf(x);

        char c[] = numStr.toCharArray();

        for(int i=0, j = numStr.length() - 1; i < j; i++, j--){

            char left = c[i];
            char right = c[j];

            if(left!=right) return false;
        }

        return Boolean.TRUE;

    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number: ");

        String numStr = input.nextLine();

        Integer num = Integer.parseInt(numStr);

        if(num>0){

            Boolean isPalindrome = isPalindrome(num);

            if(Boolean.TRUE.equals(isPalindrome)){

                System.out.println("Is");
            }else{

                System.out.println("Not");
            }


        }else{
            System.out.println("Not");
        }
    }
}
