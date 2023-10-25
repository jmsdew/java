package main.java.com.ohgiraffers.section04.parameter;

public class ParameterTest {

    public void testPrimarytypeParameter(int num){
        System.out.println("매개변수로 전달받은 값 : " + num);
        num = 10;
        System.out.println("변경 후 매개변수 값 : " + num);
    }

    public void testPrimaryTypeArrayParameter(int[] iarr){
        System.out.println("매개 변수로 전달 받은 값 : " + iarr);

        System.out.println("배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
        iarr[0] = 99;
        System.out.println("변경 후 배열의 값 출력 : ");
        for (int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();
    }

    public void testClassTypeParameter(RactAngle ractAngle){
        System.out.println("매개변수로 전달받은 값 : " + ractAngle);

        System.out.println("변경 전 사각형의 넓이와 둘레 ======");
        ractAngle.calcArea();
        ractAngle.calcRound();
        System.out.println("변경 후 사각형의 둘레와 넓이 =======");
        ractAngle.setWidth(100);
        ractAngle.setHeight(100);
        ractAngle.calcArea();
        ractAngle.calcRound();
    }

    public void testVariableLengthArrayParameter(String name, String... hobby){  // 가벼운 배열 (...) 배열의 길이를 모를때 배열을 정의할 때 사용함.
                                                                                // 배열처리는 뒤에 있을수도 있고 없을수도 있는 가변형이라 생략 가능
        System.out.println("이름 : " +name);
        System.out.println("취미의 갯수 : " +hobby.length);
        System.out.print("취미 : ");
        for (String hobbys: hobby) {
            System.out.print(hobbys + " ");
        }
        System.out.println();
    }
}
