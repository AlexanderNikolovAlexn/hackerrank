package com.samodeika.hackerrank.algorithms.Strings;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class PalindromeIndex {

    static int palindromeIndex(String s) {
    int result = -1;
    if(isPalindrom(s)) {
        return result;
    }

    for (int i = 0; i < s.length(); i++) {
        String p;
        if(i == 0) {
            p = s.substring(i+1, s.length());
        } else if (i == s.length()) {
            p = s.substring(0, s.length() - 1);
        } else {
            p = s.substring(0, i) + s.substring(i + 1, s.length());
        }

        if(isPalindrom(p)) {
            result = i;
            break;
        }
    }

    return result;

    }

    static boolean isPalindrom(String s) {
        if(s.length() <= 1) {
            return true;
        }

        int middle = s.length() / 2;
        String left = s.substring(0, middle);
        String right;
        if(s.length() % 2 == 1) {
            right = s.substring(middle + 1, s.length());
        } else {
            right = new StringBuilder(s.substring(middle, s.length())).reverse().toString();
        }

        return left.equals(right);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}
