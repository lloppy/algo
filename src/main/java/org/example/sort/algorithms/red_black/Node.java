package org.example.sort.algorithms.red_black;

public class Node {
    int data;
    Node left, right;
    boolean isRed;

    public Node(int data) {
        this.data = data;
        this.isRed = true;
    }
}