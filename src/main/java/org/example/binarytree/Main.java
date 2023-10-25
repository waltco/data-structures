package org.example.binarytree;

import org.example.binarytree.inorder.InOrder;
import org.example.binarytree.postorder.PostOrder;
import org.example.binarytree.preorder.PreOrder;

public class Main {

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        System.out.println("-----PreOrder------");
        PreOrder preOrder = new PreOrder();
        preOrder.traverse(treeNode);
        System.out.println("-----InOrder------");
        InOrder inOrder = new InOrder();
        inOrder.traverse(treeNode);
        System.out.println("-----PostOrder------");
        PostOrder postOrder = new PostOrder();
        postOrder.traverse(treeNode);
    }
}
