package com.playground.treegame;

public class BinaryTree {

    static Tree root;

    public Tree sortedArrayToBST(final int[] arr, final int start, final int end) {

        if (start > end) {
            return null;
        }

        final int mid = (start + end) / 2;
        final Tree tree = new Tree(arr[mid]);

        tree.setLeft(this.sortedArrayToBST(arr, start, mid - 1));
        tree.setRight(this.sortedArrayToBST(arr, mid + 1, end));

        return tree;
    }
}
