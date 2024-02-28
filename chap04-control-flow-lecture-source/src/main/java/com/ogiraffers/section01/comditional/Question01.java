package com.ogiraffers.section01.comditional;

import java.util.Scanner;

public class Question01 {
    public static void main(String[] args) {
        Question01 qu = new Question01();
//        qu.testIf();
//        qu.testIf1();
//        qu.testIf2();
//        qu.testIf3();
        qu.testIf4();
    }
    public void testIf(){
        /* 정수를 하나 입력 받아 그 수가 양수이면 "양수다." 라고 출력하고,
         * 양수가 아닌 경우 "양수가 아니다." 라고 출력하세요
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 양수다.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();

        if(num > 0 ){
            System.out.println("양수다. ");
        }else {
            System.out.println("양수가 아니다. ");
        }
    }
    public void testIf1(){
        /* 정수를 입력 받아 그 수가 짝수인지 홀수인지 판단해서 결과를 출력하세요
         * 짝수인 경우 "짝수다." 출력, 홀수인 경우 "홀수다." 출력
         *
         * -- 입력 예시 --
         * 정수를 하나 입력하세요 : 5
         *
         * -- 출력 예시 --
         * 홀수다.
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();

        if(num % 2 ==0){
            System.out.println("짝수다. ");
        }else {
            System.out.println("홀수다. ");
        }
    }
    public void testIf2(){


        /* 1~10 사이의 정수 한개를 입력받아 홀수인지 짝수인지 인지 확인하고,
         * 홀수이면 "홀수다.", 홀수가 아니면 "짝수다." 라고 출력하세요.
         * 단, 1~10 사이의 정수가 아닌 경우 "반드시 1~10 사이의 정수를 입력해야 합니다." 를 출력하세요.
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();

        if(num>0 && num<11 ){
            if(num % 2 != 0 ){
                System.out.println("홀수다. ");
            }else {
                System.out.println("짝수다. ");
            }
        }else {
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다. ");
        }
    }
    public void testIf3(){

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게와 키를 입력해주세요 : ");
        int weight = sc.nextInt();
        int height = sc.nextInt();


        int bmi = weight/((height/100)*(height/100));

        if(bmi<20){
            System.out.println("당신은 저체중 입니다. ");
        }else if(bmi>=20 && bmi<25){
            System.out.println("당신은 정상체중 입니다.");
        } else if (bmi>=25 && bmi <30) {
            System.out.println("당신은 과체중 입니다.");
        }else {
            System.out.println("당신은 비만입니다.");
        }

    }
    public void testIf4(){

        /* 두 과목의 평균이 60점 이상이면 합격
         * 한 과목이라도 40점 미만이면 불합격
         *
         * 2과목에 대한 값을 입력 받고 합계와 평균을 이용하여 구하시오.
         * ex) 영어 30, 수학 90
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("영어와 수학 점수를 입력해주세요 : ");
        int eng = sc.nextInt();
        int mat = sc.nextInt();

        int sum = eng+mat;
        int average = sum/2;

        if(average >= 60){
            if(eng < 40 || mat < 40){
                System.out.println("불합격");
            }else {
                System.out.println("합격");
            }
        }else{
            System.out.println("불합격");
        }
    }

}
