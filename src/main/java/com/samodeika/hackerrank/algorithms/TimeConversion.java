package com.samodeika.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    static String timeConversion(String s) {
        int hours = Integer.valueOf(s.substring(0, 2));
        if(s.contains("PM") && hours < 12) {
            hours += 12;
        }
        if(s.contains("AM") && hours >= 12) {
            hours -= 12;
        }
        String result = String.format("%02d", hours) + s.substring(2, 8);

        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

