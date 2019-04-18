package com.playground.treegame;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TreeService {

    public int treeGames(final Tree T) {
        final List<Integer> distList = new ArrayList<>();
        final List<Integer> distAmounts = new ArrayList<>();
        distList.add(T.getData());
        this.visitLeaf(T, distList, distAmounts);
        Collections.sort(distAmounts);
        return distAmounts.get(distAmounts.size()-1);
    }

    private void visitLeaf(final Tree leaf, final List<Integer> distList, final List<Integer> distAmounts) {
        this.checkList(distList, leaf.getData());
        if(leaf.getLeft() != null) {
            this.visitLeaf(leaf.getLeft(), distList, distAmounts);
        }
        if(leaf.getRight() != null) {
            this.visitLeaf(leaf.getRight(), distList, distAmounts);
        }
        if (leaf.getLeft() == null && leaf.getRight() == null) {
            distAmounts.add(distList.size());
            distList.remove(distList.size()-1);
        }
    }

    private void checkList(final List<Integer> distList, final int data) {
        if (!distList.contains(data)) {
            distList.add(data);
        }
    }

    public Tree convertArrayToBST() {
        final BinaryTree binaryTree = new BinaryTree();
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        return binaryTree.sortedArrayToBST(arr, 0, arr.length-1);
    }

}
