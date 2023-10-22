package main.java.com.ohgiraffers.section02.looping;

import java.util.Scanner;

public class question2 {

    public static void main(String[] args){

        // 음료 계산
        // 자판기를 만들어보자.
        // 자판기가 파는 음료는 사이다(500)   콜라(600)   환타(700)   바카스(1000)  핫식스(1500)
        // 잘못된 음료수를 선택했을 때는 다시 받아야 한다.
        // 예시)
        // 계산을 입력하면 총 금액을 출력해야 한다.
        //음료를 선택해주세요 : 사이다
        //사이다를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //n
        //음료를 더 선택해주세요.
        //몰라
        //잘못된 음료입니다. 다시 선택해주세요:
        //콜라
        //콜라를 선택하셨습니다.
        //계산하시겠습니까?(y/n)
        //y
        //총금액은 1100입니다.
        Scanner scr = new Scanner(System.in);
        
        // 자판기 기본 출력문
        // 음료를 선택하기.
        // 잘못된 음료 선택시 돌아가기
        // 계산하시겠습니까 yes or no
        // yes시 총 금액은 --원 입니다.
        // no 시 음료를 더 선택해주세요 출력


        int totalPrice = 0;
        for(;;) {
            System.out.println("사이다(500)   콜라(600)   환타(700)   바카스(1000)  핫식스(1500)");
            System.out.println("음료를 선택해주세요");
            String first = scr.next();

            int price = 0;

            if (first.equals("사이다")) {
                price += 500;
            } else if (first.equals("콜라")) {
                price += 600;
            } else if (first.equals("환타")) {
                price = 700;
            } else if (first.equals("바카스")) {
                price = 1000;
            } else if (first.equals("핫식스")) {
                price = 1500;
            } else {
                System.out.println("잘못된 음료입니다. 다시 입력 해주세요");
                continue;
            }

            System.out.println("계산 하시겠습니까 y/n");
            String second = scr.next();
            totalPrice += price;
            if (second.equals("y")) {
                System.out.println("총 금액은 " + totalPrice + "원 입니다.");
                break;
            } else if (second.equals("n")) {
                System.out.println("음료를 더 선택 해주세요");

            } else {
                System.out.println("정확하게 입력 해주세요");

            }
        }



    }
}
