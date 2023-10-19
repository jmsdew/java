package main.java.com.ogiraffer.Question;

import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {


       // 2.
        /*
         * 식당에서 스파게티, 햄버거, 스테이를 주문하고 맛있게 먹었다.
         * 계산은 직접 가격을 입력하면 팁 20%가 추가된 최종 가격을 출력하는 기계에서 한다.
         * 음식의 가격을 직접 입력하면 최종 가격이 나오는 코드를 짜보자.
         * 1. Scanner 활용
         * 2. 계산식은 Quiz_Static 클래스에 입력하고  메인 클래스에 static 메소드를 호출하라
         * 출력화면은 "음식1 가격은?" -> "음식2 가격은?" -> "음식3 가격은?" -> "택스 포함 최종 가격은 —원 입니다."
         */
        Scanner scr = new Scanner(System.in);

        Question5 app1 = new Question5();

        System.out.println("음식1 가격은?");
        int spa = scr.nextInt();
        System.out.println("음식2 가격은?");
        int ham = scr.nextInt();

        System.out.println("음식3 가격은?");
        int ste = scr.nextInt();

        int totalP = app1.total(spa,ham,ste);
        System.out.println("택스 포함 최종 가격은 " +totalP+ "원 입니다.");



    }
        public int total(int a, int b, int c){
            int totalCost = (int)((a+b+c)*1.2);
            return totalCost;

        }


}
