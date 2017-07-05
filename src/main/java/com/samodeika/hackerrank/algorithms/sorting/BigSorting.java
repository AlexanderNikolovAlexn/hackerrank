package com.samodeika.hackerrank.algorithms.sorting;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BigSorting {

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    String[] unsorted = new String[n];
    for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
        unsorted[unsorted_i] = in.next();
    }

    //sort(unsorted);
    quickSort(unsorted, 0, unsorted.length - 1);
    printArr(unsorted);
}

    static void sort(String[] arr) {
        String[] orderedArr = new String[arr.length];
        // copy array
        for (int i = 0; i < arr.length; i++) {
            orderedArr[i] = arr[i];
        }
        boolean changePos = true;
        int lowestIndex = 1;
        String lowestValue = orderedArr[0];
        int steps = 0;

        while (changePos) {
            boolean hasChange = false;
            String prevValue = orderedArr[lowestIndex - 1];
            for (int i = lowestIndex; i < orderedArr.length; i++) {
                String currValue = orderedArr[i];
                int comp = compareStrings(prevValue, currValue);
                if (comp == 1) {
                    orderedArr[i - 1] = currValue;
                    orderedArr[i] = prevValue;
                    hasChange = true;
                }

                if((comp == 1) && compareStrings(lowestValue, currValue) >= 0) {
                    lowestValue = currValue;
                    if(lowestIndex == i - 1) {
                        lowestIndex = i;
                    }
                }

                prevValue = orderedArr[i];
                if(i == orderedArr.length - 1 && !hasChange) {
                    changePos = false;
                }
                steps++;
            }
        }

        printArr(orderedArr);
        System.out.println("Steps = " + steps);
    }

    static void printArr(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    static int compareStrings(String s1, String s2) {
        if (s1.length() < s2.length()) {
            return -1;
        } else if (s1.length() > s2.length()) {
            return 1;
        } else {
            for (int j = 0; j < s1.length(); j++) {
                int prevInt = (int) s1.charAt(j);
                int currInt = (int) s2.charAt(j);
                if (prevInt < currInt) {
                    return -1;
                } else if (prevInt > currInt) {
                    return 1;
                }
            }
            return 0;
        }
    }

    static int partition(String arr[], int left, int right)
    {
        int i = left, j = right;
        String tmp;
        String pivot = arr[(left + right) / 2];

        while (i <= j) {
            while (compareStrings(arr[i], pivot) == -1)
                i++;
            while (compareStrings(arr[j], pivot) == 1)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };

        return i;
    }

    static void quickSort(String arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }

}