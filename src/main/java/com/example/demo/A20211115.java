package com.example.demo;

import java.util.Scanner;

public class A20211115 {
    public static void main(String[] args) {
        int a,b,c,max;
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入整数a：");
        a = scanner.nextInt();

        System.out.print("请输入整数b：");
        b = scanner.nextInt();

        System.out.print("请输入整数c：");
        c = scanner.nextInt();


        if (a<b){
            if (b<c){
                System.out.println(c+","+b+","+a);
            }else{
                if (a<c){
                    System.out.println(b+","+c+","+a);
                }else {
                    System.out.println(b+","+a+","+c);
                }
            }
        }else{
            if(b>c) {
                System.out.println(a + "," +  b + "," + c);
            }
            else {
                if(a<c) {
                    System.out.println(c + "," +  a + "," + b);
                } else {
                    System.out.println(a + ","+ c + "," + b);
                }
            }
        }
    }
}
