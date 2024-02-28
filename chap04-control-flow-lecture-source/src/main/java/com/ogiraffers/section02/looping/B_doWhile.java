package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class B_doWhile {

    public void testSimpleDoWhileStatement() {
        /* 수업목표. do-while 문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
         *   [do-while 문 표현식]
         *   do{
         *       1회차에는 무조건 실행하고, 이후에는 조건식을 확인하여 조건을 만족하는 경우 수행할 수문(반복할 구문)
         *       증감식;
         *   }while(조건식)
         *   */

        do {
            System.out.println("1");
        } while (false);

        System.out.println("반복문 종료 ");

    }
    public void testDoWhileExample1(){

        /* 필기.
        *   키보드로 문자열 입력 받아 반복적으로 출력
        *   단 , exit 가 입력되면 반복문을 종료한다.
        *  */

        Scanner sc = new Scanner(System.in);
        String str = "";

        do {
            System.out.print("문자열을 입력해주세요 : " );
            str = sc.nextLine();
            System.out.println(str);

        /* 필기. equals() : 문자열은 == 비교가 불가능하다.*/
        } while (!str.equals("exit"));

        System.out.println("반복문 종료");

    }
}
