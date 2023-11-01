package main.java.com.ohgiraffers.login.program;

import main.java.com.ohgiraffers.section04.uses2.SaveProvider;

import java.util.Scanner;

public class Program {

    Scanner scr = new Scanner(System.in);
    Gacha gacha = new Gacha();

    public void programS(){

        loof : while(true) {
            System.out.println("=========회원 서비스=========");
            System.out.println("메뉴를 선택 해주세요");
            System.out.println("1. 게임 시작");
            System.out.println("3. 로그아웃");
            int no1 = scr.nextInt();

            switch (no1) {
                case 1 :
                    System.out.println("랜덤 게임이 시작됩니다. 50%의 확률로 층수를 오르게 됩니다.");
                    System.out.println("아무 키나 눌러주세요");
                    String a = scr.next();
                    gacha.goGacha(); break;
                case 3 :
                    System.out.println("로그아웃합니다.");break loof;
                default:
                    System.out.println("잘못 누르셨습니다.");break;

            }
        }
    }
}
