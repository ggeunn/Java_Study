package com.ogiraffers.section03.math;

public class Method {

    public static void main(String[] args) {

        Method met = new Method();
        met.method2();

    }
    public void method1(){
        System.out.println("안녕 ");
    }
    public void method2(){
        method1();
    }
}
