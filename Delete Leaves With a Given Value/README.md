# Delete Leaves With a Given Value (LeetCode 1325)

## Problem Statement

Given the root of a binary tree and an integer target, delete all leaf nodes whose value is equal to the target.

After deleting a leaf node, its parent may become a new leaf. If its value is also equal to the target, it should also be deleted. Repeat this process until no more such leaf nodes exist.

## My Approach

I solved this problem using postorder recursion.

The idea is to process the left and right subtrees before checking the current node. First, I recursively remove all target leaf nodes from both subtrees. After the recursive calls return, I check whether the current node has become a leaf.

If both left and right children are null and the current node's value is equal to the target, I return null to delete the node. Otherwise, I return the current node.

Processing the children before the parent ensures that newly formed leaf nodes are also checked and removed if needed.

## Analysis

Time Complexity: O(n)

Space Complexity: O(h)
