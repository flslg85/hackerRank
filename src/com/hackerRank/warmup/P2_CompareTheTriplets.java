package com.hackerRank.warmup;

/**
 * https://www.hackerrank.com/challenges/compare-the-triplets/problem
 */
public class P2_CompareTheTriplets {
    public static void main(String[] args) {
        solve(5, 6, 7, 3, 6, 10);
    }

    /*
     * Complete the solve function below.
     */
    static int[] solve(int a0, int a1, int a2, int b0, int b1, int b2) {
        /*
         * Write your code here.
         */

        int alice = 0;
        int bob = 0;

        if (a0 > b0)
            alice++;
        else if (a0 < b0)
            bob++;

        if (a1 > b1)
            alice++;
        else if (a1 < b1)
            bob++;

        if (a2 > b2)
            alice++;
        else if (a2 < b2)
            bob++;

        return new int[] {alice, bob};
    }
}
