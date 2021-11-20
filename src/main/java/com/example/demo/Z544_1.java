package com.example.demo;

import java.util.Scanner;

public class Z544_1 {
    public static void main(String[] args) {
        System.out.print("请输入成绩：");
        Scanner scanner = new Scanner(System.in);
        int score = scanner.nextInt();
        int key = score/10;

        switch (key) {
            case 10:
            case 9:
                System.out.println("优");
                break;
            case 8:
                System.out.println("良");
                break;
            case 7:
                System.out.println("中");
                break;
            case 6:
                System.out.println("及格");
                break;
            default:
                System.out.println("不及格");
                break;
        }
    }
}
