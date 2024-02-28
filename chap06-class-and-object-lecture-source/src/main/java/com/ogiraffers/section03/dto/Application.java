package com.ogiraffers.section03.dto;

public class Application {

    public static void main(String[] args) {

        /* 수업목표. 데이터를 추상화하는 기법을 이해하고 이를 사용하여 프로그래밍 */

        /* 필기.
        *   캡슐화의 원칙에는 일부 어긋나긴 하지만 다른 목적을 가진 클래스와 객체를
        *   추상화 하는 기법이 있다.
        *   행위 위주(메소드)가 아닌 데이터를 하나로 뭉치기 위한 객체(Data Transfer Object)의
        *   경우이다.
        *   이러한 객체를 설계할 때는 행위가 아닌 데이터가 위주이며, 캡슐화의 원칙을 준수하여
        *   모든 필드를 private 로 직접 접근을 막고, 각 필드 값을 변경하거나, 반환하는 메소드를
        *   세트로 미리 준비해둔다.
        *   private 필드와 필드값을 수정하는 설정자(Setter), 필드에 접근하는(getter)들로 구성.
        *
        *    */

        MemberDTO member = new MemberDTO();
        member.setNumber(1);
        member.setName("홍길동");
        member.setAge(20);
        member.setGender('남');
        member.setHeight(180.3);
        member.setWeight(80.5);
        member.setActivated(true);

        System.out.println("회원번호 : "+member.getNumber());
        System.out.println("회원이름 : "+member.getName());
        System.out.println("회원나이 : "+member.getAge());
        System.out.println("회원성별 : "+member.getGender());
        System.out.println("회원키 : "+member.getHeight());
        System.out.println("회원몸무게 : "+member.getWeight());
        System.out.println("회원활성상태 : "+member.isActivated());

        /* 필기.
        *   데이터를 주로 다루는 객체의 경우 행위를 추상화하지 않고
        *   미리 모든 필드에 접근 가능성을 염두해두고 작성해두는 관례로 인해 현재도 많이 사용하고 있다.
        *  */



    }

}
