package com.ogiraffers.section01.method;

public class Application07 {

    public static void main(String[] args) {

    /* 수업목표. 매개변수와 리턴값을 복합적으로 활용하는 것을 이해하고 활용할 수 있다. */
    /* 필기.
    *   매개변수와 리턴값 복합 활용
    *   매개변수도 존재하고 리턴값도 존재하는 메소드를 이용하여 간단한 계산기 만들기
    * */

    int first = 20;
    int second = 10;

    Application07 app7 = new Application07();
    int plus = app7.plusTwoNumbers(first,second);
    int minus = app7.minusTwoNumbers(first,second);
    int multiple = app7.multipleTwoNumvers(first,second);
    int divide = app7.divideTwoNumbers(first,second);


    System.out.println("두 수의 더하기: "+ plus );
    System.out.println("두 수의 빼기: "+ minus );
    System.out.println("두 수의 곱하기: "+ multiple );
    System.out.println("두 수의 나누기: "+ divide );

    }

    /** 문서화 주석
     * <pre>
     *     매개변수로 전달 받은 두 수를 더하여 반환하는 기능 제공
     * </pre>
     * @param first1 더하기를 할 첫 번째 정수
     * @param second1 더하기를 할 두 번째 정수
     * @return 매개변수로 전달 받은 두 수를 더한 결과
     * */
    public int plusTwoNumbers(int first1, int second1){

        return first1 + second1;

    }

    public int minusTwoNumbers(int first, int second){

        return  first-second;

    }

    public int multipleTwoNumvers(int first , int second){

        return  first*second;

    }

    public int divideTwoNumbers(int first, int second){

        return  first/second;

    }

}
