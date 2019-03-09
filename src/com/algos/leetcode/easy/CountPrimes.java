package com.algos.leetcode.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://leetcode.com/problems/count-primes/
 */
public class CountPrimes {

    static List<Integer> findPrimes(Integer x){

        List<Integer> primes = new ArrayList<Integer>();

        if(x.intValue()>=2)
            primes.add(2);
        if(x.intValue()>=3)
            primes.add(3);

        for(int i = 5; i <= x; i++){

            Boolean flag = Boolean.TRUE;
            for(int j = 2; j < i/2; j++){

                if(i % j == 0){
                    flag = Boolean.FALSE;
                }
            }

            if(Boolean.TRUE.equals(flag)){
                primes.add(i);
            }
        }

        return primes;
    }


    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Input upper bound(inclusive): ");

        Integer ub = input.nextInt();

        List<Integer> primes = findPrimes(ub);

        for(int i = 0; i < primes.size(); i++){

            System.out.print(primes.get(i)+" ");
        }
    }
}
