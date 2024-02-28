package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

    /* 목차. 1. extends 키워드를 이용해 Car 클래스를 RacingCar 클래스 */

    /*목차 2. run() 오버라이딩 */
    @Override
    public void run(){
        System.out.println("레이싱카가 전속력으로 질주");
    }
    /* 목차.2. soundHorn(), stop() 오버라이딩 */
    @Override
    public void soundHorn(){
        System.out.println("레이싱카는 경적을 울리지 않습니다. ");
    }

    @Override
    public void stop(){
        System.out.println("레이싱카가 멈춥니다. ");
    }

}
