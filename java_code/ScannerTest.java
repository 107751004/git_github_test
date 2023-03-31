//1.導包，找到Scanner這個類在哪
//書寫要注意: 要寫在類定義上面
package com.it.code_for_day01;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        //2.創建對象，表示我現在準備要用Scanner這個類
        Scanner sc = new Scanner(System.in);

        System.out.println("請輸入整數: ");

        //3.接收數據
        //變量紀錄了鍵盤輸入的數據
        int number1 = sc.nextInt();
        System.out.println("請輸入整數: ");
        int number2 = sc.nextInt();

        System.out.print(number1 + number2);
    }
}
