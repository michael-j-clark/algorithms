package com.algos.fib;

import java.util.HashMap;
import java.util.Map;

public class MemoFib {


    private Map<Integer, Integer> memo = new HashMap<Integer, Integer>();




    public int memoFib(int n){

        if(n< 2) return n;


        if(memo.containsKey(n)){

            return memo.get(n);
        }

        Integer result = memoFib(n - 1) + memoFib(n - 2);

        memo.put(n, result);

        return result;

    }


    public static void main(String args[]){


        MemoFib mf = new MemoFib();

        System.out.println("memoFib(7): " +mf.memoFib(7));
    }
}
