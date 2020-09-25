package com.engeto.binarytree;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinaryTreeTest {

    BinaryTree bt;

    @BeforeEach
    void createTree() {
        bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
    }

    @Test
    void inOrder() {
        assertThat(bt.inOrder()).isEqualTo("3456789");
    }
    @Test
    void inOrderTwice() {
        assertThat(bt.inOrder()).isEqualTo("3456789");
        assertThat(bt.inOrder()).isEqualTo("3456789");
    }

    @Test

    void preOrder() {
        assertThat(bt.preOrder()).isEqualTo("6435879");

    }
    @Test
    void preOrderTwice() {
        assertThat(bt.preOrder()).isEqualTo("6435879");
        assertThat(bt.preOrder()).isEqualTo("6435879");
    }

    @Test
    void postOrder() {
        assertThat(bt.postOrder()).isEqualTo("3547986");
    }
    @Test
    void postOrderTwice() {
        assertThat(bt.postOrder()).isEqualTo("3547986");
        assertThat(bt.postOrder()).isEqualTo("3547986");
    }
}