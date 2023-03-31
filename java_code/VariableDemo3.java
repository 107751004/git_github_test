package com.it.code_for_day01;
public class VariableDemo3 {
    //主入口
    public static void main(String[] args) {
        //byte
        byte b = 10;
        System.out.println(b);//10
        //short
        short s = 20;
        System.out.println(s);//20
        //int
        int i = 30;
        System.out.println(i);//30
        //long
				/*
				如果要定義long類型的變量，
				在數據值的後面需要加一個 L 作為後綴，
				L 可以是大寫的，也可以是小寫的，但建議使用大寫
				*/
        long n = 999999999L;
        System.out.println(n);//999999999

        //float
				/*
				注意: 定義float類型變量時，也需要在數據值
							後面加一個 F 做為後綴
				*/
        float f = 10.1F;
        System.out.println(f);

        //double
        double d = 20.2;
        System.out.println(d);

        //char
        char c = '中';
        System.out.println(c);

        //boolean
        boolean o = true;
        System.out.println(o);
    }
}