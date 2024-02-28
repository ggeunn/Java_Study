package com.ogiraffers.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Test te = new Test();
        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int num2 = sc.nextInt();

        System.out.println("두 수의 합은 :" + te.plus(num1,num2));

    }
    public int plus(int num1, int num2){

        return  num1+num2;

    }
}
