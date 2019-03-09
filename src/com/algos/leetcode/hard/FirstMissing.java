package com.algos.leetcode.hard;


import java.util.Arrays;
import java.util.Scanner;

/**
 * #41
 * https://leetcode.com/problems/first-missing-positive/
 */
public class FirstMissing {

    static Integer firstMissing2(Integer a[]) {

        int ret = Integer.MIN_VALUE;



        if(a[0] > 1){
            return 1;
        }else if(a.length == 1){

            if(a[0] > 0)
                return a[0] + 1;
            else
                return 1;
        }


        for(int i = 0; i < a.length; i++){

            if(a[i] < 1  && i == a.length - 1){

                return 1;
            }else if(a[i] >= 1  && i == a.length - 1) {

                return a[i] + 1;
            }else{

                if(a[i+1]!= a[i] + 1 && a[i]>0
                        ){

                    ret = a[i] + 1;
                    break;
                }

            }



        }

        return ret;
    }

    static Integer firstMissing(Integer a[]) {

        if(a.length == 0) return 1;

        int ret = 0;

        for (int i = 0; i < a.length; i++) {

            for (int j = a.length - 1; j > i; j--) {

                if (a[j] < a[j - 1]) {

                    int tmp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = tmp;
                }
            }
        }

        //System.out.println(Arrays.toString(a));

        int min = a[0];

        if(min>0) return 1;

        int max = a[a.length - 1];

        boolean b[] = new boolean[max - min+ 1];

        for (int i = 0; i < a.length; i++) {
            if (min < 0)
                b[a[i] + Math.abs(min)] = true;
                //else if (min == 0) b[a[i]] = true;
            else
                b[a[i] - min
                        ] = true;
        }


        //System.out.println("b: " + Arrays.toString(b));

        boolean found = Boolean.FALSE;
        for (int i = 0; i < b.length; i++) {

            if (!b[i]) {
                if (min < 0 && (i - Math.abs(min)>0)){
                    ret = i - Math.abs(min);
                    found = true;
                    break;

                    //else if (min == 0) ret = i;
                }else if((i +min)>0){
                    ret = i + min;
                    found = true;
                    break;
                }

            }
        }

        if (!found)
            ret = max + 1;

        return ret;
    }

    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Number of digits: ");

        Integer D = input.nextInt();

        Integer a[] = new Integer[D];

        System.out.println("Enter consecutive digits with some missing: ");

        input.nextLine();
        String numStr = input.nextLine();

        String numStrA[] = numStr.split("\\s");

        for (int i = 0; i < numStrA.length; i++) {

            a[i] = Integer.parseInt(numStrA[i]);

        }


        System.out.println(firstMissing2(a));


    }
}
