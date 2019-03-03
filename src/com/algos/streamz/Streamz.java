package com.algos.streamz;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Streamz {


    void arrToCollection(){

        int a[] = {1,2,3,4};


        List<Integer> lst = Arrays.stream(a).boxed().collect(Collectors.toList());
    }


    public static void main(String args[]){

        Streamz s = new Streamz();


        s.arrToCollection();
    }
}
