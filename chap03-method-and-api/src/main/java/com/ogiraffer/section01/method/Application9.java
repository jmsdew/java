package main.java.com.ogiraffer.section01.method;

public class Application9 {
    public static void main(String[] args){
        // static은 공통 영역에서 사용  - 변조된 값이 그대로 공유됨.
        // 용량이 정해져 있음. 용량이 많지 않음
        // 그래서 공통메소드 아니면 static 필드에 정의하지 않음

        /* 계산기 만들기 */

        int first = 100;
        int second = 50;

        int result = 0;

        Calculator app1 = new Calculator();

        result = app1.minNumberOf(first,second);

        System.out.println(result);

        result = Calculator.maxNumberOf(first,second);  // static 으로 인해 새로 할당된 app1안의 값을 쓰지 않음

        System.out.println(result);

    }

}
