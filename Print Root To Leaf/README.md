# Binary Tree Paths (Root to Leaf)

## Problem Statement

Given the root of a binary tree, print all paths from the root node to every leaf node.

Each path should contain the sequence of node values from the root to a leaf.

## My Approach

I solved this problem using recursion and backtracking.

I maintain an ArrayList that stores the current path from the root to the current node.

* If the current node is null, I return immediately.
* I add the current node's value to the list.
* If the current node is a leaf node, I print all values stored in the list.
* Then I recursively explore the left subtree and the right subtree.
* After exploring both subtrees, I remove the last element from the list before returning.

Removing the last element is the backtracking step. It ensures that when recursion returns to the parent node, the list contains only the path of that parent and can be reused for the next subtree.

## Analysis

Time Complexity: O(n)

Space Complexity: O(h)
