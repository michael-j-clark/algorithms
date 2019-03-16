package com.algos.bst;

import com.algos.dailycoding.SerializeBST;

import java.util.Arrays;
import java.util.Scanner;

public class BinaryTreeArray {



    Integer tree[];

    Boolean insert(int val){

        int index = 0;

        Boolean ret = Boolean.FALSE;

        if(tree[0] == null){

            tree[0] = val;
        }else{

            while(index <= tree.length ) {

                int left_idx = index*2+1;
                int right_idx = index*2+2;

                if (null == tree[index]) {

                    tree[index] = val;
                    ret = Boolean.TRUE;
                } else if (left_idx < tree.length && val < tree[index]) {

                    if(tree[left_idx]==null){

                        tree[left_idx]=val;
                        ret = Boolean.TRUE;
                        break;

                    }else{

                        index=left_idx;
                    }

                } else if (right_idx < tree.length && val > tree[index]) {

                    if(tree[right_idx]==null){

                        tree[right_idx]=val;
                        ret = Boolean.TRUE;
                        break;

                    }else{

                        index=right_idx;
                    }
                } else {
                    return Boolean.FALSE;
                }
            }

        }

        return ret;

    }



    public static void main(String args[]){

        BinaryTreeArray bta = new BinaryTreeArray();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of nodes: ");

        int N = input.nextInt();

        int a[] = new int[N];

        bta.tree = new Integer[(int)Math.pow(2, N)];

        System.out.println("Enter values: ");

        for(int i = 0; i < N; i++){

            a[i] = input.nextInt();
        }

        for(int i = 0; i < a.length; i++){

            bta.insert(a[i]);
        }

        System.out.println(Arrays.toString(bta.tree));
    }



}
