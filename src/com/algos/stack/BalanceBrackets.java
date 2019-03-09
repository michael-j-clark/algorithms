package com.algos.stack;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BalanceBrackets {

    enum CloseOpen{

        CLOSED(41,93,125), OPEN(40,91,123);

        private CloseOpen(Integer ... a){

            for(Integer i: a){

                characters.add(i);
            }
        }

        public Boolean inSet(Integer n){

            if(null != characters && characters.contains(n)){
                return Boolean.TRUE;
            }

            return Boolean.FALSE;
        }

        private Set<Integer> characters = new HashSet<Integer>();
    }

    /**
     * 40: (
     * 41: )
     * 91: ]
     * 93: [
     * 123: {
     * 125: }
     * @param a
     * @return
     */
    static Boolean isBalanced(char a[]){

        java.util.Stack<Integer> s = new java.util.Stack<Integer>();



        for(int i = 0; i < a.length; i++){

            Integer aInt = new Integer(a[i]);

            if(CloseOpen.OPEN.inSet(aInt)){

                s.push(aInt);

            }else if(CloseOpen.CLOSED.inSet(aInt)){

                if(s.empty()){

                    //not balanced
                    return Boolean.FALSE;
                }

                Integer fromTop = s.peek();
                s.pop();

                if(fromTop.intValue()!=aInt.intValue()-2||(fromTop.intValue()==40&&aInt.intValue()==41)){
                    //not balanced
                    return Boolean.FALSE;
                }

            }

        }

        if(!s.isEmpty()){
            return Boolean.FALSE;
        }

        return Boolean.TRUE;
    }

    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = input.nextLine();  // Read user input

        char strA[] = str.toCharArray();

        System.out.println(isBalanced(strA));


    }
}
