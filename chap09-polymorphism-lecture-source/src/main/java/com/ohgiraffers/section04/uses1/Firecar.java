package main.java.com.ohgiraffers.section04.uses1;

public class Firecar extends Car implements Soundable {
    @Override
    public void go() {
        System.out.println("소방차가 달려갑니다.");
    }

    @Override
    public void stop() {
        System.out.println("소방차가 멈춥니다..");
    }

    @Override   // 구현 책임을 다르게 해줌  -- 모든 차가 가지고 있지 않기 때문에
    public void horn() {
        System.out.println("소방차가 나갑니다. 비키세요 급합니다.");
    }
}
