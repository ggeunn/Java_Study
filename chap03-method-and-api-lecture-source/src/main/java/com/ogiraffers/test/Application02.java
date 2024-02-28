package com.ogiraffers.test;

public class Application02 {

    public static void main(String[] args) {

        System.out.println("main() 시작...");

        Application02 app2 = new Application02();
        app2.testMethod1(100);
        int result = app2.testMethod2(200);
        System.out.println(result);

        app2.testMethod3("이지은", 20 ,'여');

        System.out.println("main() 끝...");


    }
    public void testMethod1(int num){

        System.out.println(++num);

    }

    public int testMethod2(int num){

        return num;
    }

    public void testMethod3(String name, int age, char gender){

        System.out.println("이름 "+name+" 나이 "+age+ " 성별 "+gender);

    }


}
