package org.example.binarytree.postorder;

import org.example.binarytree.TreeNode;

public class PostOrder {
    public void traverse(TreeNode treeNode) {
        if (treeNode != null) {
            traverse(treeNode.left);
            traverse(treeNode.right);
            System.out.println(treeNode.data);
        }
    }
}
