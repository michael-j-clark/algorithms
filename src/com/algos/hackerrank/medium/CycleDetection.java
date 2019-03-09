package com.algos.hackerrank.medium;

/**
 * https://www.hackerrank.com/challenges/
 * detect-whether-a-linked-list-contains-a-cycle
 * /problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
 */
public class CycleDetection {

    //got 5/5 for this

    /*static boolean hasCycle(SinglyLinkedListNode head) {

        boolean ret = false;


        SinglyLinkedListNode cur = head;

        Set<Integer> hsSet = new HashSet<Integer>();

        while(null!=cur){

            if(!hsSet.add(cur.hashCode())){

                ret = true;
                break;
            }

            cur = cur.next;
        }
        return ret;
    }*/
}
