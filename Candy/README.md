# Candy (LeetCode 135)

## Difficulty

Hard

## Topics

* Greedy
* Arrays

## Problem Link

https://leetcode.com/problems/candy/

---

## Approach 1: Left and Right Arrays

### Idea

* Traverse from left to right.
* If the current child has a higher rating than the previous child, give one more candy.
* Traverse from right to left.
* Take the maximum candies required from both directions.

### Time Complexity

* O(n)

### Space Complexity

* O(n)

---

## Approach 2: Optimal Greedy (Constant Space)

### Idea

This approach treats the ratings as:

* Increasing slope
* Decreasing slope
* Equal ratings

For an increasing sequence, keep increasing the candy count.

For a decreasing sequence, count the length of the downward slope and adjust the peak candy if necessary.

If the decreasing sequence is longer than the increasing sequence, the peak child must receive extra candies.

### Time Complexity

* O(n)

### Space Complexity

* O(1)

---

## Patterns Used

* Greedy
* Peak and Valley Technique
* Two Pass Traversal
* Slope Analysis

---

## My Learning

Initially, I solved the problem using left and right arrays.

Later, I optimized it to an O(1) space greedy solution by analyzing increasing and decreasing slopes.
