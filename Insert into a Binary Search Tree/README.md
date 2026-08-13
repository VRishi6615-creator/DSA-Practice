# Insert into a Binary Search Tree (LeetCode 701)

## Problem Statement

Given the root node of a Binary Search Tree (BST) and a value to insert, insert the value into the BST and return the root of the BST.

The inserted value should be placed in the correct position according to the BST property.

## My Approach

I solved this problem using recursion.

If the current node is null, I create a new node with the given value and return it. Otherwise, I compare the value with the current node's value.

* If the value is smaller, I recursively insert it into the left subtree.
* If the value is greater, I recursively insert it into the right subtree.

After the insertion is completed, I return the current node so that the original tree structure remains connected while the new node is added at the correct position.

This approach follows the BST property at every step and eventually reaches the appropriate empty position for insertion.

## Analysis

Time Complexity: O(h)

Space Complexity: O(h)
