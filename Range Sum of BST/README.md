# Range Sum of BST (LeetCode 938)

## Problem Statement

Given the root of a Binary Search Tree (BST) and two integers low and high, return the sum of values of all nodes with a value in the inclusive range [low, high].

## My Approach

I solved this problem using recursion and the properties of a Binary Search Tree.

I created a helper function that traverses the tree and keeps track of the current sum.

* If the current node is null, I return the sum.
* If the node's value lies within the range [low, high], I recursively process the left subtree, add the current node's value to the sum, and then process the right subtree.
* If the node's value is smaller than low, I only explore the right subtree because all values in the left subtree will also be smaller.
* If the node's value is greater than high, I only explore the left subtree because all values in the right subtree will also be greater.

By using the BST property, unnecessary subtrees are skipped, making the traversal more efficient.

## Analysis

Time Complexity: O(n)

Space Complexity: O(h)
