package com.engeto.binarytree;

public class BinaryTree {
    Node root;
    String treePrint = "";


    public BinaryTree() {
        root = null;
    }

    private Node addNode(Node current, int value) {
        if (current == null) {
            return new Node(value);
        }
        if (value < current.value) {
            current.left = addNode(current.left, value);
        } else if (value > current.value) {
            current.right = addNode(current.right, value);
        } else {
            return current;
        }
        return current;
    }

    public void add(int value) {
        root = addNode(root, value);
    }

    private void clearThePrint() {
        treePrint = "";

    }

    private String inOrder(Node root) {

        if (root != null) {
            inOrder(root.left);
            treePrint += root.value;
            inOrder(root.right);
        }
        return treePrint;
    }

    public String inOrder() {
        clearThePrint();
        return inOrder(root);
    }

    private String preOrder(Node root) {

        if (root != null) {
            treePrint += root.value;
            preOrder(root.left);
            preOrder(root.right);
        }
        return treePrint;
    }

    public String preOrder() {
        clearThePrint();
        return preOrder(root);
    }

    private String postOrder(Node root) {

        if (root != null) {
            postOrder(root.left);
            postOrder(root.right);
            treePrint += root.value;
        }
        return treePrint;
    }

    public String postOrder() {
        clearThePrint();
        return postOrder(root);
    }



    static class Node {
        int value;
        Node left;
        Node right;

        Node(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }
}
