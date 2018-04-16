package com.hackerRank.warmup;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class P7_MiniMaxSum {
    public static void main(String[] args) {
        int[] arr = {10^9-5, 10^9-4, 10^9-3, 10^9-2, 10^9-1};
        miniMaxSum(arr);
    }

    /*
     * Complete the miniMaxSum function below.
     */
    static void miniMaxSum(int[] arr) {
        /*
         * Write your code here.
         */

        long maximum = Arrays.stream(arr).sorted()
                .skip(1).mapToLong(value -> value).sum();

        int[] sortedArr = Arrays.stream(arr).sorted().toArray();
        long minimum = IntStream.range(0, sortedArr.length)
                .map(i -> sortedArr[sortedArr.length-1-i])
                .skip(1).mapToLong(value -> value).sum();

        System.out.print(minimum + " " + maximum);
    }

}
