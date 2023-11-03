package main.java.com.ohgiraffers.section01.generic;

public class Application {
    public static void main(String[] args){

        /*
        * 제네릭
        * 제네릭의 사전적 의미는 일반적인 이라는 의미이다.
        * 자바에서 제네릭이란 데이터의 타입을 일반화한다는 의미를 가진다.
        *
        * 제네릭은 클래스나 메소드에서 사용할 내부의 데이터 타입을 컴파일 시에 지정하는 방법을 말한다.
        *컴파일 시에 미리 타입 검사를 시행하게 되면 클래스나 메소드 내부에서 사용되는 객체의 타입
        * 안정성을 높일 수 있으며 (잘못된 타입의 경우 컴파일 에러를 발생시킴)
        * 반환값에 대한 타입 변환 및 탕비 검사에 들어가는 코드 생략이 가능해진다.
        * (instanceof 비교 및 다운캐스팅 작성 불필요)`
        * jdk 1.5 버전 부터 추가된 문법이다.
        *
        * 제네릭 프로그래밍
        * 데이터의 형식에 의존하지 않고 하나의 값이 여러 다른 데이터 타입을 가질 수 있는 기술에
        * 중점을 두어 재 사용성을 높일 수 잇는 프로그래밍 방식이다.
        *
        *
        * */
        GenericTest<Integer> gt1 = new GenericTest<Integer>();

        gt1.setValue(new Integer(10));  // int a = 10;   레퍼클래스 - 프리미티브 타입을 레퍼런스 타입으로 new를 생성해 감싸주는 것
      //  Integer test = new Integer();
      //  test = null;
        // int a = null; - 프리미티브 타입은 불가
        System.out.println(gt1.getValue());
        System.out.println(gt1.getValue() instanceof Integer);

        GenericTest<String> gt2 = new GenericTest<String>();
        gt2.setValue("홍길동");
        System.out.println(gt2.getValue());
        System.out.println(gt2.getValue() instanceof String);

        GenericTest gt3 = new GenericTest();
        gt3.setValue(new Double(1.5));
        System.out.println(gt3.getValue());
        System.out.println(gt3.getValue() instanceof Double);
    }
}
