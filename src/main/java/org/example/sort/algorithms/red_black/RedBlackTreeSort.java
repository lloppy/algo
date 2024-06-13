package org.example.sort.algorithms.red_black;


import org.example.sort.Sort;

import java.util.ArrayList;
import java.util.List;

import static org.example.sort.algorithms.red_black.Helper.*;


public class RedBlackTreeSort {
    private Node root;

    public int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }

        for (int value : array) {
            insert(value);
        }

        List<Integer> sortedList = new ArrayList<>();

        symmetricTraversal(root, sortedList);
        int[] sortedArray = new int[sortedList.size()];
        for (int i = 0; i < sortedList.size(); i++) {
            sortedArray[i] = sortedList.get(i);
        }

        return sortedArray;
    }

    private void insert(int data) {
        root = insert(root, data);
        root.isRed = false;
    }

    private Node insert(Node node, int data) {
        if (node == null) return new Node(data);

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else if (data > node.data) {
            node.right = insert(node.right, data);
        }

        if (isRed(node.right) && !isRed(node.left)) {
            node = rotateLeft(node);
        }
        if (isRed(node.left) && isRed(node.left.left)) {
            node = rotateRight(node);
        }
        if (isRed(node.left) && isRed(node.right)) {
            flipColors(node);
        }

        return node;
    }
}
