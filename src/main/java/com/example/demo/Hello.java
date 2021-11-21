package com.example.demo;

import java.util.*;
public class Hello{
    public static void main(String[] args){
        Scanner rank=new Scanner(System.in);
//        flost grade;
        int grade;
        System.out.print("请输入学生成绩:");
//        grade=rank.nextFlost();
        grade = rank.nextInt();
        if(grade<0||grade>100) {
            System.out.println("输入出错,请重新输入:");
        }else {
//            switch(grade/10){
            switch(grade/10){
                case 10:
                case 9:
                    System.out.println("成绩为优");
                    break;
                case 8:
                    System.out.println("成绩为良");
                    break;
                case 7:
                    System.out.println("成绩为中");
                    break;
                case 6:
                    System.out.println("成绩为及");
                    break;
                default:
                    System.out.println("成绩为不及格");
                    System.out.println("学生成绩为:+grade(f)");
            }
        }
    }}
