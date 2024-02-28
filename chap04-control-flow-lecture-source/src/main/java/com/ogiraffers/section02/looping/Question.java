package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class Question {
    /* 1부터 10까지의 숫자를 출력하는 프로그램 */
    public void test1(){
        for(int i = 1; i <=10; i++){
            System.out.println(i);
        }
    }

    /* 10부터 1까지의 숫자를 역순으로 출력하는 프로그램 */

    public void test2(){
        for(int i = 10; i>=1; i--){
            System.out.println(i);
        }
    }

    /* 구구단 7단을 출력하는 프로그램 */

    public void test3(){
        for(int i = 1; i <=9; i++){
            System.out.println("7 * "+i+" = "+(7*i));
        }
    }

    /* 1부터 100까지의 숫자 중 짝수만 출력하는 프로그램 */

    public void test4(){
        for(int i = 1; i <=100; i++){
            if(i % 2 ==0){
                System.out.println(i);
            }
        }
    }

    /* 사용자로부터 입력받은 숫자의 팩토리얼을 계산하는 프로그램
     *   팩토리얼은 6! = 1 * 2 * 3 * 4 * 5 * 6
     * */
    public void test5(){
        Scanner sc = new Scanner(System.in);
        System.out.print("숫자를 입력해 주세요 : ");
        int num = sc.nextInt();
        int mul = 1;

        for(int i = num; i>=1; i--){

            mul *= i;
            if(i == 1) {
                System.out.print(i + " = ");
            }else {
                System.out.print(i +" * ");
            }

        }
        System.out.print(mul);
    }
    /* 0시 0분에서 23시 59분 까지 출력하는 프로그램을 작성해보자 */
    public void test6(){

        for(int i = 0; i <=23 ; i++){
            for(int j = 0; j <= 59; j++){
                System.out.println(i+"시 "+j+"분");
            }
        }
    }


    /* 별 만들기 게임
     *   *
     *   **
     *   ***
     *   ****
     *   *****
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void test7(){
        for(int i = 1; i<6; i++){
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    /* 별 만들기 게임
     *      *
     *     ***
     *    *****
     *   *******
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */

    public void test10(){
        
        int num = 1;

        for (int i = 0; i < 5; i++) {
            for (int j = 4; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j < num; j++) {
                System.out.print("*");
            }
            num = num +2;
            System.out.println();
        }
    }
    public void test8(){

        for(int i=0;i<4;i++){
            for(int j=0;j<3-i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
    /* 별 만들기 게임
     *       *
     *     ***
     *    ****
     *   *****
     *
     *   이런 식으로 행이 늘어날 때 별도 들어나는 식을 만들어보자
     *
     *  */
    public void test9(){
        for (int i = 6; i > 0; i--) {
            for (int k = 1; k < i; k++) {
                System.out.print(" ");
            }
            for (int j = 6; j > i; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
