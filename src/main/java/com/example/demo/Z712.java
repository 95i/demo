package com.example.demo;

import java.util.Scanner;

public class Z712 {
    public static void main(String[] args) {
        int num;
        Scanner reader = new Scanner(System.in);
        System.out.print("请输入长度: ");
        num = reader.nextInt();
        int[] n = new int[num];
        int i, sum = 0;
        float aver;
        System.out.print("请输入 " + num + " 数字: ");
        for (i = 0; i < num; i++) {
            n[i] = reader.nextInt();
            sum += n[i];
        }
        aver = (float) sum / num;
        System.out.println("平均值=" + aver);
        System.out.print("大于平均值的数: ");
        for (i = 0; i < num; i++)
            if (n[i] > aver)
                System.out.print(" " + n[i] + " ");
    }
}
