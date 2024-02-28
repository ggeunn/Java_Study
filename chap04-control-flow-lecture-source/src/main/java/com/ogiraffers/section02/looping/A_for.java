package com.ogiraffers.section02.looping;

import java.util.Scanner;

public class A_for {

    public void testSimpleForStatement(){


        /* 수업목표. for문 단독 사용에 대한 흐름을 이해하고 적용할 수 있다. */
        /* 필기.
        *   [for 문 표현식]
        *   for(초기식; 조건식; 증감식){
        *       조건을 만족하는 경우 수행할 구문(반복할 구문);
        *   }
        *  */

        /* 필기. 1부터 10까지 1씩 증가시키면서(10번) i값을 출력하는 기본 반복문 */

        for(int i =1 ; i <=10; i++){
            System.out.println(i);
        }


    }
    public void testForExample1(){

        /* 수업목표. 무엇을 반복하는 지 확인하여 반복문으로 개선할 수 있다.(1)  */

        /* 필기. 5명의 학생 이름을 입력받아 이름을 출력해보자. */

        Scanner sc = new Scanner(System.in);

//        System.out.print("1번째 학생의 이름을 입력해주세요 : ");
//        String student1  = sc.nextLine();
//        System.out.println("1번째 학생의 이름은 "+ student1+ "입니다. ");
//
//        System.out.print("2번째 학생의 이름을 입력해주세요 : ");
//        String student2  = sc.nextLine();
//        System.out.println("2번째 학생의 이름은 "+ student2+ "입니다. ");
//
//
//        System.out.print("3번째 학생의 이름을 입력해주세요 : ");
//        String student3  = sc.nextLine();
//        System.out.println("3번째 학생의 이름은 "+ student3+ "입니다. ");
//
//
//        System.out.print("4번째 학생의 이름을 입력해주세요 : ");
//        String student4  = sc.nextLine();
//        System.out.println("4번째 학생의 이름은 "+ student4+ "입니다. ");
//
//
//        System.out.print("5번째 학생의 이름을 입력해주세요 : ");
//        String student5  = sc.nextLine();
//        System.out.println("5번째 학생의 이름은 "+ student5+ "입니다. ");
//
//        System.out.println("5명의 학생 이름을 입력 받고 출력하는 기능 완료");

        /* 필기.
        *   반복해야 하는 내용
        *   1. 안내문구 출력
        *   2. 학생의 이름을 입력받아 변수 저장
        *   3. 저장된 이름을 출력
        *  */

        /* 필기.
        *   반복 횟수는 1부터 5까지 1씩 증가하면서 총 5번을 반복된다.
        * */

        for(int i=1;i<=5;i++){

            System.out.print(i+"번째 학생의 이름을 입력해주세요 : ");
            String student = sc.nextLine();
            System.out.println(i+"번째 학생의 이름은 "+student+"입니다. ");

        }


    }

    public void testForExample2(){

        /* 수업목표. 무엇을 반복하는 지 확인하여 반복문으로 개선할 수 있다.(2) */

        /* 필기.
        *   문장 속에서 규칙 찾기
        *   1 ~ 10 까지의 합계를 구하시오.
        *  */


        int sum = 0;

        for(int num = 1 ; num <= 10; num++ ){

            sum += num; //sum = sum+num

        }

        System.out.println(sum);

    }
    public void testForExample3(){

        /* 수업목표. 무엇을 반복하는지 확인하여 반복문으로 개선할 수 있다.(3)  */

        /* 필기.
        *   5 ~ 10 사이의 난수를 발생시켜
        *   1부터 발생한 난수까지의 합계를 구해보자.
        * */

        // (Math.random() * 숫자의 범위) + 시작값

        int random = (int)(Math.random() * 6) + 5;

        int sum = 0;


        for(int i =1;i <= random; i++){
            sum += i;
        }
        System.out.println("random : "+random);
        System.out.println("sum : "+sum);


    }
    public void testForExample4(){

        /* 필기.
        *   숫자 두 개를 입력 받아 작은 수에서 큰 수 까지의 합계를 구하세요
        *   단, 두 숫자는 같은 숫자를 입력하지 않는다는 가정으로 해결한다.
        *  */

        /* 필기. 정수 두개 입력 */

        Scanner sc = new Scanner(System.in);
        System.out.print("첫번째 정수를 입력하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두번째 정수를 입력하세요 : ");
        int num2 = sc.nextInt();
        int sum = 0;

        if( num1>num2 ){
            for(int i = num2 ; i <= num1; i++ ){
                sum += i;  //sum = sum+i
            }
        }else {
            for(int i = num1; i <=num2; i++){
                sum += i;
            }
        }
        System.out.println("작은수부터 큰 수 합 : "+sum);

        /* 필기.
        *   결국 작은 수 부터 시작해서 큰 수까지의 합계를 구하는 것이기 떄문에
        *   num1 과 num2 중 어느것이 큰수인지 확인하면
        *   작은수 ~ 큰수 까지의 합계를 구하는 로직으로 바꿀 수 있다.
        *  */

        int min = 0;
        int max = 0;

        if(num1 > num2){
            min = num2;
            max = num1;
        }else {
            min = num1;
            max = num2;
        }

        int sum2 = 0;

        for(int i = min ; i <= max; i++ ){
            sum2 += i;
        }

        System.out.println("sum2 : "+sum2);

    }
    public void printSimpleGugudan(){

        Scanner sc = new Scanner(System.in);
        System.out.print("구구단 : ");
        int num = sc.nextInt();
        int mul = 0;

        if(num >= 2 && num <= 9 ){

            for (int i = 1; i <= 9;i++){
                mul = num * i;
                System.out.println(num + " * " + i + " = "+mul);

            }
        }else {
            System.out.println("반드시 2 ~ 9 사이의 양수를 입력해야 합니다. ");
        }


    }



}
