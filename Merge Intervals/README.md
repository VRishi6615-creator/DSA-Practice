# Merge Intervals (LeetCode 56)

## Problem

Given an array of intervals where `intervals[i] = [start, end]`, merge all overlapping intervals and return an array of the non-overlapping intervals that cover all the intervals in the input.

---

## My Approach

The key observation is that overlapping intervals can only be identified efficiently if the intervals are processed in sorted order.

Therefore, I first sort all the intervals based on their starting value. After sorting, any overlapping intervals will appear next to each other.

I maintain two variables:

* `start` → Starting point of the current merged interval.
* `end` → Ending point of the current merged interval.

I then iterate through the remaining intervals.

* If the next interval starts before or at the current `end`, the intervals overlap.

  * Update `end` to the maximum ending value.
* Otherwise, the current merged interval is complete.

  * Store it in the answer array.
  * Start a new interval using the current interval.

After the traversal is complete, the final merged interval is added to the answer.

Since the answer array is initially created with the maximum possible size (`arr.length`), I use `Arrays.copyOf()` to return only the portion that contains valid merged intervals.

## Complexity Analysis

### Time Complexity

* Sorting: **O(n log n)**
* Traversing the intervals: **O(n)**

**Overall:** `O(n log n)`

---

### Space Complexity

* Result array: **O(n)**
* Extra variables: **O(1)**

**Overall:** `O(n)`
