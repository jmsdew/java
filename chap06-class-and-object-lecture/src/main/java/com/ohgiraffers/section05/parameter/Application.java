package main.java.com.ohgiraffers.section05.parameter;

public class Application {
    public static void main(String[] args){

        ParameterTest pt = new ParameterTest();

        int num = 20;
        pt.testPrimarytypeParameter(num);
        int[] iarr = new int[]{1,2,3,4,5,6,7};
        System.out.println("인자로 전달하는 값 : " + iarr[0]);
        pt.testPrimaryTypeArrayParameter(iarr);
        System.out.println("전달 후 iarr의 값 : " +iarr[0]);  // 같은 주소 값을 가지고 있음.

        System.out.println();

        RactAngle r1 = new RactAngle(12.5, 22.5);
        System.out.println("인자로 전달하는  r1의 값 : " + r1);
        r1.calcRound();
        r1.calcArea();

        pt.testClassTypeParameter(r1);
//        System.out.println("변경 후 사각형의 넓이와 둘레 : " );
//        r1.calcRound();
//        r1.calcArea();

        pt.testVariableLengthArrayParameter("홍길동");

        pt.testVariableLengthArrayParameter("홍길동", "농구", "헬스","뮤지컬");  // 배열처리는 뒤에 있을수도 있고 없을수도 있는 가변형이라 생략 가능
        test(10,20,30);
        test(10);
    }
    public static void test(int... num){  /// 가변 배열
        System.out.println("하나를 넘겨도 배열 여러개를 넘겨도 배열 "+num.length);   
    }

}
