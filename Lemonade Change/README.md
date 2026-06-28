# Lemonade Change (LeetCode 860)

## Problem

At a lemonade stand, each lemonade costs **$5**.

Customers pay using one of the following bills:

* `$5`
* `$10`
* `$20`

Initially, you have **no money**. Return `true` if you can provide the correct change to every customer in order; otherwise, return `false`.

---

## My Approach

The idea is to simulate the transaction for every customer while keeping track of the number of `$5` and `$10` bills currently available.

Since `$20` bills are never used to provide change in future transactions, there is no need to store their count.

For each customer:

* If the customer pays with **$5**, simply increase the count of `$5` bills.
* If the customer pays with **$10**, one `$5` bill must be returned as change.
* If the customer pays with **$20**, there are two possible ways to provide `$15` as change:

  1. One `$10` bill and one `$5` bill.
  2. Three `$5` bills.

The greedy choice is to **always prefer giving one `$10` and one `$5` whenever possible**. This preserves more `$5` bills, which are essential for making change for future customers.

If neither option is possible, return `false`.

---

## Intuition

The most important observation is that **$5 bills are the most valuable resource** because every type of change requires them.

When giving change for a `$20` bill:

* Giving one `$10` and one `$5` keeps more `$5` bills for future transactions.
* Using three `$5` bills unnecessarily reduces the ability to provide change later.

This greedy choice ensures the best chance of successfully serving all remaining customers.

---

## Complexity Analysis

### Time Complexity

* Single traversal of the array.

**Overall:** `O(n)`

---

### Space Complexity

Only two integer variables are maintained.

**Overall:** `O(1)`
