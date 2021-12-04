package com.example.demo;

import java.util.Scanner;

public class A20211204 {
    public static void main(String[] args) {
        int i, j, max, min;
        int[] a = new int[5];
        Scanner scanner = new Scanner(System.in);

        for (i = 0; i < a.length; i++) {
            System.out.print("从键盘输入一个整数到元素a[" + i+"]:");
            a[i] = scanner.nextInt();
        }

        max = a[0];
        min = a[0];
        for (i = 1; i < a.length; i++) {

            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }

        }
        System.out.println("其中的最大值是:" + max);
        System.out.println("其中的最小值是:" + min);
    }
}
