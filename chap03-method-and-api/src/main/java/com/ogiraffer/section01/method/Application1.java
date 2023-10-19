package main.java.com.ogiraffer.section01.method;

public class Application1 {          //클래스  --참조 자료형

    public static void main(String[] args){       //메소드
        /* static은 이미 따로 공간을 가지고 있다.. 스태틱이 빠져있으면 선언을 따로 해줘서 공간을 만들어야 한다.
        * 메소드란?
        *
        * 메소드(method)는 어떤 특정 작업을 수행하기 위한 명령문의 집합이라고 할 수 있다.
        * */
        System.out.println("main()메서드 시작됨...");
        
        //새로운 함수를 만든다
        Application1 app1 = new Application1();
        System.out.println("hashCode :" + app1.hashCode());
//        Application1 app1;  ---- 메모리에 공간 확보
//        app1 = new Application1(); -- app1이 가진 공간에 application1이 가진 값을 할당한다.
        

        app1.methodA();
    }
    //새로운 함수를 만든다.
    //  public 접근제어자 -모두가 공통적으로 쓸 수있음
    // void - 반환 타입 : 반환해줄게 없음
    // method - 함수 이름 () - 파라미터 ; 자료형을 기입해줘야 동작함 / 자바스크립트와 차이점
    public void methodA(){
        System.out.println("methodA() 호출");
        
        methodB();

        System.out.println("methodA() 종료");
    }
    public void methodB(){
        System.out.println("methodB() 호출");
        methodC();
        System.out.println("methodB() 종료");
    }   
    public void methodC(){
        System.out.println("methodC() 호출");
        System.out.println("methodC() 종료");
    }
}
