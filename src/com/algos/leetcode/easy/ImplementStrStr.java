package com.algos.leetcode.easy;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {


    static int strStr(String line, String c){

        int ret = -1;
        char ca[] = line.toCharArray();

        char targ = c.trim().charAt(0);

        for(int i = 0; i < ca.length; i++){

            if(ca[i]==targ)
            {
                ret = i;
                break;
            }
        }

        return ret;


    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println(("Enter string: "));

        String line = input.nextLine();

        System.out.println("Enter character to find: ");

        String c = input.nextLine();

        System.out.println(strStr(line, c));


    }
}
