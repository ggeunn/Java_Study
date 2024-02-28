package com.ogiraffers.section05.overloading;

public class OverloadingTest {

    /* 수업목표. 오버로딩(overloading) 에 대해 이해할 수 있다. */

    /* 필기.
    *   오버로딩의 사용 이유
    *   배개변수의 종류별로 메소드 내용을 다르게 작성해야 하는 경우들이 종종 있다.
    *   이 때, 동일한 기능의 메소드를 매개변수에 따라 다르게 이름을 정의하면 복잡하고
    *   관리하기가 매우 어려울 것이다.
    *   규모가 작은 프로그램의 경우는 정도가 덜 하겠지만, 규모가 거대해지면 메소드 또한
    *   관리하기 힘들어진다.
    *   따라서 동일한 이름으로 다양한 종류의 매개변수에 따라 처리해야 하는 여러 메소드를
    *   동일한 이름으로 관리하는 기술을 오버로딩이라고 한다.
    * */

    /* 필기.
    *   오버로딩의 조건
    *   동일한 이름을 가진 메소드의 파라미터 선언부에 매개변수의 타입, 갯수, 순서를
    *   다르게 작성하여 한 클래스 내에  */

    /* 필기.
    *   메소드의 시그니쳐란?
    *   public void method(int num) {}
    *   즉, method(int num) <- 이 부분이 시그니처이다.
    *   메소드의 접근제한자나 반환형은 오버로딩 성립요건에 해당하지 않는다.
    * */

    public void test(){}

    //메소드의 시그니쳐가 동일한 경우 오류
//    public void test(){}

    //접근제한자에 따른 오버로딩
//    private void  test(){}

    // 반환형에 따른 오버로딩 성립확인
//    public int test(){return 0;}

    public void test(int num){} //파라미터 선언부는 메소드 시그니처에 해당한다.

//    public void test(int num2){} //매개변수의 이름은 시그니처에 영향을 주지않는다.

   //메게변수 갯수에 따른 오버로딩 성립 확인
    public void test(int num1 , int num2){}

    //매개변수 타입 변화에 따른 오버로딩 성립확인
    public void test(int num, String name){}

    //매개변수의 순서에 따른 오버로딩 성립 확인
    public void test(String name, int num){}


}
