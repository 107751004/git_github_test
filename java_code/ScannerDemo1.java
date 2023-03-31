package com.it.code_for_day01;
//1.導包，找到Scanner這個類在哪
//書寫要注意: 要寫在類定義上面

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {
        //2.創建對象，表示我現在準備要用Scanner這個類
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入整數: ");

        //3.接收數據
        //變量i紀錄了鍵盤輸入的數據
        int i = sc.nextInt();

        System.out.println(i);
    }
}
