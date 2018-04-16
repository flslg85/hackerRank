package com.company.hackerRank.warmup;

import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class P9_TimeConversion {
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
        System.out.println(timeConversion("12:00:00AM"));
        System.out.println(timeConversion("12:00:00PM"));
    }

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        /*
         * Write your code here.
         */
        Pattern p = Pattern.compile("([0-9]+):([0-9]+):([0-9]+)(AM|PM)");
        Matcher m = p.matcher(s);
        StringBuffer sb = new StringBuffer();
        if (m.find()) {
            String hour = m.group(1);
            String min = m.group(2);
            String sec = m.group(3);
            String amPm = m.group(4);

            if (hour.equals("12") && amPm.equals("AM"))
                sb.append("00");
            else if (hour.equals("12") && amPm.equals("PM"))
                sb.append("12");
            else if (amPm.equals("PM"))
                sb.append(String.format("%02d", (Integer.valueOf(hour) + 12) % 24));
            else
                sb.append(String.format("%02d", Integer.valueOf(hour) % 24));

            sb.append(':');
            sb.append(min);
            sb.append(':');
            sb.append(sec);
        }

        return sb.toString();
    }

}
