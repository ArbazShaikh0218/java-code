package com.test1;

public class B extends A {
    protected String firstName = "Arbaz";

    public void show() {
        System.out.println(this.firstName);
    }

    public static void main(String[] args) {
        B b = new B();
        b.show();
        A a = new A();
        a.show();

    }

}



