package com.it.code_for_day01;
public class VariableTest {

    //主入口
    public static void main(String[] args) {
        //一開始車上沒人
        int count = 0;
        //第一站上去一位
        count = count + 1;
        //System.out.println(count);

        //第二站上去兩位，下去一位
        count = count + 2 - 1;
        //System.out.println(count);

        //第三站上去兩位，下去一位
        count = count + 2 - 1;
        //System.out.println(count);

        //第四站下去一位
        count = count - 1;
        //System.out.println(count);

        //第五站上去一位
        count = count + 1;
        //System.out.println(count);

        //請問到了終點車上共幾位?
        System.out.println(count);//3
    }

}
