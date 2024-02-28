package com.ogiraffers.test;

public class Application01 {

    public static void main(String[] args) {

        /* 수업목표. 메소드의 호출 흐름을 연습해보자 */
        System.out.println("main() 프로그램 시작.... ");

        Application01 app1 = new Application01();
        app1.testMethod1();


        System.out.println("main() 프로그램 종료....");

    }

    public void testMethod1(){

        System.out.println("testMethod1 시작");
        testMethod2();

        System.out.println("testMethod1 끝");

    }
    public void testMethod2(){

        System.out.println("testMethod2 시작");
        String hi = testMethod3();
        System.out.println(hi); //값을 변수에 넣어서 출력한 상태
//        System.out.println(testMethod3());  값 자체를 출력문에 넣어서 출력을 한 상태
        System.out.println("testMethod2 끝");

    }
    public String testMethod3(){

        return "하이";

    }

}
