package main.java.com.ohgiraffers.game1;

import java.util.Scanner;

public class Application {
    public static void main(String[] args){
        /*
        * 게임 제작....
        * 슈퍼리그 토너먼트
        *
        * 팀 대결  토트넘(5) 첼시(3) 맨유(4) 아스날(5) 맨시티(6) 리버풀(6)
        * 경기시작 -  10개 중 5개가 골 3개가 골 8개가 골
        *  5턴씩 돌아감
        * 승리시 다음상대
        *
        *
        * */

        Scanner scr = new Scanner(System.in);
        Game game = new Game();

        while (true) {
            System.out.println("=========토트넘 우승 가자==========");
            System.out.println("1. 토트넘 핫스퍼로 게임 시작");
            System.out.println("2. 난 coys가 아니야");
            int choice = scr.nextInt();

            switch (choice) {
                case 1:
                    game.startGame();
                    break;
                case 2:
                    System.out.println("토트넘 팬이 아니라면 나가주세요");
                    return;
                default:
                    System.out.println("잘못된 숫자를 입력하셨습니다.");
                    break;
            }
        }
    }
}
