package main.java.com.ohgiraffers.section06.finalkeyword;

public class FinalFieldTest {
    
    /*
    * 필기
    * final
    * : final은 종단의 의미를 가지는 키워드이다.
    * final 키워드를 사용할 수 있는 위치는 다양한 편이며 의미가 약간 다르지만 결국 변경 불가의 의미이다.
    * 
    * 1. 지역변수 : 초기화 이후 값 변경 불가   final String value = "final";
    * 2. 매개변수 : 호출시 전달한 인자 변경 불가 method(final String value;)
    * 3. 전역변수 ; 인스턴스 생성 후 초기화 이후에 값 변경 불가   - 인스턴스는 구체적은 사례를 의미
    * 4. 클래스(static) 변수 : 프로그램 start 이후 값 변경 불가    --스태틱 변수와 메소드 다름
    * 5. non-static 메소드 : 메소드 재작성(overriding) 불가
    * 6. static 메소드 : 메소드 재작성(overriding) 불가
    * 7. 클래스 : 상속 불가
    *
    * final은 변경 불가의 의미를 가진다.
    * 따라서 초기 인스턴스(생성된 객체)가 생성되고 나면 기본값 0이 필드에 들어가게 되는데,
    * 그 초기화 이후 값을 변경할 수 없기 때문에 선언하면서 바로 초기화를 해 주어야 한다.
    * 그렇지 않으면 컴파일러 에러가 발생한다.
    * */

  //  private final int nonStaticNuml;

    private final int NON_STATIC_NUM = 1;
    
    private final String NON_STATIC_NAME;
    
    public FinalFieldTest(String nonStaticName){                 // 사용자가 입력하는 값으로 초기화해서 생성됨
        this.NON_STATIC_NAME = nonStaticName;
    }
//    private static final int STATIC_NUM;   // STATIC은 생성자를 써서 초기화가 불가능 - 프로그램 생성 시점에 값이 할당되어야 함
    private static final int STATIC_NUM = 10;   // 값을 미리 지정해서 초기화하기

    private static final double STATIC_DOUBLE;  // 스태틱블록에 값을 입력해 주면 프로그램을 시작할 때 같이 읽어주고 값을 가져서 생성
    static{
        STATIC_DOUBLE = 10;                  // 따로 따로 지정 해준 것 보다 가독성이 좋음
    }
}
