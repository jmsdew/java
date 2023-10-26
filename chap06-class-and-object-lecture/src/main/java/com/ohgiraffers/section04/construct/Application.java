package main.java.com.ohgiraffers.section04.construct;

public class Application {
    public static void main(String[] args){
        // jdk 개발환경키드 java development kit
        /*
        * 생성자란?
        * 인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를 생성할 때 호출된다.
        * 생성자 함수에 매개변수가 없는 생성자를 기본생성자(default contrtctor) 라고 하며,
        * 기본 생성자는 cpmpiler에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고 사용되었다.
        * (인스턴스 생성 시 별도로 수행할 명령이 없었기 때문에 아무 것도 작성하지 않은 것이다.)
        * */
        
        //원시자료형 == 기본자료형
        int a;
        //변수 == 주소 == 값  키보드 a  - 스택 영역에 생성
        
        // 변수 == 주소값 == 속성  키보드 그 자체
        //참조자료형 == 레퍼런스 타입 == 변수 선언 == 사용자 정의 = heap 영역에 생성(동적으로 데이터가 늘어날 수 있음)
        
        // int 같은 기본 자료형은 데이터가 늘어날 수 없음 - 스택 영역에 고정으로 생성 - 값만 바뀜
        // 참조자료형 -- 데이터가 늘어날 수 있음. 
        // 배열에 내용을 추가하거나 클래스에 내용을 추가할 수 있음.
        User user;  //선언
        
        user = new User(); // 자리를 만듦 변수 생성

        User user1 = new User("asd", "asd");
        
    }
}
