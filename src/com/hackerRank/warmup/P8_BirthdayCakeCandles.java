package com.hackerRank.warmup;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class P8_BirthdayCakeCandles {
    public static void main(String[] args) {
        int[] ar = {3, 2, 1, 3};
        System.out.println(birthdayCakeCandles(4, ar));
    }

    /*
     * Complete the birthdayCakeCandles function below.
     */
    static int birthdayCakeCandles(int n, int[] ar) {
        /*
         * Write your code here.
         */
        int blowOutCount = 0;
        int top = 0;

        for(int candle: ar) {
            if (candle > top) {
                top = candle;
                blowOutCount = 1;
            } else if (candle == top) {
                blowOutCount++;
            }
        }
        return blowOutCount;
    }

}
