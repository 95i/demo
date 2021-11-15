package com.example.demo;

import java.util.Scanner;

public class Z3813 {
    public static void main(String[] args) {
        double r;
        double h;

        double max;

        final double PL = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入半径R:");
        r = scanner.nextDouble();

        System.out.print("请输入高H:");
        h = scanner.nextDouble();

        max = PL * r * r *h;
        System.out.println("体积等于:" + max);
    }
}
