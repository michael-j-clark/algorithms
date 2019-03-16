package com.algos.dailycoding;

import java.util.Scanner;

/**
 * 3/9/2019
 *
 *
 Good morning! Here's your coding interview problem for today.

 This problem was asked by Google.

 Given the root to a binary tree, implement serialize(root), which serializes the tree into a string, and deserialize(s), which deserializes the string back into the tree.

 For example, given the following Node class

 class Node:
 def __init__(self, val, left=None, right=None):
 self.val = val
 self.left = left
 self.right = right
 The following test should pass:

 node = Node('root', Node('left', Node('left.left')), Node('right'))
 assert deserialize(serialize(node)).left.left.val == 'left.left'
 *
 */
public class SerializeBST {


    public SerializeBST(int a[]){

        for(int i = 0; i < a.length; i++){

            insert(a[i]);
        }
    }

    Node root = null;

    private static class Node<Comparable>{

        public Node(Comparable c){

            element = c;
        }

        Node<Comparable> left;
        Node<Comparable> right;

        Comparable element;
    }

    void insert(Comparable element){

        if(null == root){

            root = new Node(element);
        }else{

            Node parent = null;
            Node<Comparable> cur = root;

            while(null != cur){

                if(element.compareTo(cur.element) < 0){

                    parent = cur;
                    cur = cur.left;

                }else if(element.compareTo(cur.element) > 0){

                    parent = cur;
                    cur = cur.right;
                }else return;
            }

            if(element.compareTo(parent.element)< 0){

                parent.left = new Node(element);
            }else{

                parent.right = new Node(element);

            }

        }

    }

    void inorder(Node node){

        if(null == node) return;

        inorder(node.left);
        System.out.println(node.element);
        inorder(node.right);
    }



    public static void main(String args[]){

        Scanner input = new Scanner(System.in);

        System.out.println("Number of nodes: ");

        int N  = input.nextInt();

        int a[] = new int[N];

        System.out.println("Node values separated by spaces: ");

        for(int i = 0; i < N; i++){

            a[i] = input.nextInt();
        }

        SerializeBST sb = new SerializeBST(a);


        System.out.println(sb.root.element);

        sb.inorder(sb.root);




    }

}
