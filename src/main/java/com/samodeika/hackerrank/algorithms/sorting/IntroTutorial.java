package com.samodeika.hackerrank.algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class IntroTutorial {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int v = in.nextInt();
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        int index = findElementIndex(arr, 0, n - 1, v);
        System.out.println(index);
//        System.out.println("Searched value = " + v);
//        System.out.println("n = " + n);
//        printArray(arr);

    }

    static int findElementIndex(int[] arr,int start, int length, int element) {
        int middleIndex = (length + start)/ 2;
        int middleEl = arr[middleIndex];
        int result;
        if(middleEl < element) {
            result = findElementIndex(arr, middleIndex + 1, length, element);
        } else if(middleEl > element) {
            result = findElementIndex(arr, start, middleIndex, element);
        } else {
            return middleIndex;
        }

        return result;

    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }



}
