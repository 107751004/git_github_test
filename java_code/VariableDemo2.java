package com.it.code_for_day01;
public class VariableDemo2 {
    //主入口
    public static void main(String[] args) {
        //基本用法
        //1.定義變量，再進行輸出
        int a = 10;
        System.out.println(a);//10

        //2.變量參與運算
        int b = 30;
        int c = 20;
        System.out.println(b + c);//50

        //3.修改已定義變量紀錄的值
        a = 50;
        System.out.println(a);//50

        //4.一條語句可以定義多個變量
        int d = 100, e = 200, f = 300;
        System.out.println("d = " + d);
        System.out.println(e);
        System.out.println(f);

        //變量在使用前一定要賦予一個值
        /*
        int g;
        System.out.println(g);//錯誤
        */
        int g = 500;
        System.out.println(g);//錯誤
    }
}
