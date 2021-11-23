package com.example.demo;

public class Z20211122 {
    public static void main(String[] args) {
        int sum=0;
        int i=0;
        while(i<100)
        {
            if(i%2==0) {
                sum += i;
                System.out.println(i);
            }
            i++;
        }
        System.out.println(sum);

    }
}
