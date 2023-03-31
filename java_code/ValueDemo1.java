package com.it.code_for_day01;
public class ValueDemo1 {
    public static void main(String[] args) {
        //目標: 需要大家掌握常見的數據在代碼中如何書寫的?

        //整數:
        System.out.println(666); //print 與 println 的差別在print完後有沒有要換行
        System.out.println(-777);

        //小數:
        System.out.println(1.93);
        System.out.println(-3.17);

        //字符串
        System.out.println("黑馬程序員");
        System.out.println("Happy New Year");

        //字符
        System.out.println('男');
        System.out.println('女');

        //布爾
        System.out.println(true);
        System.out.println(false);

        //空
        //細節: null 不能直接 print。
        //如果我們要print 「null」 這個字的話，只能用 字符串 的形式print
        System.out.println("null");
    }
}
