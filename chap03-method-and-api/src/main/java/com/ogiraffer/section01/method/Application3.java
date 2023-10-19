package main.java.com.ogiraffer.section01.method;

public class Application3 {

    public static void main(String[] args){

        /*
        * 전달인자(argument = arg)와 매개변수(parameter)를 이용한 메소드 호출
        *
        * 변수의 종류
        * 1. 지역 변수 - method {}
        * 2. 매개 변수
        * 3. 전역 변수 (필드)  - class {}
        * 4. 클래스(static) 변수
        * ! 번외 - 클래스 속성(method,variable 포함)
        *
        * 지역변수는 선언한 메소드 블럭 내부에서만 사용이 가능하다.
        * 이것을 지역변수의 스코프라고 한다. - {}
        * 다른 메소드간 서로 공유해야 하는 값이 존재하는 경우 메소드 호출 시 사용하는 괄호를 이용해서
        * 값을 전달할 수 있다.
        * 이 떄 전달하는 값을 전달인자(argument)라고 부르고, 메소드 선언부 괄호 안에 전달 인자를 받기 위해 선언하는 변수를
        * 매개변수(parameter)라고 부른다.
        *
        * */

        int num;                 // 지역변수
        int num2;

        Application3 app3 = new Application3();
        app3.testMethod(28);   /// testMethod 라는 메소드(함수) 호출 sout 실행됨

        byte bytAge = 20;
        app3.testMethod(bytAge);   /// testMethod 라는 메소드(함수) 호출 sout 실행됨

        long longAge = 30;
        app3.testMethod((int)longAge);  /// int로 형변환 해주어야 함

        app3.testMethod(330);   /// testMethod 라는 메소드(함수) 호출 sout 실행됨
        app3.testMethod(bytAge*30);   /// testMethod 라는 메소드(함수) 호출 sout 실행됨
    }

    public void testMethod(int age){
        System.out.println("당신의 나이는 " + age + "세 입니다.");
    }
}
