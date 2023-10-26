package main.java.com.ohgiraffers.section06.singleton;

public class EagerSingleton {

    private static EagerSingleton eager = new EagerSingleton();  // 자기 자신의 값을 자기 자신이 갖는다.
    // static 메모리도 heap메모리에 영역이 있음. getInstance를 가지고있어 실행할때 초기화를 하고 시작함.
    //  private로 인해 new로 생성되지 않음


    // 예를 들어
    private String name;
    private int age;


    private EagerSingleton(){
        this.name = "asd";
        this.age = 20;
        System.out.println("eager 실행됨");
        //  생성할 때 데이터를 가지고 생성됨.
    }

    public static EagerSingleton getInstance(){
        return eager;
    }
}
