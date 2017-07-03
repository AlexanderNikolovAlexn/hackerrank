package com.samodeika.hackerrank.algorithms.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ApplesAndOranges {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }

        //find apples count
        int applesCount = 0;
        for (int i = 0; i < m; i++) {
            int pos = a + apple[i];
            if(pos >= s && pos <= t) {
                applesCount++;
            }
        }

        //find oranges count
        int orangesCount = 0;
        for (int i = 0; i < n; i++) {
            int pos = b + orange[i];
            if(pos >= s && pos <= t) {
                orangesCount++;
            }
        }

        System.out.println(applesCount);
        System.out.println(orangesCount);
    }
}
