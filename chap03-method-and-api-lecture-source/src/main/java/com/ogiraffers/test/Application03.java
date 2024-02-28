package com.ogiraffers.test;

public class Application03 {

    public static void main(String[] args) {

        Application03 app3 = new Application03();
        int num1 = 10 ;
        int num2 = 5;

        System.out.println("두 수 더하기는 "+ app3.plus(num1,num2) );
        System.out.println("두 수 빼기는 "+ app3.minus(num1, num2));


    }
    public int plus (int num1 , int num2){

        return num1 + num2;
    }
    public int minus (int num1 , int num2){

        return num1-num2;
    }


}
