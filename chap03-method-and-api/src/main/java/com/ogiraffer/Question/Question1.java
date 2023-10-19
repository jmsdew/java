package main.java.com.ogiraffer.Question;



public class Question1 {
    public static void main(String[] args) {

        // 주문한 음식의 가격을 합을 출력하려고 한다.
        // 식당의 메뉴는 탕수육, 마파두부, 짜장면이 있으며,
        // 탕수육의 가격은 4만원
        // 마파두부의 가격은 2만원
        // 짜장면의 가격은 1만원 이다.

        // 탕수육, 마파두부, 짜장면 3그릇을 주문하였을 때 가격의 합을 출력하시오.
        // method 를 사용하시오.
        // 출력되는 값은 다음과 같다. "주문하신 음식 가격의 합은 : #만원 입니다."

        int mapa = 2;
        int tangsu = 4;
        int zza = 1;

        Question1 app1 = new Question1();

        int sum2 = app1.sum(mapa,tangsu,zza);

        System.out.println("주문하신 음식 가격의 합은 : "+ sum2 + "만원 입니다.");


    }
    public int sum(int a, int b, int c){
        int sum1 = a+b+c;
        return sum1;
    }
}
