package com.ogiraffers.section01.method;

public class Calculator {

    public int minNumberOf(int first, int second){

        return (first > second) ? second : first;

    }

    /* 필기. 두 수를 전달 받아 큰 수를 반환 */
    public static int maxNumberOf(int first, int second){

        return (first > second ) ? first : second;

    }

}
