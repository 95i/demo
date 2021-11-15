package com.example.demo;

public class A20211113 {
    public static void main(String[] args) {
        int x = 3;
        int y = 17;
        boolean yn = true;
        System.out.println(x+y * x--);
        System.out.println(-x * y+y);
        System.out.println(x<y && yn);
        System.out.println(x>y || !yn);
        System.out.println(y!=++x ? x:y);
        System.out.println(y++/--x);
    }
}
