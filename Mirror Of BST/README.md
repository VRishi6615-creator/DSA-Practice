# Mirror of a Binary Tree

## Problem Statement

Given the root of a binary tree, convert the tree into its mirror by swapping the left and right subtrees of every node.

## My Approach

I solved this problem using recursion.

For every node, I first recursively find the mirror of its left and right subtrees.

The mirror of the left subtree becomes the right subtree, and the mirror of the right subtree becomes the left subtree.

I store both recursive results in leftMirror and rightMirror, then swap them by assigning rightMirror to root.left and leftMirror to root.right.

If the current node is null, I return null.

Finally, I return the current root after the left and right subtrees have been swapped.

## Analysis

Time Complexity: O(n)

Space Complexity: O(h)
