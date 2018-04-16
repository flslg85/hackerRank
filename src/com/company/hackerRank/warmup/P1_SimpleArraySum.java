package com.company.hackerRank.warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/simple-array-sum/problem
 */
public class P1_SimpleArraySum {
    public static void main(String[] args) {
        int ar[] = {1, 2, 3, 4, 10, 11};
        simpleArraySum(ar);
    }

    static int simpleArraySum(int[] ar) {
        /*
         * Write your code here.
         */
        return Arrays.stream(ar).sum();
    }
}
