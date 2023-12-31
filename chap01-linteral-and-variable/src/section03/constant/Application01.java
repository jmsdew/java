package section03.constant;

public class Application01 {
//명시선언 클래스 클래스 이름    
    public static void main(String[] args) {
        // 메인 메서드 (프로그램의 실행부)
        //      static - 생성자 없이 동작 가능  void - 반환타입 X  main - 함수의 이름을 지음
        // String[] - 문자열 배열  args - 매개변수
        /*
        * 상수란?
        * 변수가 메모리에 변경될 값을 저장하기 위한 공간을 나타낸다면, 상수는 이와 상반되는 개념이다.
        * 변하지 않는 값을(고정된 값)저장해두기 위한 메모리상의 공간을 상수라고 한다.
        *
        * 상수의 사용 목적
        * 변경되지 않는 고정된 값을 저장할 목적으로 사용한다.
        * 초기화 이후 값 대입 시 컴파일 에러를 발생시켜 값이 수정되지 못하도록 한다.
        *
        * 사용방법
        * 1. 상수를 선언한다.(변수 선언과 유사하지만 final 키워드를 사용함)
        * 2. 값을 초기화한다. (초기화 이후에는 값 변경 불가능)
        * 3. 필요한 위치에 상수를 호출해서 사용한다.
        * */
        //상수는 선언시에 final 키워드를 붙인다.
        // 암묵적인 개발자들의 규칙으로 상수는 일반 변수와 구분하기 위하여 대문자로 작성한다.
        final int AGE;

        //상수 필드 초기화
        AGE = 10;
        // AGE = 30; // 초기화 이후 상수 값은 변경할 수 없기 때문에 에러가 발생한다.
        System.out.println("age의 값 : " + AGE);
        //필요시 연산식에 호출해서 사용가능
        System.out.println("AGE의 두배의 값 : " + (AGE*2));

        //대입 연산시 활용
        int sum = AGE;
    }
}
