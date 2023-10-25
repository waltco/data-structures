package org.example.binarytree.inorder;

import org.example.binarytree.TreeNode;

public class InOrder {
    public void traverse(TreeNode treeNode) {
        if (treeNode != null) {
            traverse(treeNode.left);
            System.out.println(treeNode.data);
            traverse(treeNode.right);
        }
    }
}
