package com.example.demo;


import com.smtxi.Student;

public class Hello {
    public static void main(String[] args) {
        Student zhangsan = new Student();
        Student lisi = new Student();
        zhangsan.name = "张三";
        zhangsan.age = 18;
        zhangsan.english = 60;
        zhangsan.math = 60;
        zhangsan.chinese = 90;
        zhangsan.zhangsan();
        System.out.println("三门成绩总和:" + zhangsan.total());
        System.out.println("平均值:" + zhangsan.average());

        lisi.name = "李四";
        lisi.age = 20;
        lisi.english = 80;
        lisi.math = 30;
        lisi.chinese = 90;
        lisi.lisi();
        System.out.println("三门成绩总和:" + lisi.total());
        System.out.println("平均值:" + lisi.average());

        if (lisi.total() < zhangsan.total()) {
            System.out.println(zhangsan.name + "的成绩好");
        } else if (lisi.total() > zhangsan.total()) {
            System.out.println(lisi.name + "的成绩好");
        } else {
            System.out.println(zhangsan.name + "和" + lisi.name + "的成绩好");
        }
    }

}

