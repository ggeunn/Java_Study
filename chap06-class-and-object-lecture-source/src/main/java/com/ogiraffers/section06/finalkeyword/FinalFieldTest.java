package com.ogiraffers.section06.finalkeyword;

import javax.swing.plaf.PanelUI;

public class FinalFieldTest {

    /* 수업목표. final 키워드에 대해 이해할 수 있다. */
    /* 필기.
     *   final
     *   : final 은 종단의 의미를 가지는 키워드이다.
     *   final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만, 결국 변경 불가의 의미.
     *   1. 지역변수 : 초기화 이후에 값 변경 불가
     *   2. 매개변수 : 호출 시 전달한 인자 변경 불가
     *   3. 전역변수 : 인스턴스 생성 후 초기화 이후 값 변경 불가
     *   4. 클래스(static) 변수 : 프로그램 start 후 값 변경 불가
     *   5. non-static 메소드 : 메소드 재작성(overriding) 불가
     *   6. static 메소드 : 메소드 재작성(overriding) 불가
     *   7. 클래스 : 상속 불가
     *  */

    /* 목차. 1. non-static field 에 final 사용  */
    /* 필기.
    *   final은 변경 불가
    *   따라서 초기 인스턴스가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    *   그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기값을 넣어야한다.
    * */
//    private final int nonststicNum;

    /* 해결방법 2가지 */

    //선언과 동시에 초기화
    private final int NON_STATIC_NUM = 1;

    //생성자를 이용해 초기화
    private final String NON_STATIC_NAME;
    public FinalFieldTest(String nonStticName){this.NON_STATIC_NAME = nonStticName;}

    /* 목차. 2. static field 에 final 사용  */
    /* 필기.
    *   static 에서도 자바에서 지정한 기본값이 초기에 들어가기 때문에
    *   final 키워드 사용시 초기화 하지않으면 에러가 발생한다.
    *  */
    private static final int STATIC_NUM = 1;

    private static final double STATIC_DOUBLE;

    /* 필기.
    *   생성자를 이용한 초기화는 불가능하다
    *   생성자는 인스턴스가 생성되는 시점에 호출되기 때문에 그 전에는 초기화가 일어나지 못한다.
    *   하지만 static 은 프로그램이 start 될 때 할당되기 때문에 초기화가 되지않은 상태로 선언된 것과 동일하여
    *   기본값으로 초기화 된 후 값을 변경하지 못하기 떄문에 에러가 발생한다.
    *   */

    static {
        STATIC_DOUBLE = 0.5;
    }

}
