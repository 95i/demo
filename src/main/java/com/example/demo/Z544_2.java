package com.example.demo;

import java.util.Scanner;

public class Z544_2 {
    public static void main(String[] args) {
        double score;
        int sco;
        Scanner reader=new Scanner(System.in);
        System.out.print("Please enter score: ");
        score=reader.nextDouble();
        sco=(int)score/10;
        switch(sco)
        {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("The grade is D!");
                break;
            case 6:
                System.out.println("The grade is C!");
                break;
            case 7:
                System.out.println("The grade is B!");
                break;
            case 8:
                if(score/10<=8.4)
                    System.out.println("The grade is B!");
                else
                    System.out.println("The grade is A!");
                break;
            case 9:
            case 10:
                System.out.println("The grade is A!");
                break;
            default:
                break;
        }
    }
}
