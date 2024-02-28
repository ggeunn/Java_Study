package com.ogiraffers.section01.array;

import java.util.Scanner;

public class Pratice {

    public static void main(String[] args) {

        /*
        * 주민등록번호 성별자리 이후부터 *로 가리고 출력하세요. 단, 원본 배열 값은 변경 없이 배열 복사본으로 변경하세요.

        ex.주민등록번호(-포함) : 123456-1234567
            123456-1******
        * */

        Scanner sc = new Scanner(System.in);
        System.out.println("주민등록번호(-포함) : ");
        String num = sc.nextLine();
        char[] carr = new char[14];

        for(int i = 0; i<carr.length ; i++){
            carr[i] = num.charAt(i);
        }
        char[] copy = carr.clone();
        for(int i = 8 ; i < copy.length; i++ ){
            copy[i]='*';
        }
        System.out.println(copy);


//        int [] arr 배열안에 있는 수 를 for 문을 이용해서 전부 더한값을 출력하세요.

        int[] arr = {10 , 20 , 30 ,40 ,50};
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {

            sum+=arr[i];

        }

        System.out.println(sum);

    }
}
