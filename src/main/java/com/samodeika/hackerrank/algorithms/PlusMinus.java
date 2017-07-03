package com.samodeika.hackerrank.algorithms;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }

        calcFraction(arr);

    }

    static void calcFraction(int a[]) {
        int pos = 0;
        int neg = 0;
        int zeros = 0;
        int len = a.length;
        for (int i = 0; i < len; i++) {
            if(a[i] > 0) {
                pos +=1;
            } else if (a[i] < 0) {
                neg += 1;
            } else {
                zeros += 1;
            }
        }


        round(pos, len);
        round(neg, len);
        round(zeros, len);

    }

    static void round(int count, double total) {
        double in = (double) count / (double) total;
        System.out.println(BigDecimal.valueOf(in).setScale(6, BigDecimal.ROUND_HALF_UP));
    }

}