package com.ohgiraffers.section03.superkeyword;

import java.util.Date;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. super와 super() 에 대해 이해할 수 있다.  */
        /* 필기.
        *   super : 자식클래스를 이용해서 객체를 생성할 떄 부모 생성자를 호출해
        *           부모 클래스의 인스턴스도 함계 생성하게 된다.
        *           이 떄 부모의 인스턴스 주소를 보관하는 레퍼런스변수로
        *           자식클래스 내의 모든 생성자와 메소드 내에서 선언하지 않고도
        *           사용할 수 있는 레퍼런스 변수이다.
        *   super() : 부모생성자를 호출하는 구문으로 인자와 매개변수의 타입, 갯수, 순서가
        *             일치하는 부모의 생성자를 호출하게 된다. this()가 해당 클래스 내의
        *             다른 생성자를 호출하는 구문이라면, super() 는 부모클래스가 가지는
        *             private 생성자를 제외한 나머지 생성자를 호출할 수 있다.
        * */

        Product product = new Product();
        System.out.println(product.getInfo());

        Product product1 = new Product("A-1230", "삼송", "갤럭시", 20000,new Date());
        System.out.println(product1.getInfo());

        Computer computer = new Computer();
        System.out.println(computer.getInfo());

        Computer computer1 = new Computer("I-9", 512,32,"윈도우");
        System.out.println(computer1.getInfo());

        Computer computer2 = new Computer("A-1234","삼송","갤럭시",20000,new Date(),
                "i9",512,32,"윈도우");
        System.out.println(computer2.getInfo());
    }
}
