package com.company.hackerRank;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {
    public static void main(String[] args) {
        staircase(4);
    }

    /*
     * Complete the staircase function below.
     */
    static void staircase(int n) {
        /*
         * Write your code here.
         */
        for (int i=0; i<n; i++)
            System.out.println(lineString(i, n));
    }

    private static String lineString(int lineNumber, int size) {
        StringBuffer sb = new StringBuffer();
        char c;
        for (int i = 0; i < size; i++) {
            if (i < size - lineNumber - 1)
                c = ' ';
            else
                c = '#';

            sb.append(c);
        }
        return sb.toString();
    }
}
