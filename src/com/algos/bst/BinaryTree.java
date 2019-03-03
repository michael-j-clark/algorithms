package com.algos.bst;

import java.util.*;
import java.util.function.Predicate;

/**
 * https://www.utd.edu/~dheroy/4331code/book/BinaryTree.java
 */
public class BinaryTree {
    private Node root;
    private int size = 0;

    /**
     * Create a default binary tree
     */
    public BinaryTree() {
    }

    /**
     * Create a binary tree from an array of objects
     */
    public BinaryTree(Comparable[] objects) {
        for (int i = 0; i < objects.length; i++)
            insert(objects[i]);
    }

    /**
     * Insert element o into the binary tree
     * Return true if the element is inserted successfully
     */
    public boolean insert(Comparable o) {
        if (root == null)
            root = new Node(o); // Create a new root
        else {
            // Locate the parent node
            Node<Comparable> parent = null;
            Node<Comparable> current = root;
            while (current != null)
                if (o.compareTo(current.element) < 0) {
                    parent = current;
                    current = current.left;
                } else if (o.compareTo(current.element) > 0) {
                    parent = current;
                    current = current.right;
                } else
                    return false; // Duplicate node not inserted

            // Create the new node and attach it to the parent node
            if (((Comparable) o).compareTo(parent.element) < 0)
                parent.left = new Node(o);
            else
                parent.right = new Node(o);
        }

        size++;
        return true; // Element inserted
    }

    public boolean anotherInsert(Comparable o){


        if(null == root){

            root = new Node(o);
        }else{

            Node<Comparable> parent = null;
            Node<Comparable> cur = root;

            while(null != cur){

                if(o.compareTo(cur.element) < 0){

                    parent = cur;
                    cur = cur.left;

                }else if(o.compareTo(cur.element)> 0){

                    parent = cur;
                    cur = cur.right;
                }else{
                    //do not insert duplicate
                    return false;
                }
            }

            if(o.compareTo(parent.element)<0){

                parent.left = new Node(o);
            }else{

                parent.right = new Node(o);
            }
        }

        size++;

        return Boolean.TRUE;

    }

    public Boolean search(Comparable<?> o, Node<Comparable<?>> root) {

        if (null == root) return Boolean.FALSE;

        if (root.element.equals(o)) return Boolean.TRUE;

        return (search(o, root.left) || search(o, root.right));
    }

    /**
     * Inorder traversal
     */
    public void inorder() {
        inorder(root);
    }

