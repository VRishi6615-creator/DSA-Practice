# Validate Binary Search Tree (LeetCode 98)

## Problem Statement

Given the root of a binary tree, determine whether it is a valid Binary Search Tree (BST).

A valid BST must have all values in the left subtree smaller than the current node and all values in the right subtree greater than the current node.

## My Approach

I solved this problem using recursion with minimum and maximum boundaries.

For every node, I check whether its value is within the valid range.

Initially, the root has no minimum or maximum boundary.

For the left subtree, the current node becomes the maximum boundary because all values in the left subtree must be smaller than the current node.

For the right subtree, the current node becomes the minimum boundary because all values in the right subtree must be greater than the current node.

If a node violates either boundary, I return false. If all nodes satisfy their valid ranges, the tree is a valid BST.

## Analysis

Time Complexity: O(n)

Space Complexity: O(h)
