package com.daily.binarytree;

import com.daily.binarytree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreeInorderTraversal_79 {

    class Solution {
        public List<Integer> inorderTraversal(TreeNode root) {
            if (root ==null) return null;

            Stack<TreeNode> q = new Stack();

            List<Integer> res = new ArrayList();

            TreeNode node =  root;

            while(node!= null || !q.isEmpty()) {
                while(node != null) {
                    q.push(node);
                    node = node.left;
                }
                node = q.pop();
                res.add(node.val);
                node = node.right;
            }

            return res;
        }
    }


}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
