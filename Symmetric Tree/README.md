# Symmetric Tree (LeetCode 101)

## Problem Statement

Given the `root` of a binary tree, determine whether it is symmetric around its center.

A binary tree is symmetric if the left subtree is a mirror reflection of the right subtree.

---

## My Approach

I solved this problem using Recursion by comparing two nodes at a time instead of traversing the tree separately.

I created a helper function that takes two nodes (left and right) and checks whether they are mirror images of each other.

The recursive checks are:

* If both nodes are null, they are symmetric.
* If only one node is null, the tree is not symmetric.
* If the values of both nodes are different, return false.
* Otherwise:

  * Compare the left child of the left subtree with the right child of the right subtree.
  * Compare the right child of the left subtree with the left child of the right subtree.

If both recursive comparisons return true, the current pair of subtrees is symmetric.

Finally, the recursion starts by comparing the root's left and right children.

---

## Analysis

### Time Complexity

* Every node is visited exactly once.

**Overall:** O(n)

where n is the number of nodes in the tree.

### Space Complexity

* The recursive call stack depends on the height of the tree.

* **Balanced Tree:** O(log n)

* **Skewed Tree:** O(n)

where h is the height of the tree.
