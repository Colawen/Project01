package com.guigu.bean;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author dzwstart
 * @date 2021/8/4 - 16:14
 */
public class TemplatesTest {
    public static void main(String[] args) {

       //模板二：sout
        System.out.println();
        //变形：soutp/soutm/soutv/xxx.sout
        System.out.println("args = " + Arrays.deepToString(args));
        int num1=21;
        int num2=22;
        System.out.println("num2 = " + num2);
        System.out.println("num1 = " + num1);

        method();


    }

 public static void method(){
     System.out.println("TemplatesTest.method");

  //模板三：fori
     String[] arr=new String[]{"Tom","Jerry","Peter","LiLei"};
     for (int i = 0; i < arr.length; i++) {
         System.out.println(arr[i]);
     }
     System.out.println("************************");
     //变形：iter
     for (String s : arr) {
         System.out.println(s);
     }
     //变形：itar
     for (int i = 0; i < arr.length; i++) {
         String s = arr[i];

         System.out.println(s);
     }
     char[] data={'T','F','B'};

     String str=new String();
      str=String.valueOf(data);

     StringBuffer sb =new StringBuffer();
     sb.append(str);
     sb.reverse();
     System.out.println(sb);



     //模板四：list.for
     ArrayList list=new ArrayList();
     list.add(556);
     list.add(557);
     list.add(5888);

     for (Object o : list) {
         System.out.println(o);
     }

     //变形：list.fori
     for (int i = 0; i < list.size(); i++) {
         System.out.println(list.get(i));
     }

     //变形：list.forr 倒序遍历
     for (int i = list.size() - 1; i >= 0; i--) {
         System.out.println(list.get(i));
     }


     //模板五：ifn



 }



}
