package com.daily.binarytree;

import com.daily.binarytree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTreePostorderTraversa_145 {

    /**
     * 后序遍历非递归
     */
    class Solution {

        public List<Integer> postorderTraversal(TreeNode root) {
            if (root ==null) return null;

            Stack<TreeNode> stack = new Stack();
            List<Integer> res = new ArrayList();

            stack.add(root);

            while (!stack.isEmpty()) {
                TreeNode node =  stack.pop();
                res.add(0, node.val);

                if (node.left != null) stack.add(node.left);
                if (node.right != null) stack.add(node.right);

            }

            return res;
        }
    }
}

