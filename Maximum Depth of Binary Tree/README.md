# Maximum Depth of Binary Tree (LeetCode 104)

## Problem

Given the `root` of a binary tree, return its **maximum depth**.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

---

## My Approach

I solved this problem using **Recursion (Depth-First Search)**.

The idea is simple:

* Every node asks its left subtree for its maximum depth.
* Every node asks its right subtree for its maximum depth.
* The current node's depth is the larger of the two depths plus one (for the current node itself).

The recursion naturally continues until it reaches a `null` node, which represents the end of a branch.

---

## Complexity Analysis

### Time Complexity

Every node is visited exactly once.

**Overall:** `O(n)`

where `n` is the number of nodes in the tree.

---

### Space Complexity

The recursive call stack depends on the height of the tree.

* **Balanced Tree:** `O(log n)`
* **Skewed Tree:** `O(n)`