    /**
     * Inorder traversal from a subtree
     */
    private void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.element + " ");
        inorder(root.right);
    }

    /**
     * Postorder traversal
     */
    public void postorder() {
        postorder(root);
    }

    /**
     * Postorder traversal from a subtree
     */
    private void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.element + " ");
    }

    /**
     * Preorder traversal
     */
    public void preorder() {
        preorder(root);
    }

    /**
     * Preorder traversal from a subtree
     */
    private void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.element + " ");
        preorder(root.left);
        preorder(root.right);
    }

    /**
     * Inner class tree node
     */
    private static class Node<T> {
        Comparable<?> element;
        Node left;
        Node right;

        public Node(Comparable<?> o) {
            element = o;
        }
    }

    /**
     * Get the number of nodes in the tree
     */
    public int getSize() {
        return size;
    }

 /*   public Node<Comparable> bfs(Comparable o, Predicate<Comparable> predicate) {
        Queue<Comparable> queue = new LinkedList<>();
        queue.offer(o);
        while (!queue.isEmpty()) {
            Comparable current = queue.poll();
            if (predicate.test(current.element)) return node;
            if (node.left != null) queue.offer(node.left);
            if (node.right != null) queue.offer(node.right);
        }
        return null;
    }

    public Node<Comparable> dfs(Node<Comparable> o, Predicate<Comparable> predicate) {
        Stack<Node<Comparable>> stack = new Stack<>();
        stack.push(o);
        while (!stack.isEmpty()) {
            Node<Comparable> node = stack.pop();
            if (predicate.test(node.element)) return node;
            if (node.right != null) stack.push(node.right);
            if (node.left != null) stack.push(node.left);
        }
        return null;
    }*/

    public void DFS(Node root) {
        Stack<Node> s = new Stack<Node>();
        s.add(root);

        while (s.isEmpty() == false) {
            Node x = s.pop();

            if (x.right != null) {
                //System.out.println("add" + x.right.element );
                s.add(x.right);
            }
            if (x.left != null) {
                //System.out.println("add " + x.left.element);
                s.add(x.left);
            }

            System.out.println(" " + x.element);
        }

    }

    public Boolean DFS(Node root, Comparable c) {
        //1) Create stack
        Stack<Node> s = new Stack<Node>();
        //2)Add root
        s.add(root);

        //3) Crawl stack until non-empty
        while (s.isEmpty() == false) {
            //4)Pop top
            Node x = s.pop();

            //5) If we find the target, return true
            if(x.element.compareTo(c) == 0){
                return Boolean.TRUE;
            }

            //6)If right Node exists, add to stack
            if (x.right != null) {
                //System.out.println("add" + x.right.element );
                s.add(x.right);
            }
            //7)If left...
            if (x.left != null) {
                //System.out.println("add " + x.left.element);
                s.add(x.left);
            }
        }

        //8)Not found
        return Boolean.FALSE;

    }

    public void BFS(Node root) {
        Queue<Node> s = new LinkedList<Node>();
        s.add(root);
        while (s.isEmpty() == false) {
            Node x = s.poll();

            if (x.left != null) {

                s.add(x.left);
            }

            if (x.right != null) {

                s.add(x.right);
            }

            System.out.println(" " + x.element);
        }
    }

    Node reverse(Node t) {
        if (t == null) {
            return t;
        }
        Node tmp = t.left;
        t.left = reverse(t.right);
        t.right = reverse(tmp);
        return t;
    }

    Boolean isEqual(Node t1, Node t2) {

        if(t1 != null && t2!= null && t1.element.compareTo(t2.element)!=0){
            return false;
        }

        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        return isEqual(t1.left, t2.left) && isEqual(t1.right, t2.right);
    }

    public Node lowestCommonAncestor(Node root, Node p, Node q) {

        // Stack for tree traversal
        Deque<Node> stack = new ArrayDeque<>();

        // HashMap for parent pointers
        Map<Node, Node> parent = new HashMap<>();

        parent.put(root, null);
        stack.push(root);

        // Iterate until we find both the nodes p and q
        while (!parent.containsKey(p) || !parent.containsKey(q)) {

            Node node = stack.pop();

            // While traversing the tree, keep saving the parent pointers.
            if (node.left != null) {
                parent.put(node.left, node);
                stack.push(node.left);
            }
            if (node.right != null) {
                parent.put(node.right, node);
                stack.push(node.right);
            }
        }

        // Ancestors set() for node p.
        Set<Node> ancestors = new HashSet<>();

        // Process all ancestors for node p using parent pointers.
        while (p != null) {
            ancestors.add(p);
            p = parent.get(p);
        }

        // The first ancestor of q which appears in
        // p's ancestor set() is their lowest common ancestor.
        while (!ancestors.contains(q))
            q = parent.get(q);
        return q;
    }

    public int height() {
        return height(root);
    }
    private int height(Node x) {
        if (x == null) return -1;
        return 1 + Math.max(height(x.left), height(x.right));
    }


    public static void main(String args[]) {

        Integer a[] = new Integer[]{50, 30, 90, 40, 12, 100, 86};

        BinaryTree bst = new BinaryTree(a);

        //System.out.println("search 9: " + bst.search(new Integer(9), bst.root));

        //System.out.println("search 76: " + bst.search(new Integer(76), bst.root));

        //bst.DFS(bst.root);
        //bst.BFS(bst.root);
        //bst.inorder();

        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.right = new Node(6);
        root.left.right = new Node(3);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        Node root2 = new Node(4);
        root2.left = new Node(2);
        root2.left.left = new Node(1);
        root2.right = new Node(6);
        root2.left.right = new Node(3);
        root2.right.left = new Node(5);
        root2.right.right = new Node(7);
        //root2.right.right.right = new Node(9);
        //System.out.println(bst.isEqual(root, root2));

        bst.root = root;
        BinaryTree bst2 = new BinaryTree();
        bst2.root = root2;
        //bst2.reverse(bst2.root);


        //System.out.println("Depth-First-Search : ");
        //bst.DFS(root);

        System.out.println(bst.height(root2));
        //bst.inorder();
        //bst2.inorder();

    }
}