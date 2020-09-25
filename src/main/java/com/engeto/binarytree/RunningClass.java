package com.engeto.binarytree;

public class RunningClass {
    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        /*bt.add(100);
        bt.add(20);
        bt.add(200);
        bt.add(10);
        bt.add(30);
        bt.add(150);
        bt.add(300);*/

        System.out.println(bt.inOrder());
        System.out.println(bt.inOrder());

        //bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println(bt.preOrder());
        System.out.println(bt.preOrder());
        //bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.println(bt.postOrder());
        System.out.println(bt.postOrder());
        //bt.traversePostOrder(bt.root);

    }
}
