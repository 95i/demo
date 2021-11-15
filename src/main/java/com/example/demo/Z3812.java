package com.example.demo;

import java.util.Scanner;

public class Z3812 {
    public static void main(String[] args) {
        int a;
        int b;

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入第一个整数：");
        a = scanner.nextInt();

        System.out.print("请输入第二个整数：");
        b = scanner.nextInt();

        System.out.println("相除后得到：" + a/b);
    }
}
