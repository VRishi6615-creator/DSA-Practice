# Jump Game (LeetCode 55)

## Problem

Given an integer array `nums`, where each element represents the maximum jump length from that position, determine whether it is possible to reach the last index starting from the first index.

---

## My Approach

This is a **completely self-derived solution**. I solved this problem without using any editorial, YouTube explanation, or AI assistance.

Instead of tracking the farthest reachable index (the common greedy approach), I introduced a variable named `curr` to represent the **remaining jump power** available while traversing the array.

### Idea

* Initialize `curr` with the jump value of the first element.
* Move one position at a time.
* Every move consumes one unit of jump power (`curr--`).
* If the next position provides a jump that is greater than or equal to my current remaining jump power, update `curr` with that new jump value.
* If the remaining jump power becomes zero before reaching the last index, it is impossible to continue, so return `false`.
* If the traversal reaches the end successfully, return `true`.

This approach continuously keeps track of the best jump power available while moving through the array.

---

## Complexity Analysis

* **Time Complexity:** `O(n)`
* **Space Complexity:** `O(1)`
