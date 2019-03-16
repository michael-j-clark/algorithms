package com.algos;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Return min number of swaps to segregate students
 * 1's or 0's to either side of array.
 */
public class SegregateStudents {


    void swap(int a[], int i, int j){

        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static int segregate(int students[]) {

        //more ones or more zeros
        int m = Arrays.stream(students).sum();

        boolean isOneHeavy = false;
        System.out.println("m: " + m);

        if (m > students.length / 2) {
            isOneHeavy = true;
        }

        if(isOneHeavy){
            //swap zeroes

        }else{

            //swap ones


        }

        return m;

    }


    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter number of students: ");

        int N = input.nextInt();

        int a[] = new int[N];

        System.out.println("Enter n students (0/1): ");

        for (int i = 0; i < N; i++) {

            a[i] = input.nextInt();
        }

        segregate(a);
    }
}
