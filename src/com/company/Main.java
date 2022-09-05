package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //hw1();
        hw6();
    }

    public static void hw1() {
        int[] a = new int[6];
        int sum = 0;
        for (int x : a) {
            System.out.println(x);
            sum += x;
        }

        System.out.println(sum);
    }

    public static void hw3() {
        int[] values = {-3, 2, 5, 4, 7};
        int n = 1;
        boolean result = true;
        while (result && n < 5) {
            if (values[n] < values[n-1]) result = false;
            n++;
        }

        System.out.println(result);
    }

    public static void hw4() {
        int[] a = {5, 4, -7, -2, -1};
        for (int i=a.length-1; i>=0; i--) {
            System.out.println(a[i]);
        }
    }

    public static void hw5() {
        int[] a = {-3, 2, 6, -11};
        int[] s = new int[4];
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
            s[i] = sum;
        }

        System.out.println(Arrays.toString(s));
    }

    public static void hw6() {
        int[] a = {4, -3, -5, 9, 1, 11};
        int m = 1;
        for (int i=0; i<a.length; i++) {
            if(a[i] < m) System.out.println(a[i]);
        }
        for (int i=0; i<a.length; i++) {
            if(a[i] > m) System.out.println(a[i]);
        }
    }
}

