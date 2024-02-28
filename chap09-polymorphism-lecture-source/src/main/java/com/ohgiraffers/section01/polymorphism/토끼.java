package com.ohgiraffers.section01.polymorphism;

public class 토끼 extends 동물 {

    @Override
    public void 먹기(){
        System.out.println("토끼가 풀을 뜯어 먹고 있습니다. ");
    }

    @Override
    public void 달리기(){
        System.out.println("토끼가 깡총깡총 뜁니다.");
    }

    @Override
    public void 울기(){
        System.out.println("토끼가 울음소리를 냅니다. ");
    }

    public void 점프(){
        System.out.println("토끼가 점프를 합니다. ");
    }
}
