package main.java.com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable {

    /*
    * 클래스 영역에 작성하는 변수를 필드라고 한다.
    * 필드 == 맴버변수 (클래스가 가지는 맴버라는 의미) == 전역 변수 ( 클래스 전역에서 사용할 수 있는 변수라는 의미)
    * */

    /*
    * non-static field를 인스턴스 변수라고 한다.
    *
    * */
    private int globalNum;

    // static field를 정적필드(클래스 변수)라고 한다. 정적(클래스) 영역에 생성되는 변수라는 의미이다.
    private int num;  // 스택 할당
    private static int staticNum; // static으로 스택 할당



    private void testMethod(int num){    // 할당
        /*
        * 메소드 영역에서 작성하는 변수를 지역변수라고 한다.
        * 메소드의 괄호 안에 선언하는 변수를 매개변수라고 한다.
        * 매개변수도 일종의 지역변수로 생각하면 된다.
        * 지역변수와 매개변수 모두 메소드 호출 시 stack을 할당받아 stack 생성된다.
        * */
        int localNum;
        System.out.println(num); // stack을 할당받음
       // System.out.println(localNum); //  지역변수는 반드시 초기화 해 주어야 한다.
        System.out.println(globalNum); // 전역변수는 기본값으로 초기화가 된다.
        System.out.println(staticNum);
    }
    
    public void testMethod2(){
        // System.out.println(localNum);    메소드를 벗어난 지역변수 호출 안됨
        System.out.println(globalNum);
        System.out.println(staticNum);
    }
}
