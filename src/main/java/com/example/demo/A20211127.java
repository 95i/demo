package com.example.demo;

import java.util.Scanner;

public class A20211127 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            System.out.print("请输入一个整数:");
            a = scanner.nextInt();
        } while (a < 0 || a > 100);

        if (a % 3 == 0 && a % 7 == 0) {
            System.out.println("该数既可以被3整除也可以被7整除");
        } else {
            System.out.println("该数既不能被3整除也不能被7整除");
        }
    }
}
