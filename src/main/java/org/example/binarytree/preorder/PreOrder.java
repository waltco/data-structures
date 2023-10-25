package org.example.binarytree.preorder;

import org.example.binarytree.TreeNode;

public class PreOrder {
    public void traverse(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.data);
            traverse(treeNode.left);
            traverse(treeNode.right);
        }
    }
}
