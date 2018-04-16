package com.company.hackerRank.warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/a-very-big-sum/problem
 */
public class P3_VeryBigSum {
    public static void main(String[] args) {
        long ar[] = {1000000001, 1000000002, 1000000003, 1000000004, 1000000005};
        aVeryBigSum(5, ar);
    }

    /*
     * Complete the aVeryBigSum function below.
     */
    static long aVeryBigSum(int n, long[] ar) {
        /*
         * Write your code here.
         */

        return Arrays.stream(ar).sum();
    }

}
