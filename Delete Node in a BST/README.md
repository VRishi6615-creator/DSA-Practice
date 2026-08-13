# Delete Node in a BST (LeetCode 450)

## Problem Statement

Given the root node of a Binary Search Tree (BST) and an integer key, delete the node with the given key from the BST and return the root of the updated tree.

The BST property must remain valid after deletion.

## My Approach

I solved this problem using recursion.

First, I search for the node containing the given key by comparing the key with the current node's value.

* If the key is smaller, I move to the left subtree.
* If the key is greater, I move to the right subtree.

When the node to delete is found, I handle three cases:

* If the node has no children, I return null.
* If the node has only one child, I return that child.
* If the node has two children, I find the inorder successor (the smallest node in the right subtree), copy its value to the current node, and then delete the inorder successor from the right subtree.

I used a helper function to find the inorder successor by repeatedly moving to the left child of the right subtree.

Finally, I return the current node so that the updated tree remains connected correctly.

## Analysis

Time Complexity: O(h)

Space Complexity: O(h)
