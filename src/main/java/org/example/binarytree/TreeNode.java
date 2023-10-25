package org.example.binarytree;

import lombok.AllArgsConstructor;
import lombok.Data;

public class TreeNode {
    public int data;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int data) {
        this.data = data;
    }
}
