package main.java.com.ohgiraffers.section01.extend;

public class FireCar extends /*상속을 위해 부모라고 알려주는 키워드*/ Car /*Car 에게 상속 받음*/ {

    public FireCar() {

        /*
         * 모든 생성자에게는 맨 첫 줄에 super()를 컴파일러가 자동 추가한다.
         * 부모의 기본 생성자를 호출하는 구문이다.
         * 해당 생성자가 호출 될 시 가장 먼저 Car() 클래스 호출 내용이 출력될 것이다.
         * 명시적, 묵시적 전부 사용 가능하다.
         * 다중 상속은 지원되지 않음
         * */
        super();
    }

    @Override  // 부모가 가진 기능 재정의
    public void soundHorn() {                    // 접근 제한자와 반환타입을 부모와 맞춰줘야 함
        if (isRunning()) {               // 부모가 가진 걸 호출  super. 생략 가능
            System.out.println("빠앙 빠아아앙ㅇ아아앙앙~~!");
        } else {
            System.out.println("소방차가 앞으로 갈 수 없습니다.");
        }

    }

    public void sprayWater(){
        System.out.println("불난 곳을 발견했습니다. 물을 뿌립니다!");
    }
}
