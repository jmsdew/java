package main.java.com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args){

        /*
        * singleton pattern (하나의 디자인 패턴)
        * 애플리케이션이 시작될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고 그 메모리에 인스턴스를
        * 만들어서 하나의 인스턴스를 공유해 사용하며 메모리 낭비를 방지할 수 있게 함(매번 인스턴스를 생성하지 않음)
        *
        *
        * 장점
        * 1. 첫 번째 이용 시에는 인스턴스를 생성 해야 하므로 속도 차이가 나지 않지만
        *    두 번째 이용 시에는 인스턴스를 생성 하는 시간 없이 사용할 수 있다.
        * 2. 인스턴스가 절대적으로 한 개만 존재 하는 것을 보증할 수 있다.
        *
        * 단점
        * 1. 싱글톤 인스턴스가 너무 많은 일을 하거나 메모리를 공유 하면 결합도가 높아 진다.
        *   (유지보수와 테스트에 문제점이 있음)
        * 2. 동시성 문제를 고려 해서 설계 해야 하기 때문에 난이도가 있다.
        * */

        /*
        * 싱글톤 구현 방법
        * 1. 이른 초기화 ( Eager Initialization)
        * 2. 게으른 초기화 ( Lazy Initialization)
        * */

        EagerSingleton eager1 = EagerSingleton.getInstance();  // 첫 생성시에는 속도가 같지만 두번째 생선시 부터 싱글톤 이 속도가 월등히 빠르다.
        System.out.println(eager1.hashCode());
        eager1 = EagerSingleton.getInstance();
        System.out.println(eager1.hashCode());

        System.out.println("lazy================");
        LazySingleton lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode());
        lazy = LazySingleton.getInstance();
        System.out.println(lazy.hashCode());
    }
}
