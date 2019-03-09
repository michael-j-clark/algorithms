package com.algos.linkedlistz;

public class LinkedListz<T> {

    public LinkedListz(){

        super();

    }

    public LinkedListz(Comparable element){

        head = new Node<Comparable>();
        head.element = element;

    }

    private Node<Comparable> head;
    private static class Node<T>{

        Node<T> next;
        T element;
    }

    Boolean add(Comparable element){

        Node<Comparable> cur = head;

        while(null!=cur) {

                if (null == cur.next) {
                    cur.next = new Node<Comparable>();
                    cur.next.element = element;
                    break;
                }else{
                    cur = cur.next;
                }
        }


        return Boolean.TRUE;

    }

    Boolean add(Comparable a[]){

       if(null!= a) {
           for (Comparable c : a) {
                add(c);
           }
       }

       return Boolean.TRUE;

    }

    int max(Node<Comparable> head){

        int ret = 0;

        Node<Comparable> cur = head;

        while(cur!=null){

            if(cur.element.compareTo(ret) > 0 )
                ret = (Integer)cur.element;
            cur = cur.next;
        }

        return ret;

    }

    void print(Node<T> head){

        if(null!=head){

            Node<T> cur = head;

            while(null!=cur){

                System.out.print(cur.element.toString());
                if(cur.next!=null)
                    System.out.print("~>");

                cur=cur.next;
            }
        }
    }



    public static void main(String args[]){

        System.out.println("hi");

        Comparable in0 = Integer.valueOf(1);
        Comparable in1 = Integer.valueOf(5);

        LinkedListz<Comparable> ll0 = new LinkedListz<Comparable>(in0);
        LinkedListz<Comparable> ll1 = new LinkedListz<Comparable>(in1);

        ll0.add(Integer.valueOf(2));

        ll0.add(Integer.valueOf(3));

        ll0.print(ll0.head);

        ll0.add(Integer.valueOf(1));

        int max = ll0.max(ll0.head);

        System.out.println("max: " + max);

    }
}
