package com.playground.treegame;

public class Tree {
    private int data;
    private Tree left;
    private Tree right;

    public Tree(final int data, final Tree left, final Tree right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Tree(final int data) {
        this.data = data;
        this.left = this.right = null;
    }

    public int getData() {
        return this.data;
    }

    public void setData(final int data) {
        this.data = data;
    }

    public Tree getLeft() {
        return this.left;
    }

    public void setLeft(final Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return this.right;
    }

    public void setRight(final Tree right) {
        this.right = right;
    }
}
