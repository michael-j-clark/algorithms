package com.algos.leetcode.easy;

import com.algos.linkedlistz.LinkedListz;

import java.util.*;

/**
 * https://leetcode.com/problems/merge-two-sorted-lists/
 */
public class MergeTwoSortedLists{


        static List<Integer> merge(List<Integer> l0, List<Integer> l1) {

            LinkedList<Integer> ret = new LinkedList<>();

            List<Integer> al0 = new ArrayList<Integer>(l0);

            List<Integer> al1 = new ArrayList<Integer>(l1);

            int j = 0;

            for(int i = 0; i < al0.size(); i++) {

                Integer icur = al0.get(0);

                for(;j < al1.size(); j++) {
                    Integer jcur = al1.get(0);

                    if(icur.compareTo(jcur)<0 ) {

                        ret.add(icur);

                    }else {

                        ret.add(jcur);
                        j++;
                        break;
                    }
                }



            }


            return ret;


        }

        public static void main(String args[]) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter list 0: ");

            String line0 = input.nextLine();

            System.out.println("Enter list 1: ");

            String line1 = input.nextLine();

            String line0Str[] = line0.split("\\s");

            String line1Str[] = line1.split("\\s");

            List<Integer> ll0 = new LinkedList<Integer>();

            List<Integer> ll1 = new LinkedList<Integer>();

            for (int i = 0; i < line0Str.length; i++) {


                Integer cur = Integer.parseInt(line0Str[i]);

                ll0.add(cur);

            }

            for (int i = 0; i < line1Str.length; i++) {

                Integer cur = Integer.parseInt(line1Str[i]);

                ll1.add(cur);

            }
        }
}
