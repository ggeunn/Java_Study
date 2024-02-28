package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Question1 {

    /* 1부터 10까지의 숫자를 출력하는 프로그램 */
    public void test1(){

        int i = 1;
        while (i <= 10){
            System.out.println(i);
            i++;

        }
    }

    /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */
    public void test2(){

        int i = 10;
        while (i >=1){
            System.out.println(i);
            i--;

        }
    }

    /* 구구단 7단을 출력하는 프로그램 */
    public void test3(){

        int i = 1;
        while (i < 10){

            System.out.println("7 * "+i +" = "+ (7*i));
            i++;

        }
    }

    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */
    public void test4(){

        int i=1;

        while (i <=100){
            if(i % 2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
     *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
     * */
    public void test5(){

        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int num = sc.nextInt();
        int mul = 1;

        while (num >= 1 ){

            mul *= num;
            if(num == 1){
                System.out.print(num+" = ");
            }else {
                System.out.print(num+ " * ");
            }
            num--;

        }

        System.out.println(mul);

    }
    /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */
    public void test6(){

        int i = 0;
        int j = 0;

        while (i<24){

            while (j<60){
                System.out.println(i+"시 "+j+"분");
                j++;
            }
            i++;
            j = 0;
        }
    }


}
