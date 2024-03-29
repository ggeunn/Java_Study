package com.ogiraffers.section06.statickeyword;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. static 키워드에 대해 이해할 수 있다.*/
        /* 필기.
         *   static
         *   : 정적 메모리 영역에 프로그램이 start 될 때 할당을 하는 키워드이다.
         *  */

        /* 목차. 1. static 키워드를 필드에서 사용해보자  */
        StaticFieldTest sft = new StaticFieldTest();

        /* 현재 두 필드가 가지고 있는 값 확인 */
        System.out.println("non-static field : " + sft.getNonStaticCount() );   // 0
        System.out.println("static field : "+ sft.getStaticCount());            // 0

        /* 두 필드의 값을 1씩 증가 시킨 후 다시 값 확인 */
        sft.increaseNonStaticCount();
        sft.increaseStaticCont();

        System.out.println("non-static field : " + sft.getNonStaticCount() );   // 1
        System.out.println("static field : "+ sft.getStaticCount());            // 1

        StaticFieldTest sft2 = new StaticFieldTest();

        System.out.println("non-static field : " + sft2.getNonStaticCount() );  // 0
        System.out.println("static field : "+ sft2.getStaticCount());           // 1

        /* 필기.
        *   인스턴스 변수의 경우 sft 와 sft2 두개의 인스턴스가 서로 값을 공유 하지 못하고
        *   인스턴스를 생성할 때 마다 기본값인 0 으로 초기화 되었다.
        *   하지만 static 필드의 경우 클래스변수(static 이 붙은 변수) 가 프로그램을 종료할 때 까지
        *   유지되고 있기 때문에 갓을 유지하고 있다.
        *   따라서 여러 개의 인스턴스가 같은 공간을 공유할 목적으로 필드에 static 키워드를 사용한다.
        *  */

        /* 목차. 2. static 메소드 확인  */
        /* 목차. 2-1. non-static 메소드 호출  */
        StaticMethodTest smt = new StaticMethodTest();
        smt.nonStaticMethod();

        /* 주의사항
        *   static 메소드도 이렇게 호출 가능
        *   하지만 static 메소드는 인스턴스를 생성하지 않고 호출하는 방식으로 사용해야 한다.
        *   static method 는 정적 영역에 두고 인스턴스를 생성하지 않고 호출할 목적으로
        *   만들기 때문에 static 메소드를 호출하는 방식으로 호출해야 한다.
        * */
        smt.StaticMethod(); //권장하지 않음

        /* 목차. 2-2. static 메소드 호출 */
        /* 필기. 클래스명.메소드명  */

        StaticMethodTest.StaticMethod();    //궝장함
        


    }
}
