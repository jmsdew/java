package main.java.com.ohgiraffers.login;

import java.util.Scanner;

public class Player {
    Scanner scr = new Scanner(System.in);
    Game game = new Game();


    public void playerG() {

       loof : while(true) {
            System.out.println("=====로그인 완료=====");
            System.out.println("메뉴를 선택 해주세요");
            System.out.println("1. 등산 게임 시작");
            System.out.println("2. 가챠 게임 시작");
            System.out.println("3. 로그아웃");
            int no1 = scr.nextInt();

            switch (no1) {
                case 1 :
                    game.start1(); break;
                case 2 : game.start(); break;
                case 3 :
                    System.out.println("로그아웃합니다.");break loof;

            }
        }
    }
}
