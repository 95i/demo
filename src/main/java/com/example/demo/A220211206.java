package com.example.demo;

import java.util.Scanner;

public class A220211206 {
    public static void main(String[] args) {
        String str;
        Scanner reader = new Scanner(System.in);
        System.out.print("Please enter string: ");
        str = reader.nextLine();
        int i, n = str.length();
        int letterCount = 0, numCount = 0, otherCount = 0;
        char ch;
        for (i = 0; i < n; i++) {
            ch = str.charAt(i);
            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z'))
                letterCount++;
            if (ch >= '0' && ch <= '9')
                numCount++;
            else
                otherCount++;
        }
        System.out.println("Letter=" + letterCount + "    Number=" + numCount + "    Others=" + (otherCount - letterCount));

    }
}
