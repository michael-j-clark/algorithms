package com.algos.stack;

import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Stack<T> {

    public Stack(){

        stack = new ArrayList<T>();
    }

    T pop(){

        T ret = null;
        try{

            ret = stack.get(index - 1);
            stack.remove(index - 1);
            index--;
        }catch(EmptyStackException aiobex){

            throw new RuntimeException("Empty stack exception");
        }

        return ret;
    }

    void push(T o){

        stack.add(o);
        index++;

    }


    List<T> stack = null;
    int index = 0;

    public static void main(String args[]){

        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        s.pop();
        s.pop();

        s.push(5);
        Integer one = s.pop();
        one = s.pop();

        //one = s.pop();

        System.out.println(one.toString());
    }


}
