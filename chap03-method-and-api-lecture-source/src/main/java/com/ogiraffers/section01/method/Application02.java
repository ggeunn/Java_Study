package com.ogiraffers.section01.method;

public class Application02 {

    public static void main(String[] args) {

    /* 수업목표. 다른 흐름의 메소드 호출 흐름에 대해 알 수 있다. */
    /* 목차. 1. methodA(), methodB(), methodC() 를 차례대로 작성. */
    /* 목차. 2. 작성 후 메소드 호출 확인과 실행 종료 출력 구문을 작성하고 다시 현재 위치로 돌아온다. */
    /* 목차. 3. 메인메소드 시작을 확인하기 위한 출력 구문을 작성한다. */

        System.out.println("main() 시작");

        Application02 app2 = new Application02();
        app2.methodA();
        app2.methodB();
        app2.methodC();


        System.out.println("main() 종료");

    }
    public void methodA(){
        System.out.println("methodA() 시작");
        System.out.println("methodA() 끝");

    }
    public  void methodB(){
        System.out.println("methodB() 시작");
        System.out.println("methodB() 끝");

    }
    public  void  methodC(){
        System.out.println("methodC() 시작");
        System.out.println("methodC() 끝");
    }
}
