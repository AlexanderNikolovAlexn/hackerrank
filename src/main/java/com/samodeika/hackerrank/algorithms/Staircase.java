package com.samodeika.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        printStaircase(n);
    }

    static void printStaircase(int n) {
        for (int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(n);
            for (int j = n - 1; j >= 0; j--) {
                if (i < j) {
                    sb.append(" ");
                } else {
                    sb.append("#");
                }
            }
            System.out.println(sb.toString());
        }
    }
}
