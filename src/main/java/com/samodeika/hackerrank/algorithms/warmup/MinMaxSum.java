package com.samodeika.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MinMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        findMinMax(arr);

    }

    static void findMinMax(int a[]) {
        long min = 0;
        long max = 0;
        for (int i = 0; i < a.length; i++) {
            long currMin = 0;
            long currMax = 0;
            for (int j = 0; j < a.length; j++) {
                if(i != j) {
                    currMin += a[j];
                    currMax += a[j];
                }
            }
            if(min == 0 || min > currMin) {
                min = currMin;
            }
            if(max == 0 || max < currMax) {
                max = currMax;
            }
        }

        System.out.println(String.valueOf(min) + " " + String.valueOf(max));
    }


}