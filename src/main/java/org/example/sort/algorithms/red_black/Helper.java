package org.example.sort.algorithms.red_black;

import java.util.List;

public class Helper {
    public static void symmetricTraversal(Node node, List<Integer> result) {
        if (node != null) {
            symmetricTraversal(node.left, result);
            result.add(node.data);
            symmetricTraversal(node.right, result);
        }
    }

    public static boolean isRed(Node node) {
        if (node == null) return false;

        return node.isRed;
    }

    public static Node rotateLeft(Node node) {
        Node temp = node.right;
        node.right = temp.left;
        temp.left = node;
        temp.isRed = node.isRed;
        node.isRed = true;

        return temp;
    }

    public static Node rotateRight(Node node) {
        Node temp = node.left;
        node.left = temp.right;
        temp.right = node;
        temp.isRed = node.isRed;
        node.isRed = true;

        return temp;
    }

    public static void flipColors(Node node) {
        node.isRed = true;
        node.left.isRed = false;
        node.right.isRed = false;
    }
}
