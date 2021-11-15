package com.example.demo;

import java.util.Scanner;

public class A20211115 {
    public static void main(String[] args) {
//        int a,b,c,max;
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("请输入a");
//        a = scanner.nextInt();
//
//        System.out.print("请输入b");
//        b = scanner.nextInt();
//
//        System.out.print("请输入c");
//        c = scanner.nextInt();
//
//
//        if (a>b){
//            max = a;
//        }else {
//            System.out.println("");
//        }

        Scanner c = new Scanner(System.in);
        System.out.println("请输入3个数");
        int a = c.nextInt();
        int b = c.nextInt();
        int s = c.nextInt();
        System.out.println(a + "," + b + "," + s);

        int temp;
        if (a < b) {//b此时是temp。a是b/
            temp = a;
            a = b;
            b = temp;

        }

        if (a < s) {
            temp = a;
            a = s;
            s = temp;

        }
        if (b < s) {
            temp = b;
            b = s;
            s = temp;
        }

        System.out.println("结果：" + a + ">" + b + ">" + s);

    }

}
