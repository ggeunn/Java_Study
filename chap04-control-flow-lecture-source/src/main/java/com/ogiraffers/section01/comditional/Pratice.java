package com.ogiraffers.section01.comditional;

import java.util.Scanner;

public class Pratice {
    public static void main(String[] args) {
        /* switch문을 사용하여 아래 조건에 맞는 코드를 작성하시오.
        점수를 입력 받아 "수우미양가"를 평가하는 프로그램
        0부터 100사이 점수만 입력을 받아 (if문)
        점수가 90점 이상이면 ‘수’,
        80점이상 이고 90점 미만이면 ‘우’,
        70점이상 이고 80점미만이면 ‘미’,
        60점이상 70점 미만이면 ‘양’,
        나머지는 ‘가’ 로 출력
      */
        Scanner sc = new Scanner(System.in);
        System.out.print("점수를 입력하세요. : ");
        int score = sc.nextInt();
        String grade = "";


        if(score>=0 && score <= 100){
            switch (score/10){
                case 10:
                case 9:
                    grade = "수";
                    break;
                case 8:
                    grade = "우";
                    break;
                case 7:
                    grade = "미";
                    break;
                case 6:
                    grade = "양";
                    break;
                default:
                    grade = "가";
            }
        }
            System.out.println(grade);

    }
}
