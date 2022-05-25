package com.test1;

import com.test2.MyCustomList;

import java.util.ArrayList;

public class GenericsRunner {
    static <X>  X doubleValue(X value){
        return value;
    }
    static <X extends List>  void duplicate(X list) {
        list.addAll(list);
    }





    public static void main(String[] args) {
        String value=doubleValue(new String());
        Integer number=doubleValue(Integer.valueOf(5));
        ArrayList list1=doubleValue(new ArrayList());


        MyCustomList<String> list = new MyCustomList();
        list.addElement("Element 1");
        list.addElement("Element 2");
        String value=list.get(0);
        System.out.println(value);



        MyCustomList<Integer> list1 = new MyCustomList();
        list1.addElement(Integer.valueOf(5));
        list1.addElement(Integer.valueOf(7));
        Integer number=list1.get(0);

        System.out.println(number);


    }
}