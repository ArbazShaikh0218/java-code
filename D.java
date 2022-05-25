package com.test1;

public class D extends C {

    public  String  display( ) {
        System.out.println("Hello");
        return "d";

    }

    public static void main(String[] args) {
        D d = new D();
        d.display();
        C c = new C();
        c.display();

    }
}
