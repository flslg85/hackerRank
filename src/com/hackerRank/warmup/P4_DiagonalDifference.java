package com.hackerRank.warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class P4_DiagonalDifference {
    public static void main(String[] args) {
        int[][] a = {
                {11, 2, 4},
                {4, 5, 6},
                {10, 8, -12}
        };

        System.out.println(diagonalDifference(a));
    }

    /*
     * Complete the diagonalDifference function below.
     */
    static int diagonalDifference(int[][] a) {
        /*
         * Write your code here.
         */

        int sum1 = 0;
        for (int i=0; i<a.length; i++)
            sum1 += a[i][i];

        int sum2 = 0;
        for (int i=0; i<a.length; i++)
            sum2 += a[a.length - 1 - i][i];

        return Math.abs(sum1 - sum2);
    }
}
