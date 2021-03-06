package com.ltan.algorithm.utils;


/**
 * Detail: for algorithm TreeNode
 * <p>
 * Created by tanlin on 2019-09-30
 */
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode() {
    }
    public TreeNode(int v) {
        val = v;
    }
    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
