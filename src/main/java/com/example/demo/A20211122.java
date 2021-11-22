package com.example.demo;

import java.util.Random;
import java.util.Scanner;

public class A20211122 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("给你一个1至100之间的整数请猜测这个数");
        int realNumber = random.nextInt(100)+1;

        int yourGuess = 0;
        System.out.println("输入您的猜测:");
        yourGuess = scanner.nextInt();
        while (yourGuess != realNumber){
            if (yourGuess > realNumber){
                System.out.println("猜大了再输入你的猜测:");
                yourGuess = scanner.nextInt();
            }else if(yourGuess < realNumber){
                System.out.println("猜小了再输入你的猜测:");
                yourGuess = scanner.nextInt();
            }
        }
        System.out.println("猜对了");

    }
}
