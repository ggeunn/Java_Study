package com.ohgiraffers;

public class Question01 {





    public static void main(String[] args) {

        /* Application01
         * 정수형 변수 2개를 선언하여  각 20과 30으로 초기화 한 후
         * 두 수의 더하기, 빼기, 곱하기, 나누기, 나머지를 다음과 같이 출력하세요
         *
         * -- 출력 예시 --
         * 더하기 결과  : 50
         * 빼기 결과 : -10
         * 곱하기 결과 : 600
         * 나누기한 몫 : 0
         * 나누기한 나머지 : 20
         * */

        int inum1 = 20;
        int inum2 = 30;

        System.out.println("더하기 결과 : "+ (inum1 + inum2));
        System.out.println("빼기 결과 : "+ (inum1 - inum2));
        System.out.println("곱하기 결과 : "+ (inum1 * inum2));
        System.out.println("나누기 한 몫 : "+ (inum1 / inum2));
        System.out.println("나누기한 나머지 : "+ (inum1 % inum2));

        /* Application02
         * 사각형의 넓이와 둘레를 구하는 문제이다.
         * 너비 12.5 높이 36.4를 변수에 저장하고
         * 각 넓이와 둘레를 계산해 변수에 담고 아래와 같이 출력되도록 하시오
         *
         * -- 출력 예시 --
         * 면적 : 455.0
         * 둘레 : 97.8
         *  */


        double width = 12.5;
        double height = 36.4;


        System.out.println("면적 : "+(width * height));
        System.out.println("둘레 : "+((width+height)*2));


    }



}
