package com.algos.stringz;

import java.util.Arrays;

public class Reverse {


     static void  swap(char c[], int i, int j){

         char tmp = c[i];
         c[i] = c[j];
         c[j] = tmp;
     }

     static String recReverse(String s){

         if(null == s || s.equals("")){

             return "";
         }

         return recReverse(s.substring(1)) + s.charAt(0);
     }


    public static void main(String args[]){

        String s = "reverse";

        char c[] = s.toCharArray();

        int i = 0, j = c.length - 1;

        while( true){

            swap(c, i, j);
            i++;
            j--;
            if(i>=j) break;
        }

        String res = String.valueOf(c);

        String recRes = recReverse(s);

        System.out.println("res: " + res);

        System.out.println("recRes: " + recRes);

    }
}
