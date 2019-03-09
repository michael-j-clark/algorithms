package com.algos.leetcode.medium;

import java.util.Scanner;

/**
 * https://leetcode.com/problems/minimum-cost-for-tickets/
 */
public class MinTravelCost {

    static Integer minTravelCost(Integer days, Integer costs[]){

        int ret = 0;

        for(int i = days; i>0; i--){

            if(i>30){
                ret+=costs[2];
                i-=29;
            }else if(i>7){

                ret+=costs[1];
                i-=6;
            }else{

                ret+=costs[0];
            }
        }

        return ret;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Number of days (1~>365): ");

        int D = input.nextInt();

        System.out.println("Cost for [1,7,30] days (three values sep by space): ");

        Integer a[] = new Integer[3];
        a[0] = input.nextInt();
        a[1] = input.nextInt();
        a[2] = input.nextInt();

        System.out.println(minTravelCost(D, a));
    }
}
