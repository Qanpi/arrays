package com.company;

public class Main {

    public static void main(String[] args) {
        //hw1();
        hw3();
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
}

