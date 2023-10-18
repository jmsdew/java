package section05.typecasting;

public class test {

    public static void main(String[] args){



        // 5명의 반 학생이 있므며 학생의 키는 각각
        // 178.5 / 170.3 / 190.7 / 188.678 / 160.8
        // 우리는 학생의 평균 키를 구해서 화면에 보여주고자 한다. (소수자리 절삭)
        // 화면에 보여지는 양식은 다음과 같다.
        // 1반 학생 5명의 키의 평균은 cm 이다.

        System.out.println("-------------------------------------------------------");


        double totalTall = 178.5 + 170.3 + 190.7 + 188.678 + 160.8;
        int tall = (int)(totalTall / 5);

        System.out.println("1반 학생 5명의 키의 평균은 " + tall + "cm 이다.");



        System.out.println("-------------------------------------------------------");

        // 문서 z에 대응하는 숫자를 화면에 출력
        int z = 'z';
        System.out.println(z);


        // 차이 설명
        long lnum = 10L;
        int num = 190;

        int sum = (int)lnum + num;    // 형변환 1번
        int sum2 = (int)(num +lnum); // int와 long을 더하면 long 값으로 반환되기 때문에 (int)를 넣어 형변환을 해주어야 함

        System.out.println("-------------------------------------------------------");

        /*
        * 사업을 시작한 홍길동은 10월18일 매출에서 부가세(10%)를 제외한 소득을 알고 싶다.
        10-18의 매출은 다음과 같다.
        150400원
        1400원
        25000원
        30000원
        여기서 부가세 10%는 변하지 않는 값이라는 점에 유의하자
        * */

        int totalMoney = (150400 + 1400 + 25000 + 30000);
        double haveMoney = totalMoney * 0.9 ;
        int money = (int)haveMoney;

        System.out.println("10월 18일의 총 매출은 " + totalMoney + "원 이다.");
        System.out.println("10월 18일의 부가세 제외 소득은 " + money + "원 이다.");


        System.out.println("-------------------------------------------------------");

    }
}
