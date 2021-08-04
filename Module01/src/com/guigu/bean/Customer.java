package com.guigu.bean;

import java.util.ArrayList;

public class Customer {
    public static void main(String[] args) {
        System.out.println("Customer!!!");

        ArrayList list =new ArrayList();
            add();
    }

    public static void add(){
    //单行注释
    /*
    多行注释
     */
        //region Description
        StringBuffer sb =new StringBuffer();
        System.out.println(sb.capacity());
        System.out.println(sb.length());
        System.out.println(sb.toString());

        sb.append("wukong").append("z").append("n");
        sb.append("z");
        sb.append("n");

        System.out.println(sb);

        sb.insert(0,"wukong");
        //endregion

        sb.setCharAt(5,'5');
        System.out.println(sb);

        String bbc="asdasd";

        sb.reverse();
        bbc=sb.toString();

        System.out.println(bbc);






    }
}
