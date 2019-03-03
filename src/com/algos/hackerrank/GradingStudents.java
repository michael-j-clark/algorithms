package com.algos.hackerrank;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

/**
 * First arg is number of inputs, each input on a new line
 *
 * https://www.hackerrank.com/challenges/grading/problem
 */
public class GradingStudents {

    /*
     * Complete the gradingStudents function below.
     */
    static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */

        for(int i = 0; i < grades.length; i++){

            if(grades[i]<38) continue;

            for(int j = grades[i]; j < grades[i] + 3; j++) {

                if (j % 5 == 0) {
                    grades[i] = j;
                    break;
                }
            }
        }

        return grades;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(scan.nextLine().trim());

        int[] grades = new int[n];

        for (int gradesItr = 0; gradesItr < n; gradesItr++) {
            String nextLine = scan.nextLine().trim();

            if("".equals(nextLine)) continue;

            int gradesItem = Integer.parseInt(nextLine);
            grades[gradesItr] = gradesItem;
        }

        int[] result = gradingStudents(grades);

        for (int resultItr = 0; resultItr < result.length; resultItr++) {
            System.out.println(grades[resultItr]);
        }


    }
}

