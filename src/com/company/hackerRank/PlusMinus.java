package com.company.hackerRank;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/plus-minus/problem
 */
public class PlusMinus {
    public static void main(String[] args) {
        int[] arr = {-4, 3, -9, 0, 4, 1};
        plusMinus(arr);
    }

    /*
     * Complete the plusMinus function below.
     */
    static void plusMinus(int[] arr) {
        /*
         * Write your code here.
         */

        long sumCount = Arrays.stream(arr).filter(value -> value > 0).count();
        printNumber(sumCount, arr.length);

        long minusCount = Arrays.stream(arr).filter(value -> value < 0).count();
        printNumber(minusCount, arr.length);

        long zeroCount = Arrays.stream(arr).filter(value -> value == 0).count();
        printNumber(zeroCount, arr.length);
    }

    private static void printNumber(long sumCount, int size) {
        System.out.println(String.format("%05f", sumCount / (float) size));
    }
}
