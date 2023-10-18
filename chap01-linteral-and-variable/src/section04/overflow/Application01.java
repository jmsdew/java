package section04.overflow;

public class Application01 {

    public static void main(String[] args){
        /*
        * 자료형 별 최대 범위를 벗어나는 경우
        * 발생한 carry를 버림 처리하고 sign bit를 반전시켜 최소값으로 순환시킴
        *
        * */

        byte num1 = 127;
        //byte = -128~127 까지
        System.out.println("num1 :" + num1);
        num1++;
        System.out.println(num1);


        /*
        * 언더 플로우
        * 오버플로우와 반대 개념으로 최소 범위보다 작은 수를 발생시키는 경우 발생하는 현상이다.
        * */

        byte num2 = -128;
        System.out.println("num2 : " +num2);
        num2--;
        System.out.println(num2);


        /*
        * 이러한 현상이 발생해도 그냥 넘기는 경우가 발생할 수 있는데
        * 이러한 경우를 논리적 에러라고 표현한다. (논리적 에러는 개발자의 실수로 인해서 발생되는 것으로 디버깅이 가장 힘들다)
        * */

        int firstNum = 10000000;
        int secondNum = 700000;
        int multi = firstNum*secondNum;
        System.out.println(multi);
        
        // 오버플로우를 해결하기 위한 방법
        long multi2 = (long)firstNum*secondNum; //지시자 long을 넣어줘야함 자바 기본 숫자 타입은 int기 때문에
        System.out.println(multi2);

    }
}
