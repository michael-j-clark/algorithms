package com.algos.search;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RollingHash {


    Integer hash(char a[], int len, int start){

        int h = 0;

        for(int i = start; i < start + len; i++){

            h += a[i]*31;
        }

        return h;
    }


    public static void main(String args[]){

        RollingHash rh = new RollingHash();

        Map<Integer, String> map = new HashMap<Integer, String>();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter string: ");

        String str = input.nextLine();

        System.out.println("Enter pattern: ");

        String pat = input.nextLine();

        Integer patlen = pat.length();

        Integer strlen = str.length();

        Integer targHash = rh.hash(pat.toCharArray(), patlen, 0);

        int fCount = 0;

        for(int i = 0; i < strlen - patlen + 1; i++){

            Integer curHash = rh.hash(str.toCharArray(),  patlen, i);

            map.put(curHash, str.substring(i, i + patlen));

            //System.out.println(str.substring(i, i + patlen));
        }

        String targ = map.get(targHash);

        if(targ!=null && targ.equals(pat)){
            System.out.println("FOund it");
        }else{
            System.out.println("Not found");
        }




    }
}
