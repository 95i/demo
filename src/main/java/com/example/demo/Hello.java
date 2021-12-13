package com.example.demo;


import com.smtxi.Student;

public class Hello {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();

        student1.name = "张三";
        student1.age = 18;
        student1.english = 60;
        student1.math = 60;
        student1.chinese = 90;
        System.out.println("你好我叫"+student1.name+",我今年" + student1.age + "岁");
        System.out.println("三门成绩总和:" + student1.total());
        System.out.println("平均值:" + student1.average()+"\n");

        student2.name = "李";
        student2.age = 20;
        student2.english = 80;
        student2.math = 40;
        student2.chinese = 80;
        System.out.println("你好我叫"+student2.name+",我今年" + student2.age + "岁");
        System.out.println("三门成绩总和:" + student2.total());
        System.out.println("平均值:" + student2.average()+"\n");

        if (student2.total() < student1.total()) {
            System.out.println(student1.name + "的成绩好");
        } else if (student2.total() > student1.total()) {
            System.out.println(student2.name + "的成绩好");
        } else {
            System.out.println(student1.name + "和" + student2.name + "的成绩一样好");
        }
    }

}

