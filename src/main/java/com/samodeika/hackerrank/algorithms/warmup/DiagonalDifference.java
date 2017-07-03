package com.samodeika.hackerrank.algorithms.warmup;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }

        //printArray(a);

        System.out.println(calcDiagDiff(a));
    }

    static void printArray(int a[][]) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println("");
        }
    }

    static int calcDiagDiff(int a[][]) {
        int result = 0;
        int diag1 = 0;
        int diag2 = 0;
        for (int i = 0; i < a.length; i++) {
            diag1 += a[i][i];
            int last = a.length - i - 1;
            diag2 += a[i][last];
        }

        result = Math.abs(diag1 - diag2);

        return result;
    }
}
