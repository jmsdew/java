package main.java.com.ohgiraffers.section03.interfaceimplements;

import java.io.Serializable;

public class Product extends Object implements InterProduct, Serializable {
    // 추상메서드의 묶음 - 인터페이스(조작하기 위한 메소드) 만들어줌
    /*
    *클래스에서 인터페이스를 상속받을 때에는 implements 키워드를 사용한다.
    * 또한 인터페이스는 여러 개를 상속받을 수 있으며.
    * extend 로 다른 클래스를 상속받는 경우에도 그것과 별개로 인터페이스 추가 상속이 가능해진다.
    * 단 extends 키워드를 앞에 작성하고 implements 를 뒤에 작성한다.( 순서 변경시 에러)
    * */

    /*인터페이스에 추상 메서드는 구현 책임의 원칙으로 인하여 전부 구현해야 한다.
    * 단 default 메소드의 재정의는 선택이며 static은 재 정의가 불가능하다.
    * */
    @Override
    public void nonStaticMethod() {
        System.out.println("interProduct의 nonstaticMethod 오버라이딩 메소드 호출");
    }

    @Override
    public void abstMethod() {
        System.out.println("interProduct의 abstMethod 오버라이딩 메소드 호출");
    }

//    @Override    static 메소드의 경우 재정의가 불가능하다.
//    public static void staticMethod(){}

//    @Override   default 메소드를 재정의 하고자 하는 경우 default를 제외한다.
//    public default void defaultMethod(){}
    @Override
    public void defaultMethod(){
        System.out.println("default method 오버라이딩 호출");
    }


}
