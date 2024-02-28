package com.ohgiraffers.section02.userexception;

import com.ohgiraffers.section02.userexception.exception.PriceNegativeException;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 사용자 정의의 예외클래스를 정의 후 발생한 사용자 정의의 예외를 처리할 수 있다.  */

        /* 필기.
        *   사전에 정의된 예외클래스 외에 개발자가 원하는 명칭의 예외클래스를 작성하는 것이 가능하다.
        *   extends Exception 으로 예외처리 클래스를 상속받아 더 구체적인 예외 이름을 정의하는 것이다. */

        ExceptionTest et = new ExceptionTest();
        try {
//            et.checkEnoughMoney(-50000,50000);
//            et.checkEnoughMoney(50000,-10000);
//            et.checkEnoughMoney(50000,10000);
            et.checkEnoughMoney(10000,50000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }

}
