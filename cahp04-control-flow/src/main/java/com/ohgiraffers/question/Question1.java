package main.java.com.ohgiraffers.question;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args){

        // up down 게임 만들기
        // 랜덤으로 생성된 수를 맞추는 게임입니다.
        // 랜덤으로 생성하는 수의 범위는 1~50 입니다.
        // 입력한 수가 랜덤으로 생성된 수보다 낮다면 "up",
        // 입력한 수가 랜덤으로 생성된 수보다 높다면 "down",
        // 입력한 수가 랜덤으로 생선된 수와 같다면 "정답"이 출력되어야 합니다.

        // 조건문과 반복문을 사용하세요.

        // 랜덤으로 생성되는 수를 설정한다. 범위는 1~50
        // int가 입력되는 스캐너를 생성한다.
        // 숫자를 입력했을 때 생성된 숫자보다 낮으면 up 높으면 down 맞으면 정답이 출력되게 한다.


        Scanner sc = new Scanner(System.in);
        int random = (int)(Math.random()*50); // 랜덤 숫자 생성


        for(;;) {
            System.out.println("정답을 입력 해주세요."); /// for 안에 기입해줘야 처음으로 돌아온다
            int answer = sc.nextInt();

            if (random > answer) {
                System.out.println("up");


            } else if (random < answer) {
                System.out.println("down");


            } else if(random == answer){
                System.out.println("정답");
                break;
            }
        }



    }
}
