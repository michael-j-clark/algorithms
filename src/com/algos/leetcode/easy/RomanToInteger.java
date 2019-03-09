package com.algos.leetcode.easy;

import java.util.Scanner;

public class RomanToInteger {

    /**
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     *
     * @param num
     * @return
     */
    static Integer toRoman(String num) {

        char numChars[] = num.toCharArray();

        int sum = 0;
        for (int i = numChars.length - 1; i >= 0; i--) {

            if (numChars[i] == 'M') {

                sum += 1000;

            } else if (numChars[i] == 'D') {
                sum += 500;
            } else if (numChars[i] == 'C') {
                sum += 100;
            } else if (numChars[i] == 'L') {
                sum += 50;
            } else if (numChars[i] == 'X') {
                sum += 10;
            } else if (numChars[i] == 'V') {
                sum += 5;
            } else if (numChars[i] == 'I') {
                sum += 1;
            }


        }

        return sum;
    }

    public static void main(String args[]) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter Roman numeral: ");

        String rn = input.nextLine();

        Integer num = toRoman(rn);

        System.out.println(num);
    }
}
